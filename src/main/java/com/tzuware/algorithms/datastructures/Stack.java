package com.tzuware.algorithms.datastructures;

import java.util.EmptyStackException;

public class Stack<E> {

  private Object[] items = new Object[5];
  private int index = 0;

  public void push(E element) {
    if (index > items.length - 1) {
      growStack();
    }

    items[index] = element;
    index++;
  }

  public E pop() {
    if (index == 0) {
      throw new EmptyStackException();
    }

    @SuppressWarnings("unchecked")
    E element = (E) items[index - 1];
    items[index - 1] = null;
    index--;
    return element;
  }

  public int size() {
    return index;
  }

  public boolean isEmpty() {
    return index == 0;
  }

  private void growStack() {
    items = java.util.Arrays.copyOf(items, items.length * 2);
  }
}

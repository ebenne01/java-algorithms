package com.tzuware.algorithms.datastructures;

import java.util.LinkedList;

public class Queue<E> {

  private LinkedList<E> elements = new LinkedList<>();


  public void enqueue(E element) {
    elements.add(element);
  }

  public E dequeue() {
    return elements.removeFirst();
  }

  public int size() {
    return elements.size();
  }
}

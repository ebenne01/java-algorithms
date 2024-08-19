package com.tzuware.algorithms.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTests {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void push() {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < 10; i++) {
      stack.push(i + 1);
    }
    assertEquals(10, stack.size());
  }

  @Test
  void pop() {
    String expected = "Darth Vader";
    Stack<String> stack = new Stack<>();

    stack.push(expected);
    String actual = stack.pop();
    assertEquals(expected, actual);
    assertTrue(stack.isEmpty());
    assertEquals(0, stack.size());
  }

  @Test
  void popHandlesEmpty() {
    Stack<Integer> stack = new Stack<>();
    assertThrows(EmptyStackException.class, stack::pop);
  }

  @Test
  void size() {
    Stack<Integer> stack = new Stack<>();

    assertEquals(0, stack.size());

    stack.push(99);
    assertEquals(1, stack.size());

    stack.push(999);
    assertEquals(2, stack.size());

    stack.pop();
    assertEquals(1, stack.size());
  }

  @Test
  void isEmpty() {
    Stack<String> stack = new Stack<>();

    assertTrue(stack.isEmpty());

    stack.push("foo");
    assertFalse(stack.isEmpty());

    stack.pop();
    assertTrue(stack.isEmpty());
  }
}
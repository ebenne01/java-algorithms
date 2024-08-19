package com.tzuware.algorithms.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void enqueue() {
    Queue<String> queue = new Queue<>();
    queue.enqueue("Foo");
    queue.enqueue("Bar");
    queue.enqueue("Baz");
    assertEquals(3, queue.size());
  }

  @Test
  void dequeue() {
    Queue<Integer> queue = new Queue<>();

    queue.enqueue(1);

    int actual = queue.dequeue();

    assertEquals(1, actual);
    assertEquals(0, queue.size());
  }
}
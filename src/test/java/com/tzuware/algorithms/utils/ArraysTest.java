package com.tzuware.algorithms.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class ArraysTest {

  @Test
  void shuffle() {
    Integer[] actual = new Integer[]{1, 2, 3, 4, 5};
    Arrays.shuffle(actual);
    assertFalse(java.util.Arrays.equals(new Integer[]{1, 2, 3, 4, 5}, actual));
  }

  @Test
  void swapElements() {
    Integer[] integers = new Integer[]{3, 2};
    Arrays.swapElements(integers, 0, 1);
    assertArrayEquals(new Integer[]{2, 3}, integers);
  }
}
package com.tzuware.algorithms.utils;

import java.util.Collections;
import java.util.List;

public class Arrays {

  public static <T> void shuffle(T[] array) {
    List<T> list = java.util.Arrays.asList(array);
    Collections.shuffle(list);
  }

  public static <T> void swapElements(T[] array, int i, int j) {
    T tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }
}

package com.tzuware.algorithms.sorting;

import static com.tzuware.algorithms.utils.Arrays.swapElements;

public class BubbleSort implements Sortable {

  @Override
  public <T extends Comparable<T>> void sort(T[] arr) {
    var n = arr.length;
    for (int i = 0; i < n; ++i) {
      for (int j = 1; j < n - i; ++j) {
        if (arr[j].compareTo(arr[j - 1]) < 0) {
          swapElements(arr, j - 1, j);
        }
      }
    }
  }
}

package com.tzuware.algorithms.sorting;

import com.tzuware.algorithms.utils.Arrays;

public class SelectionSort implements Sortable {

  private static <T extends Comparable<? super T>> int selectMax(T[] array, int left, int right) {
    int maxPos = left;

    for (int i = left; i <= right; ++i) {
      if (array[i].compareTo(array[maxPos]) > 0) {
        maxPos = i;
      }
    }
    return maxPos;
  }

  @Override
  public <T extends Comparable<T>> void sort(T[] arr) {
    for (int i = arr.length - 1; i >= 1; --i) {
      int maxPos = selectMax(arr, 0, i);
      if (maxPos != i) {
        Arrays.swapElements(arr, i, maxPos);
      }
    }
  }
}

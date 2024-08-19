package com.tzuware.algorithms.sorting;

import java.util.Arrays;

public class MergeSort implements Sortable {

  private static <T extends Comparable<? super T>> void merge(T[] arr, T[] lhs, T[] rhs) {
    int lSize = lhs.length;
    int rSize = rhs.length;
    int lIdx = 0, rIdx = 0, idx = 0;

    while (lIdx < lSize && rIdx < rSize) {
      if (lhs[lIdx].compareTo(rhs[rIdx]) <= 0) {
        arr[idx] = lhs[lIdx];
        lIdx++;
      } else {
        arr[idx] = rhs[rIdx];
        rIdx++;
      }
      idx++;
    }
    while (lIdx < lSize) {
      arr[idx] = lhs[lIdx];
      lIdx++;
      idx++;
    }

    while (rIdx < rSize) {
      arr[idx] = rhs[rIdx];
      rIdx++;
      idx++;
    }
  }

  @Override
  public <T extends Comparable<T>> void sort(T[] arr) {

    int arrLen = arr.length;

    // base case
    if (arrLen < 2) {
      return;
    }

    int midIdx = arrLen / 2;
    T[] lhs = Arrays.copyOf(arr, midIdx);
    T[] rhs = Arrays.copyOfRange(arr, midIdx, arrLen);

    sort(lhs);
    sort(rhs);

    merge(arr, lhs, rhs);
  }
}

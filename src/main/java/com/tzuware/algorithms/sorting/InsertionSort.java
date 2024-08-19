package com.tzuware.algorithms.sorting;

public class InsertionSort implements Sortable {

  @Override
  public <T extends Comparable<T>> void sort(T[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int j = i - 1;
      var value = arr[i];
      while (j >= 0 && arr[j].compareTo(value) > 0) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = value;
    }
  }
}

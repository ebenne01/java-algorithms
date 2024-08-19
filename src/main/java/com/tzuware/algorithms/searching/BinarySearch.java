package com.tzuware.algorithms.searching;

public class BinarySearch implements Searchable {

  @Override
  public <T extends Comparable<T>> boolean search(T[] arr, T target) {
    int low = 0, high = arr.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (arr[mid].compareTo(target) > 0) {
        high = mid - 1;
      } else if (arr[mid].compareTo(target) < 0) {
        low = mid + 1;
      } else {
        return true;
      }
    }
    return false;
  }
}

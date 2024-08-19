package com.tzuware.algorithms.sorting;

import static com.tzuware.algorithms.utils.Arrays.swapElements;

public class QuickSort implements Sortable {

  @Override
  public <T extends Comparable<T>> void sort(T[] arr) {
    if (arr == null) {
      throw new IllegalArgumentException("array is null");
    }

    quickSort(arr, 0, arr.length - 1);
  }


  <T extends Comparable<? super T>> int selectPivotIdx(T[] arr, int left, int right) {
    int mid = (left + right) / 2;

    T leftVal = arr[left];
    T midVal = arr[mid];
    T rightVal = arr[right];

    if (leftVal.compareTo(midVal) < 0) {
      if (leftVal.compareTo(rightVal) < 0) {
        if (midVal.compareTo(rightVal) < 0) {
          return mid;
        } else {
          return right;
        }
      } else {
        return left;
      }
    } else {
      if (leftVal.compareTo(rightVal) > 0) {
        if (midVal.compareTo(rightVal) > 0) {
          return mid;
        } else {
          return right;
        }
      } else {
        return left;
      }
    }
  }

  <T extends Comparable<? super T>> void quickSort(T[] arr, int left, int right) {

    // base case
    if (left >= right) {
      return;
    }

    int pivotIdx = selectPivotIdx(arr, left, right);
    pivotIdx = partition(arr, left, right, pivotIdx);

    quickSort(arr, left, pivotIdx - 1);
    quickSort(arr, pivotIdx + 1, right);
  }

  <T extends Comparable<? super T>> int partition(T[] arr, int left, int right, int pivotIdx) {
    T pivotVal = arr[pivotIdx];
    int storeIdx = left;

    // move pivotVal to the end of the array
    swapElements(arr, pivotIdx, right);

    // all values <= pivotVal are moved to the front of the array
    for (int i = left; i < right; i++) {
      if (arr[i].compareTo(pivotVal) <= 0) {
        swapElements(arr, i, storeIdx);
        storeIdx++;
      }
    }

    // insert pivotVal into the correct location
    swapElements(arr, right, storeIdx);

    return storeIdx;
  }
}

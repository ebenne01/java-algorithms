package com.tzuware.algorithms.sorting;

public interface Sortable {

  <T extends Comparable<T>> void sort(T[] arr);
}

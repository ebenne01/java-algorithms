package com.tzuware.algorithms.searching;

public interface Searchable {

  <T extends Comparable<T>> boolean search(T[] arr, T target);
}

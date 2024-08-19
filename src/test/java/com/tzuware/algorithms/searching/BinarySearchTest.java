package com.tzuware.algorithms.searching;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

  Integer[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  String[] names = {"Adam", "Bill", "Chuck", "Dave", "Edward"};

  @Test
  void binarySearch() {
    Searchable binarySearch = new BinarySearch();
    boolean actual = binarySearch.search(ints, 8);
    assertTrue(actual);
  }

  @Test
  void binarySearchReturnsFalse() {
    Searchable binarySearch = new BinarySearch();
    boolean actual = binarySearch.search(ints, 22);
    assertFalse(actual);
  }

  @Test
  void binarySearchStrings() {
    Searchable binarySearch = new BinarySearch();
    boolean actual = binarySearch.search(names, "Dave");
    assertTrue(actual);
  }
}
package com.tzuware.algorithms.sorting;

import static com.tzuware.algorithms.utils.Arrays.shuffle;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortableTests {

  private static final Integer[] EXPECTED = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  private Integer[] actual = new Integer[EXPECTED.length];

  @BeforeEach
  void setUp() {
    System.arraycopy(EXPECTED, 0, actual, 0, EXPECTED.length);
    shuffle(actual);
  }

  @AfterEach
  void tearDown() {
    actual = null;
  }

  @Test
  void bubbleSort() {
    Sortable bubbleSort = new BubbleSort();
    runTest(bubbleSort);
  }

  @Test
  void insertionSort() {
    Sortable insertionSort = new InsertionSort();
    runTest(insertionSort);
  }

  @Test
  void insertionSortStrings() {
    String[] expectedStrings = {"Allen", "Ed", "Mike", "Steve"};
    String[] actualStrings = {"Ed", "Allen", "Steve", "Mike"};
    Sortable insertionSort = new InsertionSort();
    insertionSort.sort(actualStrings);
    assertArrayEquals(expectedStrings, actualStrings);
  }

  @Test
  void mergeSort() {
    Sortable mergeSort = new MergeSort();
    runTest(mergeSort);
  }

  @Test
  void mergeSortStrings() {
    String[] expectedStrings = {"Allen", "Ed", "Mike", "Steve"};
    String[] actualStrings = {"Ed", "Allen", "Steve", "Mike"};
    Sortable mergeSort = new MergeSort();
    mergeSort.sort(actualStrings);
    assertArrayEquals(expectedStrings, actualStrings);
  }

  @Test
  void quickSort() {
    Sortable quickSort = new QuickSort();
    runTest(quickSort);
  }

  @Test
  void selectPivotIndex() {
    Integer[] arr = {3, 1, 2};
    QuickSort quickSort = new QuickSort();
    int pi = quickSort.selectPivotIdx(arr, 0, 2);
    assertEquals(2, pi);
  }

  @Test
  void quickSortStrings() {
    String[] expectedStrings = {"Allen", "Ed", "Mike", "Steve"};
    String[] actualStrings = {"Ed", "Allen", "Steve", "Mike"};
    Sortable quickSort = new QuickSort();
    quickSort.sort(actualStrings);
    assertArrayEquals(expectedStrings, actualStrings);
  }

  @Test
  void selectionSort() {
    Sortable selectionSort = new SelectionSort();
    runTest(selectionSort);
  }

  private void runTest(Sortable sortable) {
    sortable.sort(actual);
    assertArrayEquals(EXPECTED, actual);
  }
}
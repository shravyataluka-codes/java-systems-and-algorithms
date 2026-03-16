package com.shravya.systems.algorithms.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortTest {

    @Test
    void ShouldWorkWithNormalArray() {
        int[] arr = {5, 3, 8, 1, 2};

        SelectionSort sorter = new SelectionSort(arr);
        sorter.sort();

        assertArrayEquals(new int[]{1,2,3,5,8}, sorter.get_arr());
    }

    @Test
    void ShouldWorkWithEmptyArray() {
        int[] arr = {};

        SelectionSort sorter = new SelectionSort(arr);
        sorter.sort();

        assertArrayEquals(new int[]{}, sorter.get_arr());
    }

    @Test
    void ShouldWorkWithSingleElementArray() {
        int[] arr = {-5};

        SelectionSort sorter = new SelectionSort(arr);
        sorter.sort();

        assertArrayEquals(new int[]{-5}, sorter.get_arr());
    }

    @Test
    void ShouldWorkWithArrayHavingAllSameElements() {
        int[] arr = {11,11,11,11};

        SelectionSort sorter = new SelectionSort(arr);
        sorter.sort();

        assertArrayEquals(new int[]{11,11,11,11}, sorter.get_arr());
    }

    @Test
    void ShouldWorkWithAlreadySortedArray() {
        int[] arr = {1,2,3,4,5};

        SelectionSort sorter = new SelectionSort(arr);
        sorter.sort();

        assertArrayEquals(new int[]{1,2,3,4,5}, sorter.get_arr());
    }

    @Test
    void ShouldWorkWithMixedPositiveAndNegativeNumbers() {
        int[] arr = {3, -1, 7, -5, 2};

        SelectionSort sorter = new SelectionSort(arr);
        sorter.sort();

        assertArrayEquals(new int[]{-5,-1,2,3,7}, sorter.get_arr());
    }

    @Test
    void ShouldWorkWithAllNegativeNumbers() {
        int[] arr = {-3, -8, -1, -5};

        SelectionSort sorter = new SelectionSort(arr);
        sorter.sort();

        assertArrayEquals(new int[]{-8,-5,-3,-1}, sorter.get_arr());
    }
}
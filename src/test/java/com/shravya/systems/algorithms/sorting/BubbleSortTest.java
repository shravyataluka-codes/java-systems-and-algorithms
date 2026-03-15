package com.shravya.systems.algorithms.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BubbleSortTest {
    @Test
    void ShouldSort() {
        int arr[] = {1,4,9,8,10,0};
        BubbleSort sorter = new BubbleSort(arr);
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{0,1,4,8,9,10}, sorter.get_array());
        assertEquals(6,sorter.get_swap_count());

    }

    @Test
    void ShouldWorkWithSingleElement() {
        int[] arr = {0};
        BubbleSort sorter = new BubbleSort(arr);
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{0},sorter.get_array());
        assertEquals(0,sorter.get_swap_count());
    }
    @Test
    void ShouldWorkWithEmptyArray() {
        int[] arr = {};
        BubbleSort sorter = new BubbleSort(arr);
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{}, sorter.get_array());
        assertEquals(0, sorter.get_swap_count());
    }
    @Test
    void ShouldWorkWithAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        BubbleSort sorter = new BubbleSort(arr);
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sorter.get_array());
        assertEquals(0, sorter.get_swap_count());
    }
    @Test
    void ShouldWorkOnRevesedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        BubbleSort sorter = new BubbleSort(arr);
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sorter.get_array());
        assertTrue(sorter.get_swap_count() > 0);
    }




}

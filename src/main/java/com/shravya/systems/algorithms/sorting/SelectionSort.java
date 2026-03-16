package com.shravya.systems.algorithms.sorting;
/**
 * Problem: Selection Sort an Array
 *
 * Category: Algorithm
 * Pattern Used: Repeated swapping of adjacent elements
 *
 * Time Complexity:
 *   - Best Case: O(n) --> if the array is already sorted
 *   - Average Case: O(n^2)
 *   - Worst Case: O(n^2)
 *
 * Space Complexity: O(1)
 *
 * Approach:
 * -- Initialize the array in the constructor.
 * -- Compare each element with its adjacent element.
 * -- If the first element is larger than the second, swap them and count the swap.
 * -- Keep repeating this process until the array is completely sorted.
 *
 * Edge cases:
 * - empty array
 * - null array
 * - single element array
 * - array with all elements the same
 * - already sorted array (optimized version detects this)
 */

import java.util.Random;
public class SelectionSort {
    private int[] arr;
    private int swapcount;
    public SelectionSort(int[] arr) {
        this.arr = arr;
        this.swapcount = 0;
    }

    public void sort() {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            int minIndex = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;

                }
            }
            if(i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swapcount++;
            }
        }


    }
    public int get_swap_count() {
        return swapcount;
    }

    public int[] get_arr() {
        return arr;
    }
}

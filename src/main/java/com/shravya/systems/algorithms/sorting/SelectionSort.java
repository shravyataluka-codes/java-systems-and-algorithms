package com.shravya.systems.algorithms.sorting;
/**
 * Problem: Selection Sort an Array
 *
 * Category: Algorithm
 * Pattern Used: Repeated swapping of adjacent elements
 *
 * Time Complexity:
 *   - Best Case: O(n^2)
 *   - Average Case: O(n^2)
 *   - Worst Case: O(n^2)
 *
 * Space Complexity: O(1)
 *
 * Approach:
 * -- Initialize the array in the constructor.
 * -- Start from the first element of the array.
 * -- Find the smallest element in the remaining part of the array.
 * -- Swap that smallest element with the current position.
 * -- Move to the next position and repeat the process.
 * -- Continue until all elements are placed in their correct position.
 *
 * Edge cases:
 * - empty array
 * - null array
 * - single element array
 * - array with all elements the same
 * - already sorted array (optimized version detects this)
 */


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

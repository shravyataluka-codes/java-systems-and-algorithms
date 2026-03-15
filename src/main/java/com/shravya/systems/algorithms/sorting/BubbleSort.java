package com.shravya.systems.algorithms.sorting;
/**
 * Problem: Bubble Sort an Array
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
public class BubbleSort {
    private int[] arr;
    private int swap_count;
    public BubbleSort(int[] arr) {
        this.arr = arr;
        this.swap_count = 0;
    }
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    swap_count++;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }
        public int[] get_array(){
            return arr;
        }

        public int get_swap_count(){
        return swap_count;
        }
    }


package com.shravya.systems.data_structures.arrays;

/**
 * Problem :Reverse an Array
 *
 * Category-Data -Structure Operation
 * Pattern Used: Two Pointer
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * 1.Initialize two pointers, one is at the beginning of the array and the other at the ending.
 * 2. Swap elements using while loop and move the pointers
 *
 * Edge cases:
 * -Empty array
 * - Single element
 */
public class ReverseArray {
    public static void  reverse(int[] arr){
        if(arr==null || arr.length<2){
            return;
        }
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]  = temp;
            left++;
            right--;
        }
    }
}

package com.shravya.systems.data_structures.arrays;

/**
 * Problem: Moving Zeroes to the end
 *
 * Category-Data-structure Operations
 * Pattern used : Two pointer
 *
 * Time complexity: O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * -- Initialize two indices fast = 0,slow = 0
 * -- start tracking the elements if the element is not equals to zero move fast and slow
 * -- if zero encountered move only fast
 * -- fill the remaining array starting from where the slow left till the length of array with 0s
 *
 *
 *
 * Edge Cases:
 * -- Single element
 * -- empty array
 * -- no zeroes
 *
 */
public class MoveZeros {
    public static void moveZeroes(int[] arr){
        if(arr==null){
            throw new IllegalArgumentException("arr is null");

        }
        int fast =0,slow =0;
        while(fast<arr.length){
            if(arr[fast]!=0){
                arr[slow++]=arr[fast];
                fast++;
            }
            else {
                fast++;
            }
        }
        while(slow<arr.length){
            arr[slow++]=0;
        }
    }
}

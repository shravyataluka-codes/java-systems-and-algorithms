package com.shravya.systems.data_structures.arrays;
/**
 * Problem : Second largest in an array
 *
 * Category-Data -Structure Operation
 * Pattern Used: Tracking two variables
 *
 * Time complexity : O(n)
 * Space Complexity: O(1)
 *
 * Approach:
 * - - Initialize 'max' with the first element to start comparison.
 * - Initialize 'secondMax' with Integer.MIN_VALUE to handle negative values.
 * - Traverse once and update max and secondMax accordingly.
 * - Throw exception if no distinct second largest exists.
 *
 * Edge Cases:
 * -Empty Array
 * -Duplicates
 * - Single element
 *
 */
public class SecondLargest {
    public static int secondLargest(int[] arr){
        if(arr==null || arr.length<2){
            throw new IllegalArgumentException("arr should consists of atleast 2 elements");
        }
        int max = arr[0],secondmax=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i]>secondmax){
                secondmax = arr[i];
            }
        }
        if (secondmax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No distinct second largest element found");
        }
        return secondmax;
    }
}

package com.shravya.systems.problem_patterns.hashing;
import java.util.HashSet;
/**
 * Problem: Two Sum
 *
 * Category-Array/HashMap
 * Pattern used : Hashing technique
 *
 * Time complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * --Traverse through each element in the array.
 * --For each element, find the value needed to reach the target.
 * --Check if that value is already present in the set.
 * --If yes return true, otherwise move to the next element.
 *
 * Edge Cases:
 * -- duplicate array
 * -- Single element
 * -- empty array
 * -- negative values
 *
 */
public class TwoSum {


    public boolean twoSum(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            int complement = target - num;

            if(set.contains(complement)){
                return true;
            }

            set.add(num);
        }

        return false;
    }

}


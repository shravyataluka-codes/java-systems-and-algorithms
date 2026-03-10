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
 * --
 * --
 * --
 * --
 *
 *
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


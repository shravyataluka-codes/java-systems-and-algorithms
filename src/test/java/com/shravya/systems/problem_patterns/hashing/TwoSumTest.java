package com.shravya.systems.problem_patterns.hashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    @Test
    void normalCase() {
        TwoSum ans = new TwoSum();

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;

        boolean result = ans.twoSum(arr, target);

        assertTrue(result);
    }

    @Test
    void noPairExists() {
        TwoSum ans = new TwoSum();

        int[] arr = {1,2,3,4};
        int target = 20;

        boolean result = ans.twoSum(arr, target);

        assertFalse(result);
    }

    @Test
    void duplicateNumbers() {
        TwoSum ans = new TwoSum();

        int[] arr = {3,3,4,5};
        int target = 6;

        boolean result = ans.twoSum(arr, target);

        assertTrue(result);
    }

    @Test
    void negativeNumbers() {
        TwoSum ans = new TwoSum();

        int[] arr = {-3,4,1,7};
        int target = 4;

        boolean result = ans.twoSum(arr, target);

        assertTrue(result);
    }

    @Test
    void singleElementArray() {
        TwoSum ans = new TwoSum();

        int[] arr = {5};
        int target = 5;

        boolean result = ans.twoSum(arr, target);

        assertFalse(result);
    }

    @Test
    void emptyArray() {
        TwoSum ans = new TwoSum();

        int[] arr = {};
        int target = 5;

        boolean result = ans.twoSum(arr, target);

        assertFalse(result);
    }

    @Test
    void pairAtEnd() {
        TwoSum ans = new TwoSum();

        int[] arr = {1,2,3,7,8};
        int target = 15;

        boolean result = ans.twoSum(arr, target);

        assertTrue(result);
    }
}
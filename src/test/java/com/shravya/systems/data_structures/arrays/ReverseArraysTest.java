package com.shravya.systems.data_structures.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    @Test
    void shouldReverseOddLengthArray() {
        int[] arr = {1, 2, 3, 4, 5};
        ReverseArray.reverse(arr);
        assertArrayEquals(new int[]{5,4,3,2,1}, arr);
    }

    @Test
    void shouldReverseEvenLengthArray() {
        int[] arr = {1, 2, 3, 4};
        ReverseArray.reverse(arr);
        assertArrayEquals(new int[]{4,3,2,1}, arr);
    }

    @Test
    void shouldHandleSingleElement() {
        int[] arr = {1};
        ReverseArray.reverse(arr);
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void emptyArray() {
        int[] arr = {};
        ReverseArray.reverse(arr);
    }

    @Test
    void nullArray() {
        int[] arr = null;
        ReverseArray.reverse(arr);
    }
}
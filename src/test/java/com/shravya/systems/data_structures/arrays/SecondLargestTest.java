package com.shravya.systems.data_structures.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SecondLargestTest {

    @Test
    void shouldReturnSecondLargest() {
        int arr[] = {1, 2, 8, 10, 9, 11, 5};
        assertEquals(10, SecondLargest.secondLargest(arr));
    }

    @Test
    void shouldHandleDuplicates() {
        int arr[] = {1, 9, 8, 0, 11, 11, 24, 24};
        assertEquals(11, SecondLargest.secondLargest(arr));

    }

    @Test
    void shouldWorkWithNegativeNumbers() {
        int arr[] = {-8, -4, -1, -10, -2};
        assertEquals(-2, SecondLargest.secondLargest(arr));
    }

    @Test
    void ShouldWorkWithMixedNumbers() {
        int arr[] = {-1, 0, -2, 7, 9, 10};
        assertEquals(9, SecondLargest.secondLargest(arr));
    }

    @Test
    void shouldThrowExceptionForNullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            SecondLargest.secondLargest(null);
        });
    }

    @Test
    void shouldThrowExceptionForSingleElement() {
        int[] arr = {5};
        assertThrows(IllegalArgumentException.class, () -> {
            SecondLargest.secondLargest(arr);
        });
    }

    @Test
    void shouldThrowExceptionWhenNoDistinctSecondLargest() {
        int[] arr = {5, 5, 5};
        assertThrows(IllegalArgumentException.class, () -> {
            SecondLargest.secondLargest(arr);
        });

    }
}



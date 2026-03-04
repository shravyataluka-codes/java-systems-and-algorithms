package com.shravya.systems.data_structures.arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MoveZerosTest {
    @Test
    void shouldMoveZeroesToEnd(){
        int arr[] = {0,1,9,0,-1,3,0,4};
        MoveZeros.moveZeroes(arr);
        assertArrayEquals(new int[]{1,9,-1,3,4,0,0,0}, arr);
    }
    @Test
    void shouldHandleArrayWithNoZeros() {
        int[] arr = {1, 2, 3, 4};
        MoveZeros.moveZeroes(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4}, arr);
    }
    @Test
    void shouldHandleAllZeros() {
        int[] arr = {0, 0, 0};
        MoveZeros.moveZeroes(arr);
        assertArrayEquals(new int[]{0, 0, 0}, arr);
    }
    @Test
    void shouldHandleSingleElementZero() {
        int[] arr = {0};
        MoveZeros.moveZeroes(arr);
        assertArrayEquals(new int[]{0}, arr);
    }

    @Test
    void shouldHandleSingleElementNonZero() {
        int[] arr = {56};
        MoveZeros.moveZeroes(arr);
        assertArrayEquals(new int[]{56}, arr);
    }

    @Test
    void shouldHandleEmptyArray() {
        int[] arr = {};
        MoveZeros.moveZeroes(arr);
        assertArrayEquals(new int[]{}, arr);
    }
    @Test
    void shouldThrowExceptionForNullArray() {
        assertThrows(IllegalArgumentException.class,
                () -> MoveZeros.moveZeroes(null));
    }

}

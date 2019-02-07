package com.loyanix.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestBubbleSort {

    @Test
    public void testSorting(){

        int[] array = new int[10];
        int[] arrayBase = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ( Math.random() * 100 );
            arrayBase[i] = array[i];
        }

        BubbleSort.sort(array);
        Arrays.sort(arrayBase);

        assert Arrays.equals(array, arrayBase);
    }

    @Test
    public void testSortingOfNullArray(){

        assert BubbleSort.sort(null).equals("Input array is null");
    }

    @Test
    public void testSortingOfEmptyArray(){

        assert BubbleSort.sort(new int[0]).equals("Input array is null");
    }

}
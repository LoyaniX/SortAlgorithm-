package com.loyanix.sort;

import java.util.Arrays;

public class SelectedSort {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ( Math.random() * 100 );
        }

        sort(array);
    }

    public static String sort(int[] array){

        if (array == null || array.length == 0){

            return "Input array is null";
        }
        System.out.println("Default array " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++){

            int min = array[i];
            int index = i;

            for (int j = i; j < array.length; j++){
                if (min > array[j]){
                    min = array[j];
                    index = j;
                }
            }

            int buffer = array[i];

            array[i] = min;
            array[index] = buffer;
        }

        return "Sorted array " + Arrays.toString(array);
    }
}
package com.example.arrays;

import com.example.utils.Utils;

public class SimpleShift {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        shiftRight(arr1);
        Utils.printArray(arr1);

        int[] arr2 = new int[]{1,2,3,4,5};
        shiftLeft(arr2);
        Utils.printArray(arr2);
    }

    public static void shiftRight(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = 0; // Preenche a posição inicial com um valor padrão
    }

    public static void shiftLeft(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;
    }
    
}

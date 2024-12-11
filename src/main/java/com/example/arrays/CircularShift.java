package com.example.arrays;

import com.example.utils.Utils;

public class CircularShift {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        rotateRight(arr1, 2);
        Utils.printArray(arr1);

        int[] arr2 = new int[]{1,2,3,4,5};
        rotateLeft(arr2, 2);
        Utils.printArray(arr2);
    }

    public static void rotateRight(int[] array, int steps) {
        int n = array.length;
        steps %= n; // Para evitar rotacionar mais vezes que o tamanho
        reverse(array, 0, n - 1);
        reverse(array, 0, steps - 1);
        reverse(array, steps, n - 1);
    }
    
    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
    }
    
    private static void rotateLeft(int[] arr, int steps){
        int n = arr.length;
        steps %= n;
        
         
        reverse(arr, 0, steps - 1);
        reverse(arr, steps, n - 1);
        reverse(arr, 0, n - 1 );
    }
}

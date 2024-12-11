package com.example.arrays;

import com.example.utils.Utils;

/**
 * Usa algoritmos eficientes, como dois ponteiros, para reorganizar com base em uma condição.
 */
public class Rearrange {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        rearrange(arr1);
        Utils.printArray(arr1);
    }

    public static void rearrange(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            while (array[left] % 2 == 0 && left < right) left++;
            while (array[right] % 2 != 0 && left < right) right--;
            if (left < right) {
                int temp = array[left];
                array[left++] = array[right];
                array[right--] = temp;
            }
        }
    }
    
}

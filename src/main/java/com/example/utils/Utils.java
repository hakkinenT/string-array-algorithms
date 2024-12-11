package com.example.utils;

import java.util.Arrays;

public class Utils {
    public static void printArray(int[] arr1) {
        System.out.println(Arrays.toString(arr1));
    }

    public static void printMatrix(int[][] matrix1) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix1.length; i++) {
            sb.append("{");
            for (int j = 0; j < matrix1[0].length; j++) {
                sb.append(" ").append(matrix1[i][j]);
                if(j != matrix1[0].length - 1){
                    sb.append(", ");
                }
            }
            sb.append("}");

            if (i != matrix1.length-1) {
                sb.append(",").append("\n");
            };
        }

        System.out.println(sb.toString());
    }

}

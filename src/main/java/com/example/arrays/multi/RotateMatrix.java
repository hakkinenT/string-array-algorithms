package com.example.arrays.multi;

import com.example.utils.Utils;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotateMatrix90Clockwise(matrix1);

        Utils.printMatrix(matrix1);
    }

    private static void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void rotateMatrix90Clockwise(int[][] matrix) {
        int n = matrix.length;
        // Transpor a matriz
        transpose(matrix);
        // Inverter as colunas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
    
}

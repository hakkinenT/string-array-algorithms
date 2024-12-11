package com.example.arrays.multi;

import com.example.utils.Utils;

public class ShiftColumn {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        shiftColumnUp(matrix1, 0);;
        shiftColumnDown(matrix2, 0);

        Utils.printMatrix(matrix1);
        System.out.println();
        Utils.printMatrix(matrix2);
    }

    public static void shiftColumnDown(int[][] matrix, int col) {
        int rows = matrix.length;
        int temp = matrix[rows - 1][col];
        for (int i = rows - 1; i > 0; i--) {
            matrix[i][col] = matrix[i - 1][col];
        }
        matrix[0][col] = temp;
    }

    public static void shiftColumnUp(int[][] matrix, int col) {
        int rows = matrix.length;
        int temp = matrix[0][col];
        for (int i = 0; i < rows - 1; i++) {
            matrix[i][col] = matrix[i + 1][col];
        }
        matrix[rows - 1][col] = temp;
    }

}

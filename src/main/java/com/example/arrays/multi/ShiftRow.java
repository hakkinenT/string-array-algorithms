package com.example.arrays.multi;

import com.example.utils.Utils;

public class ShiftRow {
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

        shiftRowRight(matrix1, 0);
        shiftRowLeft(matrix2, 0);

        Utils.printMatrix(matrix1);
        System.out.println();
        Utils.printMatrix(matrix2);
    }

    public static void shiftRowRight(int[][] matrix, int row) {
        int cols = matrix[row].length;
        int temp = matrix[row][cols - 1];
        for (int j = cols - 1; j > 0; j--) {
            matrix[row][j] = matrix[row][j - 1];
        }
        matrix[row][0] = temp;
    }

    public static void shiftRowLeft(int[][] matrix, int row) {
        int cols = matrix[row].length;
        int temp = matrix[row][0];
        for (int j = 0; j < cols - 1; j++) {
            matrix[row][j] = matrix[row][j + 1];
        }
        matrix[row][cols - 1] = temp;
    }

}

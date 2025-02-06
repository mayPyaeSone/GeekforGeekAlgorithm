/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matrix;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Median_Of_A_Row_Wise_Sorted_Matrix {

    static public int matMed(int mat[][]) {
        // int min = mat[0][0], max = mat[0][c - 1];
        int r = mat.length;// row of mat[][]
        int c = mat[0].length;//column of mat[][]
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < r; i++) {
            if (mat[i][0] < min) {
                min = mat[i][0];
            }

            if (mat[i][c - 1] > max) {
                max = mat[i][c - 1];
            }
        }

        int medPos = (r * c + 1) / 2;
        while (min < max) {
            int mid = (min + max) / 2;
            int midPos = 0;
            int pos = 0;
            for (int i = 0; i < r; ++i) {
                pos = Arrays.binarySearch(mat[i], mid);

                if (pos < 0) {
                    pos = Math.abs(pos) - 1;
                } else {
                    while (pos < mat[i].length && mat[i][pos] == mid) {
                        pos += 1;
                    }
                }

                midPos = midPos + pos;
            }
            if (midPos < medPos) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int r = 3, c = 5;
        int m[][] = {{5, 10, 20, 30, 40},
        {1, 2, 3, 4, 6},
        {11, 13, 15, 17, 19}};
        System.out.println("Median is " + matMed(m));

    }
}

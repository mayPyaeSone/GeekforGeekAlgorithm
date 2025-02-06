/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matrix;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Matrix_In_Snake_Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        //snakePattern_own(mat);
        for (int i : snakePattern_Problem(mat)) {
            System.out.print(i + " ");
        }
    }

    /**
     * Video Code
     *
     * @param arr
     */
    static void snakePattern_own(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");

                }
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");

                }
            }
        }
    }

    /**
     * Problem code.
     *
     * @param matrix
     * @return
     */
    static ArrayList<Integer> snakePattern_Problem(int matrix[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    list.add(matrix[i][j]);

                }
            } else {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    list.add(matrix[i][j]);

                }
            }
        }
        return list;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matrix;

/**
 *
 * @author User
 */
public class Reversing_The_Columns_Of_A_Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mat_1[][] = new int[][]{{3, 2},
        {27, 9},
        {6, 18},
        {7, 12}};
        reverseCol(mat_1);
        print((mat_1));
    }

    static void print(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j : mat[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void reverseCol(int mat[][]) {
        for (int row = 0; row < mat.length; row++) {
            int i = 0;
            int j = mat[row].length - 1;
            while (i < j) {
                int temp = mat[row][i];
                mat[row][i] = mat[row][j];
                mat[row][j] = temp;
                i++;
                j--;
            }
        }
    }
}

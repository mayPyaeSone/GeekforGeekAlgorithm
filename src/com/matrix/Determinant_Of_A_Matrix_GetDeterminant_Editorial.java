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
public class Determinant_Of_A_Matrix_GetDeterminant_Editorial {

    static void getCofactor(int matrix[][], int temp[][], int p, int q, int n) {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                //copying only those elements into temporary matrix 
                //which are not in given row and column.
                if (row != p && col != q) {
                    temp[i][j++] = matrix[row][col];

                    //if row is filled, we increase row index and
                    //reset column index.
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    //Function for finding determinant of matrix.
    static int determinantOfMatrix(int matrix[][], int n) {
        int D = 0;

        //base case
        if (n == 1) {
            return matrix[0][0];
        }
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        //creating a list to store Cofactors.
        int temp[][] = new int[n][n];

        int sign = 1;

        //iterating for each element of first row.
        for (int i = 0; i < n; i++) {
            //getting Cofactor of matrix[0][i].
            getCofactor(matrix, temp, 0, i, n);
            D += sign * matrix[0][i] * determinantOfMatrix(temp, n - 1);

            //terms are to be added with alternate sign so changing the sign.
            sign = -sign;
        }
        //returning the determinant.
        return D;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 2, -1},
            {3, 0, 0, 5},
            {2, 1, 4, -3},
            {1, 0, 5, 0}
        };

        // Function call
        System.out.println("Determinant of the matrix is: " + determinantOfMatrix(mat, 4));
//        int[][] mat1 = {{5}};
//        System.out.println("Determinant of the matrix is: " + determinantOfMatrix(mat1, 1));
    }
}

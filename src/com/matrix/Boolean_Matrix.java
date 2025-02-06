/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matrix;

import util.context.Context;

/**
 *
 * @author User
 */
public class Boolean_Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mat_1[][] = {{1, 0}, {0, 0}};
        booleanMatrix(mat_1);
        Context.print2DArray(mat_1);//Output: [[1, 1], [1, 0]] 

        int mat_2[][] = {{1, 0, 0}, {1, 0, 0}, {1, 0, 0}, {0, 0, 0}};
        booleanMatrix(mat_2);
        //Context.print2DArray(mat_2); //Output: [[1, 1, 1], [1, 1, 1], [1, 1, 1], [1, 0, 0]]

        int mat_3[][] = {{0, 0}, {0, 0}};
        booleanMatrix(mat_3);
        //Context.print2DArray(mat_3);//Output: [[0, 0], [0, 0]] 

        int mat_4[][] = {
            {0, 0, 1, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 1, 0, 1, 0},
            {1, 0, 0, 0, 1}};
        booleanMatrix(mat_4);
       // Context.print2DArray(mat_4);//
    }

    static void booleanMatrix(int mat[][]) {
        int allOne[] = new int[mat.length];
        int modiCol[] = new int[mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    allOne[i] = 1;
                    modiCol[j] = 1;
                    
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (allOne[i] == 1 || modiCol[j] == 1) {
                    mat[i][j] = 1;
                }

            }
        }
    }
}

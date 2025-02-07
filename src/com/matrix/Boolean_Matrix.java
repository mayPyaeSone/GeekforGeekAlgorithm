/*
Given a boolean matrix mat[], where each cell contains either 0 or 1, modify it such that if a matrix cell matrix[i][j] is 1 then all the cells in its ith row and jth column will become 1.
Examples:
Input: mat[][] = [[1, 0], [0, 0]]
Output: [[1, 1], [1, 0]] Explanation: Only cell that has 1 is at (0,0) so all cells in row 0 are modified to 1 and all cells in column 0 are modified to 1.

Input: mat[][] = [[1, 0, 0], [1, 0, 0], [1, 0, 0], [0, 0, 0]]Output: [[1, 1, 1], [1, 1, 1], [1, 1, 1], [1, 0, 0]]Explanation: The position of cells that have 1 in the original matrix are (0, 0), (1, 0) and (2, 0). Therefore, all cells in row 0, 1, 2 are and column 0 are modified to 1. 

Input: mat[][] = [[0, 0], [0, 0]]
Output: [[0, 0], [0, 0]] Explanation: There is no cell that contains 1, so mat[] will remain the same.
Constraints:
1 ≤ mat.size(), mat[0].size() ≤ 103
0 ≤ mat[i][j] ≤ 1
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

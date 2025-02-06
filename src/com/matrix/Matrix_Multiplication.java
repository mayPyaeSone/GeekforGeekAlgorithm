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
public class Matrix_Multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mulMatrix();//output:: 29 40 
                //        44 61 
    }

    static void mulMatrix() {
        int m1[][] = {{5, 6}, {8, 9}};
        int m2[][] = {{1, 2}, {4, 5}};
        int ans[][] = new int[2][2];
        // Traversing number of Rows
        for (int i = 0; i < 2; i++) {
            // Traversing number of Columns  
            for (int j = 0; j < 2; j++) {
                ans[i][j] = 0;

                for (int k = 0; k < 2; k++) {
                    ans[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}

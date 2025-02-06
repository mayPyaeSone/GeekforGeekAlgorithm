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
public class Matrices_Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        method();
    }

    static void method() {
        int N = 2, M = 2;

        int m1[][] = {{1, 2}, {4, 5}};
        int m2[][] = {{5, 6}, {8, 9}};
        int ans[][] = new int[2][2];
        // Traversing number of Rows
        for (int i = 0; i < N; i++) {
            // Traversing number of Columns  
            for (int j = 0; j < M; j++) {
                ans[i][j] = m1[i][j] + m2[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

}

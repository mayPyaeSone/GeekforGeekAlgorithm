/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Matrix_Boundary_Traversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}

        };
        //test(arr);

        int[][] arr2 = new int[][]{{1, 2, 3, 4},
        {5, 6, 7, 8},};
        //test(arr2);

        int[][] arr3 = new int[][]{{1, 2}, {3, 4},
        {5, 6}

        };
        boundaryTraversal(arr3);
    }
    /**
     * This is own solution.
     * @param mat
     * @return 
     */
    static ArrayList<Integer> boundaryTraversal(int mat[][]) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {

            if (i == 0) {
                for (int j = 0; j < mat[i].length; j++) {
                    list.add(mat[i][j]);
                }
            } else if (i == mat.length - 1) {
                for (int j = mat[i].length - 1; j >= 0; j--) {
                    list.add(mat[i][j]);
                }
            } else {
                list.add(mat[i][mat[i].length - 1]);
            }

        }
        for (int i = mat.length - 2; i >= 1; i--) {
            list.add(mat[i][0]);
        }
        return list;
    }
    static final int R = 4;
    static final int C = 4;

    /**
     * Editorial Method
     *
     * @param mat
     */
    static void bTraversal(int[][] mat) {
        if (R == 1) {
            for (int i = 0; i < C; i++) {
                System.out.print(mat[0][i] + " ");
            }
        } else if (C == 1) {
            for (int i = 0; i < R; i++) {
                System.out.print(mat[i][0] + " ");
            }
        } else {
            // Top row
            for (int i = 0; i < C; i++) {
                System.out.print(mat[0][i] + " ");
            }
            // Right column
            for (int i = 1; i < R; i++) {
                System.out.print(mat[i][C - 1] + " ");
            }
            // Bottom row
            for (int i = C - 2; i >= 0; i--) {
                System.out.print(mat[R - 1][i] + " ");
            }
            // Left column
            for (int i = R - 2; i >= 1; i--) {
                System.out.print(mat[i][0] + " ");
            }
        }
    }
}

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
         boundaryTraversal_(arr);

        int[][] arr2 = new int[][]{{1, 2, 3, 4},
        {5, 6, 7, 8},};
        //test(arr2);

        int[][] arr3 = new int[][]{{1, 2}, {3, 4},
        {5, 6}

        };
        //boundaryTraversal(arr3);

        int[][] arr4 = new int[][]{{1}, {2}, {3}
        };
        //boundaryTraversal_(arr4);
    }

    /**
   
     * Editorial Mehtod .
     * @param mat
     * @return 
     */
    static ArrayList<Integer> boundaryTraversal_(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        ArrayList<Integer> output = new ArrayList<>();

        // base case if number of row or column is 1 then adding all elements.
        if (n == 1) {
            int i = 0;
            while (i < m) output.add(mat[0][i++]);
        } else if (m == 1) {
            int i = 0;
            while (i < n) output.add(mat[i++][0]);
        } else {
            // we take care of fact that we don't add any number multiple times.

            // traversing first row and adding elements in the list.
            for (int j = 0; j < m; j++) output.add(mat[0][j]);

            // traversing last column and adding elements in the list.
            for (int j = 1; j < n; j++) output.add(mat[j][m - 1]);

            // traversing last row and adding elements in the list.
            for (int j = m - 2; j >= 0; j--) output.add(mat[n - 1][j]);

            // traversing first column and adding elements in the list.
            for (int j = n - 2; j >= 1; j--) output.add(mat[j][0]);
        }
        // returning the list.
        return output;
    }
}

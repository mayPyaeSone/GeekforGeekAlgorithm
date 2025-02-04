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
public class Sum_Of_Upper_And_Lower_Triangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        int mat[][] = new int[][]{{6, 5, 4},
        //        {1, 2, 5},
        //        {7, 9, 7}};
        ;
//        int mat[][] = new int[][]{{1, 2},
//           {3, 4}};
        int mat[][] = new int[][]{{3, 3, 3, 10, 4, 10},
        {3, 3, 10, 4, 7, 10},
        {9, 5, 2, 4, 4, 2},
        {10, 1, 2, 4, 8, 6},
        {9, 10, 2, 9, 2, 10},
        {9, 5, 5, 9, 3, 2}};
        for (int i : sumTriangles_gpt(mat, 6)) {
            System.out.println(i);
        }

    }
// Function to return sum of upper and lower triangles of a matrix.

    static ArrayList<Integer> sumTriangles_gpt(int mat[][], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int upSum = 0, downSum = 0;

        // Loop through the matrix and sum up the appropriate elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Upper Triangle (including diagonal)
                if (j >= i) {
                    upSum += mat[i][j];
                }
                // Lower Triangle (including diagonal)
                if (j <= i) {
                    downSum += mat[i][j];
                }
            }
        }

        list.add(upSum);
        list.add(downSum);
        return list;
    }

    static ArrayList<Integer> sumTriangles_ownButWrong(int mat[][], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int downSum = 0;
        int upSum = 0;
        int i = 0, j = 0;
        for (; j < n;) {
            downSum += mat[i][j++];
        }
        i++;
        j--;
        for (; i < n;) {
            downSum += mat[i++][j];
        }
        i--;
        while (i > 1 && j > 1) {
            downSum += mat[--i][--j];
        }
        list.add(downSum);
        //upSum
        i = n - 1;
        j = n - 1;
        for (; j >= 0;) {
            upSum += mat[i][j--];
        }
        i--;
        j++;

        for (; i >= 0;) {
            upSum += mat[i--][j];
        }
        i++;
        //j++;
        System.out.println(i + "  " + j);
        while (i < n - 2 && j < n - 2) {
            upSum += mat[++i][++j];
        }
        list.add(upSum);
        return list;
    }

    // Test function
}

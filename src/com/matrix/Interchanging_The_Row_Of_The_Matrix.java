/*
 *Example 1:
Input:
n1 = 4, m1 = 4
matrix[][] = {{1, 2, 3, 4},
             {5, 6, 7, 8},
             {9, 10, 11, 12},
             {13, 14, 15,16}}
Output: 
13 14 15 16 9 10 11 12 5 6 7 8 1 2 3 4
Explanation:
Matrix after exchanging rows:
13 14 15 16
 9 10 11 12
 5  6  7  8
 1  2  3  4
Note: Output is printed row-wise linearly. 

 */
package com.matrix;

/**
 *
 * @author User
 */
public class Interchanging_The_Row_Of_The_Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matrix[][] = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};
        interchangeRows_swapOnlyReference(matrix);
        print(matrix);
    }
    //Function to interchange the rows of a matrix.

    /**
     * Time complexity is O(n) but this is only reference changing , without real
     * allocation.
     *
     * @param mat
     */
    static void interchangeRows_swapOnlyReference(int mat[][]) {
        for (int i = 0; i < mat.length / 2; i++) {
            int k = mat.length - 1 - i;
            //int temp[] = new int[mat[i].length];//This is unneccessary 
            int temp[] = mat[i];
            mat[i] = mat[k];
            mat[k] = temp;
        }
    }

    /**
     * Swap real palce in array and time complexity is  O(n1 * m1)
     *
     * @param matrix
     */
    static void interchangeRows_swapRealElement(int matrix[][]) {
        int n1 = matrix.length;
        int m1 = matrix[0].length;

        for (int i = 0; i < n1 / 2; i++) {
            for (int j = 0; j < m1; j++) {
                //swapping the elements (element at 1st row with element
                //at last row, element at 2nd row with element at 
                //second last row and so on).
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n1 - 1 - i][j];
                matrix[n1 - 1 - i][j] = temp;
            }
        }
    }

    static void print(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j : mat[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

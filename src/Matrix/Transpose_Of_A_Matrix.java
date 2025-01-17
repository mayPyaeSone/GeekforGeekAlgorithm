/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix;

/**
 *
 * @author User
 */
public class Transpose_Of_A_Matrix {

    /**
     * Efficient Method without using extra temporary array.
     *
     * @param mat
     */
    static void transpose(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    /**
     * Naive Method using extra temporary array.
     *
     * @param mat
     */
    static void transpose_naive(int mat[][]) {
        int temp[][] = new int[mat.length][mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                temp[i][j] = mat[j][i];
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = temp[i][j];
            }
        }

    }

    // Driver code 
    public static void main(String[] args) {
        int mat[][] = {{1, 1, 1, 1},
        {2, 2, 2, 2},
        {3, 3, 3, 3},
        {4, 4, 4, 4}};

        transpose(mat);

        System.out.print("Modified matrix is \n");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}

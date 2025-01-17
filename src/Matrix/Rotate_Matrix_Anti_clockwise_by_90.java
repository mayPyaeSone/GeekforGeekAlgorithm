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
public class Rotate_Matrix_Anti_clockwise_by_90 {

    /**
     * Driver method.
     *
     * @param args
     */
    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};

        rotate90_naive(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    /**
     * Naive Method using n*n auxiliary space.
     *
     * @param mat
     */
    static void rotate90_naive(int mat[][]) {
        int temp[][] = new int[mat.length][mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                temp[mat.length - j - 1][i] = mat[i][j];
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = temp[i][j];
            }
        }

    }

    /**
     * This method is used by efficient method.
     *
     * @param mat
     * @param i
     * @param j
     */
    static void swap(int mat[][], int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }

    /**
     * This method is used by efficient method.
     *
     * @param low
     * @param high
     * @param i
     * @param mat
     */
    static void swap2(int low, int high, int i, int mat[][]) {
        int temp = mat[low][i];
        mat[low][i] = mat[high][i];
        mat[high][i] = temp;
    }

    /**
     * Efficient Method.
     *
     * @param mat
     */
    static void rotate90_efficient(int mat[][]) {
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(mat, i, j);
            }
        }

        for (int i = 0; i < n; i++) {
            int low = 0, high = n - 1;

            while (low < high) {
                swap2(low, high, i, mat);

                low++;
                high--;
            }
        }
    }
}

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
public class Determinant_Of_A_Matrix_GetDeterminant {
// Java program to find the Determinant of a matrix


    // Dimension of input square matrix
    static final int N = 4;

    // Function to get determinant of matrix
    static int determinantOfMatrix(int[][] mat, int n) {
        int num1, num2, det = 1, index, total = 1; // Initialize result

        // Temporary array for storing row
        int[] temp = new int[n + 1];

        // Loop for traversing the diagonal elements
        for (int i = 0; i < n; i++) {
            index = i; // Initialize the index

            // Finding the index which has non-zero value
            while (index < n && mat[index][i] == 0) {
                index++;
            }

            if (index == n) { // If there is no non-zero element
                // The determinant of matrix as zero
                continue;
            }

            if (index != i) {
                // Loop for swapping the diagonal element row and index row
                for (int j = 0; j < n; j++) {
                    int tempVal = mat[index][j];
                    mat[index][j] = mat[i][j];
                    mat[i][j] = tempVal;
                }
                // Determinant sign changes when we shift rows
                det = det * (int) Math.pow(-1, index - i);
            }

            // Storing the values of diagonal row elements
            for (int j = 0; j < n; j++) {
                temp[j] = mat[i][j];
            }

            // Traversing every row below the diagonal element
            for (int j = i + 1; j < n; j++) {
                num1 = temp[i]; // Value of diagonal element
                num2 = mat[j][i]; // Value of next row element

                // Traversing every column of row
                // and multiplying to every row
                for (int k = 0; k < n; k++) {
                    // Multiplying to make the diagonal
                    // element and next row element equal
                    mat[j][k] = (num1 * mat[j][k]) - (num2 * temp[k]);
                }
                total = total * num1; // Det(kA) = kDet(A);
            }
        }

        // Multiplying the diagonal elements to get determinant
        for (int i = 0; i < n; i++) {
            det = det * mat[i][i];
        }
        return (det / total); // Det(kA) / k = Det(A);
    }

    // Driver code
    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 2, -1},
            {3, 0, 0, 5},
            {2, 1, 4, -3},
            {1, 0, 5, 0}
        };

        // Function call
        System.out.println("Determinant of the matrix is: " + determinantOfMatrix(mat, N));
    }
}

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

    static int determinantOfMatrix(int mat[][]) {
        int n = mat.length;
        int num1, num2, det = 1, index,
                total = 1; // Initialize result

        // temporary array for storing row
        int temp[] = new int[n + 1];

        // loop for traversing the diagonal elements
        for (int i = 0; i < n; i++) {
            index = i; // initialize the index

            // finding the index which has non zero value
            while (index < n && mat[index][i] == 0) {
                index++;
            }
            if (index == n) // if there is non zero element
            {
                // the determinant of matrix as zero
                continue;
            }
            if (index != i) {
                // loop for swapping the diagonal element row and
                // index row
                for (int j = 0; j < n; j++) {
                    swap(mat[index][j], mat[i][j]);
                }
                // determinant sign changes when we shift rows
                // go through determinant properties
                //det = det * pow(-1, index - i);
                det = (int) (det * Math.pow(-1, index - i));

            }

            // storing the values of diagonal row elements
            for (int j = 0; j < n; j++) {
                temp[j] = mat[i][j];
            }
            // traversing every row below the diagonal element
            for (int j = i + 1; j < n; j++) {
                num1 = temp[i]; // value of diagonal element
                num2 = mat[j][i]; // value of next row element

                // traversing every column of row
                // and multiplying to every row
                for (int k = 0; k < n; k++) {
                    // multiplying to make the diagonal
                    // element and next row element equal
                    mat[j][k]
                            = (num1 * mat[j][k]) - (num2 * temp[k]);
                }
                total = total * num1; // Det(kA)=kDet(A);
            }
        }

        // multiplying the diagonal elements to get determinant
        for (int i = 0; i < n; i++) {
            det = det * mat[i][i];
        }
        return (det / total); // Det(kA)/k=Det(A);
    }

    public static void main(String[] args) {
        /*int mat[N][N] = {{6, 1, 1},
						{4, -2, 5},
						{2, 8, 7}}; */

        int mat[][] = {{1, 0, 2, -1},
        {3, 0, 0, 5},
        {2, 1, 4, -3},
        {1, 0, 5, 0}};

        // Function call
        System.out.print("Determinant "+ determinantOfMatrix(mat));
    }

    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

}

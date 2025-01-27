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
public class Get_Cofactor {

    void getCofactor(int mat[][], int temp[][], int p, int q, int n) {
        int i = 0, j = 0;

        // Looping for each element of the matrix 
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                //  Copying into temporary matrix only those element 
                //  which are not in given row and column 
                if (row != p && col != q) {
                    temp[i][j++] = mat[row][col];

                    // Row is filled, so increase row index and 
                    // reset col index 
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

}

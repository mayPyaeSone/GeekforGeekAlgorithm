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
public class Problem_2__Multiply_The_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[][] = {{1, 2, 3, 4}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1},};
        int B[][] = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        int res[][] = {{1, 2, 3, 4}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        System.out.println(multiplyMatrix(A, B, res));
    }

    static boolean multiplyMatrix(int mat1[][], int mat2[][], int result[][]) {
        if (mat1.length != mat2.length || mat1.length != result.length) {
            return false;
        }

        for (int i = 0; i < mat1.length; i++) {
            if (mat1[i].length != mat2[i].length || mat1[i].length != result[i].length) {
                return false;
            }

            for (int j = 0; j < mat1[i].length; j++) {
                int ans = 0;
                for (int k = 0; k < mat2[i].length; k++) {
                    ans += mat1[i][k] * mat2[k][j];

                }
                if (ans != result[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}

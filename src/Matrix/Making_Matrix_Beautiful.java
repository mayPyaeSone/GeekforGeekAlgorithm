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
public class Making_Matrix_Beautiful {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{1, 2, 3}, {4, 2, 3}, {3, 2, 1}};
        int[][] mat3 = {{0, 2}, {3, 4}};

        System.out.println("Minimum operations for mat1: " + minOperationsToMakeBeautiful(mat1)); // Output: 4
        System.out.println("Minimum operations for mat2: " + minOperationsToMakeBeautiful(mat2)); // Output: 6
        System.out.println("Minimum operations for mat3: " + minOperationsToMakeBeautiful(mat3)); // Output: 5
    }

    public static int minOperationsToMakeBeautiful(int[][] mat) {
        int n = mat.length;
        int[] rowSum = new int[n];
        int[] colSum = new int[n];

        // Calculate row sums and column sums
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }

        // Find the maximum sum among all rows and columns
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, rowSum[i]);
            maxSum = Math.max(maxSum, colSum[i]);
        }

        // Calculate minimum operations needed
        int operations = 0;
        for (int i = 0; i < n; i++) {
            operations += (maxSum - rowSum[i]);
        }

        return operations;
    }
}

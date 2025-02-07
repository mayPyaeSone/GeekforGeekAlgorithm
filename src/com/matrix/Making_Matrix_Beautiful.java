/*
 * A beautiful matrix is a matrix in which the sum of elements in each row and column is equal. Given a square matrix mat[][]. Find the minimum number of operation(s) that are required to make the matrix beautiful. In one operation you can increment the value of any one cell by 1.

Examples:
Input: mat[][] = [[1, 2], [3, 4]]
Output: 4
Explanation: Increment value of cell(0, 0) by 3 and increment value of cell(0, 1) by 1. Hence total 4 operation are required. Such that all rows and columns have sum of 7.
Input: mat[][] = [[1, 2, 3], [4, 2, 3], [3, 2, 1]]
Output: 6
Explanation: Increment value of cell(0, 0) by 1, increment value of cell(0, 1) by 2, increment value of cell(2, 1) by 1, increment value of cell(2, 2) by 2. Such that all rows and columns have sum of 9.

Input: mat[][] = [[0, 2], [3, 4]]
Output: 5
Explanation: Increment value of cell(0, 0) by 4, increment value of cell(0, 1) by 1. Hence total 5 operation are required.
Constraints:
1 <= mat.size(), mat[0].size() <= 500
1 <= mat[i][j] <= 106
 */
package com.matrix;

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

        //System.out.println("Minimum operations for mat1: " + minOperationsToMakeBeautiful(mat1)); // Output: 4
        System.out.println("Minimum operations for mat2: " + minOperationsToMakeBeautiful(mat2)); // Output: 6
        //System.out.println("Minimum operations for mat3: " + minOperationsToMakeBeautiful(mat3)); // Output: 5
    }

    /**
     * Standard Code.
     *
     * @param mat
     * @return
     */
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

    public static int findMinOperation_editorial(int[][] mat) {
        int n = mat.length;
        int ans = 0, maxi = 0;
        int[] rowSum = new int[n];
        int[] colSum = new int[n];

        // Row sums and finding maximum row sum
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += mat[i][j];
            }
            rowSum[i] = sum;
            maxi = Math.max(maxi, rowSum[i]);
        }

        // Column sums and finding maximum column sum
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += mat[i][j];
            }
            colSum[j] = sum;
            maxi = Math.max(maxi, colSum[j]);
        }

        // Calculating the minimum operations
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int minAdd = Math.min(maxi - rowSum[i], maxi - colSum[j]);
                ans += minAdd;
                rowSum[i] += minAdd;
                colSum[j] += minAdd;
            }
        }

        return ans;
    }
}

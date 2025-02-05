/*
 * Input:
n1 = 4, m1 = 4
matrix[][] = {{1, 2, 3, 4},
              {5, 6, 7, 8},
              {9, 10, 11, 12},
              {13, 14, 15,16}}
Output: 
4 2 3 1 8 6 7 5 12 10 11 9 16 14 15 13
Explanation:
Matrix is as follow:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
After exchanging first column with 
last column, we have matrix as follows:
4 2 3 1
8 6 7 5
12 10 11 9
16 14 15 13
 */
package Matrix;

/**
 *
 * @author User
 */
public class Exchange_Matrix_Columns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matrix[][] = new int[][]{{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
        exchangeColumns(matrix);

    }

    static void exchangeColumns(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            if (mat[i].length > 1) {
                int temp = mat[i][mat[i].length - 1];
                mat[i][mat[i].length - 1] = mat[i][0];
                mat[i][0] = temp;
            }
        }
    }

}

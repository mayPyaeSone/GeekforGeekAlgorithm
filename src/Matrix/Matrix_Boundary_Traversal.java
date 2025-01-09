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
public class Matrix_Boundary_Traversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}

        };
        test(arr);
    }

    static void test(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + ", ");
                }
            } else if (i == arr.length - 1) {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + ", ");
                }
            } else {
                System.out.print(arr[i][arr[i].length - 1] + ", ");
            }

        }
        for (int i = arr.length - 2; i >= 1; i--) {
            System.out.print(arr[i][0]+", ");
        }
    }
}

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
public class Search_In_Row_Wise_And_Column_Wise_Sorted_Matrix {

    /* Searches the element x in mat[][]. If the 
    element is found, then prints its position 
    and returns true, otherwise prints "not found"
    and returns false */
    private static void search(int[][] mat,
            int n, int x) {

        // set indexes for top right
        int i = 0, j = n - 1;
        // element

        while (i < n && j >= 0) {
            if (mat[i][j] == x) {
                System.out.print("Element found at "
                        + i + " " + j);
                return;
            }
            if (mat[i][j] > x) {
                j--;
            } else // if mat[i][j] < x
            {
                i++;
            }
        }

        System.out.print("n Element not found");
        return; // if ( i==n || j== -1 )
    }

    public static boolean searchMatrix(int[][] mat, int key) {
        if(key<mat[0][0] || key > mat[mat.length-1][mat[mat.length-1].length-1]){
            int x =  mat[mat.length-1][mat[mat.length-1].length-1];
            return false;
        }
        int i = 0;
        int j = mat[0].length - 1;
        while (i < mat.length && j >= 0) {
            if (mat[i][j] == key) {
                return true;
            }
            if (mat[i][j] > key) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    // driver program to test above function
    public static void main(String[] args) {
//        int mat[][] = {{10, 20, 30, 40},
//        {15, 25, 35, 45},
//        {27, 29, 37, 48},
//        {32, 33, 39, 50}};
        
        int mat[][] = {{1 ,5 ,9},
            {14 ,20, 21},
            {30 ,34 ,43}};
        
        int mat2[][] = {{18, 21, 27, 38, 55, 67}};

        searchMatrix(mat2, 68);
    }

}

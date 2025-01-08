/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author User
 */
public class Left_Rotate_An_Array_By_D_Places {

    public static void main(String[] args) {

        //  rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 2);
        // rotate(arr, 69);
    }

    static void rotate(int[] arr, int d) {
        int[] dArr = new int[d];
        for (int i = 0; i < d; i++) {
            dArr[i] = arr[i];
        }
        int j = 0;
        for (; j < arr.length - d; j++) {
            arr[j] = arr[j + d];
        }
        for (int k : dArr) {
            arr[j] = k;
            j++;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }

    }
}

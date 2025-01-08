/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

/**
 *
 * @author User
 */
public class Triplet_In_A_Sorted_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(method(new int[]{2, 3, 4, 8, 9, 20, 40}, 32));
    }

    static boolean method(int[] arr, int s) {
        int n = arr.length;
        for (int h = 0; h < arr.length - 3; h++) {
            int i = h + 1;
            int j = n - 1;
            while (i < j) {
                int sum = arr[h] + arr[i] + arr[j];
                if (sum == s) {
                    System.out.println(sum);
                    return true;
                } else if (sum < s) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return false;
    }
}

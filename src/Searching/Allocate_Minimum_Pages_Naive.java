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
public class Allocate_Minimum_Pages_Naive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    static int minPage(int[] arr, int n, int k) {
        if (k == 0) {
            return minPage(arr, 0, n - 1);
        }
        if (n == 0) {
            return arr[0];
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            res = Math.min(res, Math.max(minPage(arr, i, k - 1), sum(arr, 1, n - 1)));
        }
        return res;
    }

    static int sum(int arr[], int b, int e) {
        int r = 0;
        for (int i = b; i <= e; i++) {
            r += arr[i];
        }
        return r;
    }

}

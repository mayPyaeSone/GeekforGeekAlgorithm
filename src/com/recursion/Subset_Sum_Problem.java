/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

/**
 *
 * @author User
 */
public class Subset_Sum_Problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,15};
        int n = 3;
        int sum = 37;
        System.out.println(sumSubset(arr, n, sum));
    }

    static int sumSubset(int arr[], int n, int sum) {
        if (n == 0) {
            return sum == 0 ? 1 : 0;
        }
        return sumSubset(arr, n - 1, sum) + sumSubset(arr, n - 1, sum - arr[n - 1]);
    }
}

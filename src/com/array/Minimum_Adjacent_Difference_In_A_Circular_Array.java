/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array;

/**
 *
 * @author User
 */
public class Minimum_Adjacent_Difference_In_A_Circular_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //System.out.println(minAdjDiff(new int[]{8, -8, 9, -9, 10, -11, 12}, 7));
         System.out.println(minAdjDiff(new int[]{10,-3,-4,7,6,5,-4,-1}, 7));
    }

    public static int minAdjDiff(int arr[], int n) {
        int curr = 0;
        int globalMin = Integer.MAX_VALUE;
        for (int i = 1; i <= arr.length; i++) {

            if (i == arr.length) {
                curr = Math.abs(arr[0] - arr[arr.length - 1]);
            } else {
                curr = Math.abs(arr[i] - arr[i - 1]);
            }
            globalMin = Math.min(curr, globalMin);
        }
        return globalMin;
    }
}

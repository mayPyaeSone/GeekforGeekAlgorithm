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
public class Longest_Subarray_Of_Evens_And_Odds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(maxEvenOdd(new int[]{10,12,14,7,8}, 5));//3
         System.out.println(maxEvenOdd(new int[]{10,12,14,7,8,8,7,6,5,5}, 5));//3
    }

    public static int maxEvenOdd(int arr[], int n) {
        int max = 1;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                count++;
                max = Integer.max(max, count);
            } else {
                count = 1;
            }
        }
        return max;
    }
}

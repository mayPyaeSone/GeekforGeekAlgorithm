/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Minimum_Difference_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr1[] = new int[]{1, 8, 12, 5, 18};
        System.out.println(getMinDiff(arr1, 5));
    }
    //O(n^2)
    static int getMinDiff(int arr[], int n) {
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                res = Math.min(res, Math.abs(arr[i] - arr[j]));
            }
        }
        return res;
    }
    //O(n long n)
    int getMinDiff_efficient(int arr[], int n){
        Arrays.sort(arr);
        
        int res = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            res = Math.min(res, arr[i] - arr[i-1]);
        }
        return res;
    }
}

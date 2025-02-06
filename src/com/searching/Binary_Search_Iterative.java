/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searching;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Binary_Search_Iterative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60}, n = 6;
        int x = 25;
        System.out.println(bSearch(arr, n, x));
        System.out.println(bSearch(new int[]{1, 2, 3, 4}, 4, 3));//2

        System.out.println(bSearch(new int[]{1, 2, 3, 4, 5}, 5, 5));//4
        
        arr = new int[]{5,3,5,2};
        Arrays.sort(arr);
        for(int i :arr){
            System.out.println(i+" ");
        }
    }

    static int bSearch(int arr[], int n, int x) {
        Arrays.sort(arr);
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

}

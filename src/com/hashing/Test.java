/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {
        //int arr[] = {12, 10, 9, 45, 2, 10, 10, 45};
        int arr[] = {10, 20, 20, 10, 20};
        int n = arr.length;
        System.out.println(countDistinct(arr, n));
    }

    // Function to create HashMap from array
    static int countDistinct(int arr[], int n) {
        int res = 1;

        // Pick all elements one by one
        for (int i = 1; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }

            // If not printed earlier, 
            // then print it
            if (i == j) {
                res++;
            }
        }
        return res;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashing;

import java.util.HashSet;

/**
 *
 * @author User
 */
public class Hashing_For_Pair_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test Case(1)
        int arr_1[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum_1 = 14;
        System.out.println(sumExits(arr_1, sum_1));;

        //Test Case (2)
        int arr_2[] = new int[]{61, 14, 75, 71, 36, 34, 12};
        int sum_2 = 68;
        System.out.println(sumExits(arr_2, sum_2));;
    }

    public static int sumExits(int arr[], int sum) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i : arr) {
            hs.add(i);
        }

        for (int i = 0; i < arr.length; i++) {
            int y = sum - arr[i];
            if (y != arr[i] && hs.contains(y)) {
                System.out.println(arr[i] + " + " + y);
                return 1;
            }
        }
        return 0;
    }
    // Back-end complete function Template for C

// Function to check if there is a pair with the given sum in the array.
    int sumExists_2(int arr[], int N, int sum) {
        boolean s[] = new boolean[100001];
        for (int i = 0; i < 100001; i++) {
            s[i] = false;
        }

        // iterating over the array.
        for (int i = 0; i < N; i++) {
            int temp = sum - arr[i];
            // if (sum-arr[i]) or temp exists in set, we return 1.
            if (temp >= 0 && s[temp]) {
                return 1;
            }

            // inserting current element in the set.
            s[arr[i]] = true;
        }

        // if no such pair is present, we return 0.
        return 0;
    }
}

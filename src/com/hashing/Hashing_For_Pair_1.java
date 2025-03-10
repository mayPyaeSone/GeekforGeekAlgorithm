/*
 *You are given an array of distinct integers and a sum. Check if there's a pair with the given sum in the array.

Examples :

Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], sum = 14
Output: 1
Explanation: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and sum = 14.  There is a pair [4, 10] with sum 14.
Input: arr[] = [2, 5], sum = 10
Output: 0
Explanation: arr[]  = [2, 5] and sum = 10. There is no pair with sum 10.
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
        System.out.println(sumExists_2(arr_1, 10, sum_1));;

        //Test Case (2)
        int arr_2[] = new int[]{61, 14, 75, 71, 36, 34, 12};
        int sum_2 = 68;
        System.out.println(sumExits(arr_2, sum_2));;
    }

    public static int sumExits(int arr[], int sum) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }

        for (int i = 0; i < arr.length; i++) {
            int y = sum - arr[i];
            if (y != arr[i] && hs.contains(y)) {
                return 1;
            }
        }
        return 0;
    }
    // Back-end complete function Template for C

// Function to check if there is a pair with the given sum in the array.
  static  int sumExists_2(int arr[], int N, int sum) {
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

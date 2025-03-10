/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class Count_Distinct_Elements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int arr[] = {12, 10, 9, 45, 2, 10, 10, 45};
        int arr[] = {10, 20, 20, 10, 20};
        int n = arr.length;
        System.out.println(countDistinct_nLogn(arr, n));
    }

    /**
     * Time Complexity of solution is O(n2)
     *
     * @param arr
     * @param n
     * @return
     */
    static int countDistinct_nSquare(int arr[], int n) {
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

    /**
     * Time Complexity of solution is O(nLogn)
     *
     * @param arr
     * @param n
     * @return
     */
    static int countDistinct_nLogn(int arr[], int n) {
        // First sort the array so that all
        // occurrences become consecutive
        Arrays.sort(arr);

        // Traverse the sorted array
        int res = 0;
        for (int i = 0; i < n; i++) {

            // Move the index ahead while
            // there are duplicates
            while (i < n - 1
                    && arr[i] == arr[i + 1]) {
                i++;
            }
            res++;
        }
        return res;
    }

    /**
     * Time Complexity of solution is O(n)
     *
     * @param arr
     * @param n
     * @return
     */
    static int countDistinct(int arr[], int n) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }

        return hs.size();
    }
}

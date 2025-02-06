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
public class Merge_Without_Extra_Space {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 4, m = 5;
        long[] arr1 = new long[]{1, 3, 5, 7};
        long[] arr2 = new long[]{0, 2, 6, 8, 9};
        merge(n, m, arr1, arr2);

    }

    public static void merge(int n, int m, long arr1[], long arr2[]) {
        int i = n - 1; // Pointer for arr1, starting from the last element
        int j = 0;     // Pointer for arr2, starting from the first element

        // Compare and swap elements if necessary
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                // Swap arr1[i] and arr2[j]
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }

        // Sort both arrays after swapping
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}

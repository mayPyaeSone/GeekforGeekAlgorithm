/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author User
 */
public class Problem__Sort_By_Absolute_Difference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Input values
        int k = 7;
        int[] arr = {10, 5, 3, 9, 2};

        // Call the function to sort by absolute difference
        int[] sortedArr = sortByAbsoluteDifference(arr, k);

        // Output the result
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] sortByAbsoluteDifference(int[] arr, int k) {
        // Create a list of elements from the array
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Sort the list using a custom comparator class
        Collections.sort(list, new AbsoluteDifferenceComparator(k));

        // Convert the list back to an array
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < list.size(); i++) {
            sortedArr[i] = list.get(i);
        }

        return sortedArr;
    }

}
// Custom comparator class to sort by absolute difference

class AbsoluteDifferenceComparator implements Comparator<Integer> {

    private int k;

    public AbsoluteDifferenceComparator(int k) {
        this.k = k;
    }

    @Override
    public int compare(Integer a, Integer b) {
        // Calculate absolute differences
        int diff1 = Math.abs(a - k);
        int diff2 = Math.abs(b - k);

        // If absolute differences are the same, preserve original order
        if (diff1 == diff2) {
            return 0; // Keep order as is
        }

        // Otherwise, compare absolute differences
        return Integer.compare(diff1, diff2);
    }
}

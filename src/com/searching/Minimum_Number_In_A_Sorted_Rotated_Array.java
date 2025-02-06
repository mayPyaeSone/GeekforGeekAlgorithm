/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searching;

import java.util.List;

/**
 *
 * @author User
 */
public class Minimum_Number_In_A_Sorted_Rotated_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static int findMin(List<Integer> arr, int low,
            int high) {
        // If the array is not rotated
        if (arr.get(low) < arr.get(high)) {
            return arr.get(low);
        }
        int ans = Integer.MAX_VALUE;
        // Binary search
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == arr.get(low) && arr.get(mid) == arr.get(high)) {
                ans = Math.min(ans, arr.get(mid));
                low++;
                high--;
            } // If the left half is sorted, the minimum
            // element must be in the right half
            else if (arr.get(mid) > arr.get(high)) {
                low = mid + 1;
            } // If the right half is sorted, the minimum
            // element must be in the left half
            else {
                ans = Math.min(ans, arr.get(mid));
                high = mid - 1;
            }
        }

        // If no minimum element is found, return -1
        return ans;
    }
}

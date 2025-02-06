/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting;

/**
 *
 * @author User
 */
public class Problem__Closer_To_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    /**
     *
     * My Own Code ( Satisfy the time complexity :: O(log n) )
     */
    static long closer(int arr[], int n, long x) {
        int low = 0;
        int high = n - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            }

            if (mid > 0 && arr[mid - 1] == x) {
                return mid - 1;
            }
            if (mid < n - 1 && arr[mid + 1] == x) {
                return mid + 1;
            }
            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

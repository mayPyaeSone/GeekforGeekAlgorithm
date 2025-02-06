/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searching;

/**
 *
 * @author User
 */
public class Floor_in_A_Sorted_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  System.out.println(findFloor(new long[]{1, 2, 8, 10, 11, 12, 19}, 7, 0));
        // System.out.println(findFloor(new long[]{1, 2, 8, 10, 11, 12, 19}, 7, 5));
        System.out.println(findFloor_editorial(new long[]{1, 2, 8, 10, 11, 12, 19}, 7, 5));
    }

    static int findFloor_editorial(long arr[], int n, long x) {
        return findFloorUtil(arr, 0, n - 1, x);
    }

    static int findFloorUtil(long arr[], int low, int high, long x) {
        // If low and high cross each other 
        if (low > high) {
            return -1;
        }

        // If last element is smaller than x 
        if (x >= arr[high]) {
            return high;
        }

        // Find the middle point 
        int mid = (low + high) / 2;

        // If middle point is floor. 
        if (arr[mid] == x) {
            return mid;
        }

        // If x lies between mid-1 and mid 
        if (mid > 0 && arr[mid - 1] <= x && x
                < arr[mid]) {
            return mid - 1;
        }

        // If x is smaller than mid, floor 
        // must be in left half. 
        if (x < arr[mid]) {
            return findFloorUtil(arr, low,
                    mid - 1, x);
        }

        // If mid-1 is not floor and x is 
        // greater than arr[mid], 
        return findFloorUtil(arr, mid + 1, high,
                x);
    }

    static int findSecL(long arr[], long x) {
        int secMin = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                if (secMin == -1 || arr[i] > arr[secMin]) {
                    secMin = (int) i;
                }
            }
        }
        return secMin;
    }

    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int low = 0;
        int high = n - 1;
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
        return findSecL(arr, x);
    }
}

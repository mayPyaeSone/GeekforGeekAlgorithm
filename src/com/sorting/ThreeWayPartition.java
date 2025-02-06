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
public class ThreeWayPartition {
    public static int threeWayPartition(int[] arr, int a, int b) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] < a) {
                // Swap arr[mid] and arr[low]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] <= b) {
                // Element is in range [a, b], move mid forward
                mid++;
            } else {
                // Swap arr[mid] and arr[high]
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }

        return 1; // Return 1 to indicate successful modification
    }

    public static void main(String[] args) {
        // Input No.1
        int[] arr = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        int a = 10, b = 20;
        
        threeWayPartition(arr, a, b);

        // Output the partitioned array
        System.out.println("Partitioned Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

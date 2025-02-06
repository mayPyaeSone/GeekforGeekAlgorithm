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
public class QuickSort_LumotoPartation {

  // Function to perform partitioning around a pivot
    public static int partition(int[] arr, int low, int high) {
        // Choose the last element as pivot
        int pivot = arr[high];
        int i = low - 1; // Index for smaller element

        // Iterate through the array
        for (int j = low; j < high; j++) {
            // If current element is smaller or equal to pivot
            if (arr[j] <= pivot) {
                i++; // Increment index for smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swap the pivot element with arr[i+1]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1; // Return the pivot index
    }

    // Function to implement QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Get the pivot index after partition
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);  // Before pivot
            quickSort(arr, pivotIndex + 1, high); // After pivot
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //int[] arr = {10, 80, 30, 90, 40, 50, 70};
         int[] arr_2 = {8, 4, 7, 9, 3, 10, 5};
        
        System.out.println("Original array:");
        printArray(arr_2);

        quickSort(arr_2, 0, arr_2.length - 1);

        System.out.println("Sorted array:");
        printArray(arr_2);
    }
    
}

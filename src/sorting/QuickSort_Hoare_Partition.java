/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author User
 */
public class QuickSort_Hoare_Partition {

    // QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = hoarePartition(arr, low, high);
            // Recursively sort the two partitions
            quickSort(arr, low, pivotIndex);   // Sort the left part
            quickSort(arr, pivotIndex + 1, high); // Sort the right part
        }
    }

    // Hoare Partition function
    public static int hoarePartition(int[] arr, int low, int high) {
        int pivot = arr[low]; // Choose the first element as pivot
        int i = low - 1;      // Left pointer starts before the low index
        int j = high + 1;     // Right pointer starts after the high index

        while (true) {
            // Move the right pointer leftward until we find an element <= pivot
            do {
                j--;
            } while (arr[j] > pivot);

            // Move the left pointer rightward until we find an element >= pivot
            do {
                i++;
            } while (arr[i] < pivot);

            // If pointers meet or cross, return the partition index
            if (i >= j) {
                return j;
            }

            // Swap elements at i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
//        int[] arr = {10, 7, 8, 9, 1, 5};
        int[] arr_2 = {8, 4, 7, 9, 3, 10, 5};
        System.out.println("Original array:");
        for (int num : arr_2) {
            System.out.print(num + " ");
        }
        System.out.println();

        quickSort(arr_2, 0, arr_2.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr_2) {
            System.out.print(num + " ");
        }
    }
}

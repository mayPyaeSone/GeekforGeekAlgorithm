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
public class Kth_Smallest_Element {

    public static void main(String[] args) {
        int arr[] = new int[]{10, 4, 5, 8, 11, 6, 26};

        int n = arr.length;
        int k = 5;
        int index = kthSmallest(arr, n, k);

        System.out.print(arr[index]);

    }

    static int partition(int arr[], int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j <= h - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }

    static int kthSmallest(int arr[], int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int p = partition(arr, low, high);
            if (p == k - 1) {
                return p;
            } else if (p > k - 1) {
                high = p - 1;
            } else {
                low = p + 1;
            }
        }
        return -1;
    }

}

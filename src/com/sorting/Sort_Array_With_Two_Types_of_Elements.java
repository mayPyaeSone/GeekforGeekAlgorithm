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
public class Sort_Array_With_Two_Types_of_Elements {

    static void sort_naive(int arr[], int n) {
        int[] temp = new int[n];
        int i = 0;

        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                temp[i++] = arr[j];
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] >= 0) {
                temp[i++] = arr[j];
            }
        }
        for (int j = 0; j < n; j++) {
            arr[j] = temp[j];
        }
    }

    static void sort_efficient(int arr[], int n) {
        int i = -1, j = n;
        while (true) {
            do {
                i++;
            } while (arr[i] < 0);
            do {
                j--;
            } while (arr[j] >= 0);
            if (i >= j) {
                return;
            }

            //swapping arr[i] & arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }

    static void segregate0and1(int arr[], int n) {
        int type0 = 0;
        int type1 = n - 1;

        while (type0 < type1) {
            if (arr[type0] == 1) {

                // swap type0 and type1
                arr[type0] = arr[type0] + arr[type1];
                arr[type1] = arr[type0] - arr[type1];
                arr[type0] = arr[type0] - arr[type1];
                type1--;
            } else {
                type0++;
            }
        }
    }

    // Driver program
    public static void main(String[] args) {
        //int arr[]
        //s = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0};
        int arr[] = {0, 1, 0, 1};

        binSort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void binSort(int[] arr) {
        int i = -1;
        int j = arr.length;
        while (true) {
            do {
                i++;
            } while (arr[i] == 0 && i < arr.length - 1);

            do {
                j--;
            } while (arr[j] == 1 && j > 1);
            if (i >= j) {
                return;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

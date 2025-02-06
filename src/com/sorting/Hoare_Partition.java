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
public class Hoare_Partition {

    public static void main(String[] args) {
        int arr1[] = new int[]{5, 3, 8, 4, 2, 7, 1, 10};
        partition(arr1, 0, arr1.length - 1);
        print(arr1);

        int arr2[] = new int[]{5, 10, 9, 12};//when the pivot is smallest
        partition(arr2, 0, arr2.length - 1);
        print(arr2);

        int arr3[] = new int[]{12, 10, 5, 9};//when the pivot is largest
        partition(arr3, 0, arr3.length - 1);
        print(arr3);

        int arr4[] = new int[]{5, 5, 5, 5};//All the elements are same
        partition(arr4, 0, arr4.length - 1);
        print(arr4);
        
        int arr_5[] = {8, 4, 7, 9, 3, 10, 5};
        partition(arr_5, 0, arr_5.length - 1);
        print(arr_5);

    }

    static void print(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static int partition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l - 1, j = h + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) {
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

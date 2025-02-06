/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author User
 */
public class Lomuto_Partition {

    public static void main(String[] args) {
//        int arr[] = new int[]{10, 80, 30, 90, 40, 50, 70};
//         iPartition(arr, 0, arr.length - 1);
//
//        int n = arr.length;
//        // iPartition(arr, 0, n - 1);
//
//        for (int x : arr) {
//            System.out.print(x + " ");
//           
//        }
//         System.out.println("");
//        int arr1[] = new int[]{50, 30, 20, 10, 5, 11};
//        iPartition(arr1, 0, arr1.length - 1);
//
//         n = arr1.length;
//        // iPartition(arr, 0, n - 1);
//
//        for (int x : arr1) {
//            System.out.print(x + " ");
//        }
//         System.out.println("");
        int arr3[] = new int[]{10, 4, 5, 8, 11, 6, 26};
        iPartition(arr3, 0, arr3.length - 1);

         int n = arr3.length;
        // iPartition(arr, 0, n - 1);

        for (int x : arr3) {
            System.out.print(x + " ");
        }
         System.out.println("");

    }

    static int iPartition(int arr[], int l, int h) {
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
        System.out.println("Return smallest of the larger window "+arr[i+1]);
        
        return i + 1;
    }
}

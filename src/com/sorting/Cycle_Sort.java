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

class Cycle_Sort {

    public static void main(String[] args) {
        int arr[] = {20, 40, 50, 10, 30};
        int n = arr.length;
        cycleSortDistinct(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void cycleSortDistinct(int arr[], int n) {
        for (int cs = 0; cs < n - 1; cs++) {
            int item = arr[cs];
            int pos = cs;
            for (int i = cs + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }
            //swap(item,arr[pos])

            int temp = item;
            item = arr[pos];
            arr[pos] = temp;
            while (pos != cs) {
                pos = cs;
                for (int i = cs + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                //swap(item,arr[pos])
                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
        }
    }
}

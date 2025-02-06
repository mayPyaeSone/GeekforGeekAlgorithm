/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array;

import java.util.*;
import java.io.*;
import java.lang.*;

public class OperationsOnArrays {

    static int insert(int arr[], int n, int x, int cap, int pos) {
        if (n == cap) {
            return n;
        }

        int idx = pos - 1;

        for (int i = n - 1; i <=pos-1; i--) {
            arr[i + 1] = arr[i];
        }

        arr[pos - 1] = x;

        return n + 1;
    }

    public static void main(String args[]) {
        int arr[] = new int[5], cap = 5, n = 3;

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 20;

        System.out.println("Before Insertion");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int x = 7, pos = 2;

        n = insert(arr, n, x, cap, pos);

        System.out.println("After Insertion");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

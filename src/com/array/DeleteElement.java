package com.array;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DeleteElement {

    static int deleteEle(int arr[], int n, int x) {
        int i = 0;

        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }

        if (i == n) {
            return n;
        }

        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }

        return n - 1;
    }

    public static void main(String args[]) {
        int arr[] = {3, 8, 12, 5, 6}, x = 12, n = 5;

        System.out.println("Before Deletion");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        n = deleteEle(arr, n, x);

        System.out.println("After Deletion");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

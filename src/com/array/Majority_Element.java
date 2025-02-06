/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array;

/**
 *
 * @author User
 */
public class Majority_Element {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(findMajority_efficient(new int[]{8, 8, 6, 6, 6, 4, 6}));
        System.out.println(findMajority_naive(new int[]{8, 8, 6, 6, 6, 4, 6}));

    }

    static int findMajority_efficient(int arr[]) {
        int n = arr.length;
        int res = 0, count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                res = i;
                count = 1;
            }
        }

        count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;
            }
        }

        if (count <= n / 2) {
            res = -1;
        }

        return res;
    }

    static int findMajority_naive(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return i;
            }
        }

        return -1;
    }
}

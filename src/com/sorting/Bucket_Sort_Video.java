/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author User
 */
public class Bucket_Sort_Video {
    // Function to sort arr[] of size n
    // using bucket sort

    static void bucketSort(int arr[], int n, int k) {

        int max_val = arr[0];
        for (int i = 1; i < n; i++) {
            max_val = Math.max(max_val, arr[i]);
        }
        max_val++;

        ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < n; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int idx = (arr[i] * k) / max_val;
            buckets.get(idx).add(arr[i]);
        }

        for (int i = 0; i < k; i++) {
            Collections.sort(buckets.get(i));
        }

        int index = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < buckets.get(i).size(); j++) {
                arr[index++] = buckets.get(i).get(j);
            }
        }
    }

    static void bucketSort(float arr[], int n) {
        if (n <= 0) {
            return;
        }

        ArrayList<ArrayList<Float>> buckets = new ArrayList<ArrayList<Float>>();

        for (int i = 0; i < n; i++) {
            buckets.add(new ArrayList<Float>());
        }

        // 2) Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            float idx = arr[i] * n;
            buckets.get((int) idx).add(arr[i]);
        }

        // 3) Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets.get(i));
        }

        // 4) Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets.get(i).size(); j++) {
                arr[index++] = buckets.get(i).get(j);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {30, 40, 10, 80, 5, 12, 70};
        int n = arr.length;
        int k = 4;
        bucketSort(arr, n, k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        float arr1[] = {(float) 0.897, (float) 0.565,
            (float) 0.656, (float) 0.1234,
            (float) 0.665, (float) 0.3434};

        int n1 = arr1.length;
        bucketSort(arr1, n1);

        System.out.println("Sorted array is ");
        for (float el : arr1) {
            System.out.print(el + " ");
        }
    }

}

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
public class Bucket_Sort_ChatGPT {

   // Function to perform bucket sort
    public static void bucketSort(float[] array) {
        int n = array.length;

        // Create empty buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Place elements into corresponding buckets
        for (float value : array) {
            int bucketIndex = (int) (value * n); // Calculate bucket index
            System.out.println(bucketIndex);
            buckets[bucketIndex].add(value);
        }

        // Sort individual buckets
        for (ArrayList<Float> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Concatenate buckets back into the array
        int index = 0;
        for (ArrayList<Float> bucket : buckets) {
            for (float value : bucket) {
                array[index++] = value;
            }
        }
    }

    // Driver code to test the algorithm
    public static void main(String[] args) {
        float[] array = { 0.42f, 0.32f, 0.53f, 0.25f, 0.12f, 0.75f, 0.68f };

        System.out.println("Original Array:");
        for (float value : array) {
            System.out.print(value + " ");
        }

        bucketSort(array);

        System.out.println("\nSorted Array:");
        for (float value : array) {
            System.out.print(value + " ");
        }
    }
    
}

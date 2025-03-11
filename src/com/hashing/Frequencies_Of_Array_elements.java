/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class Frequencies_Of_Array_elements {

    /**
     * A simple solution is to run two loops
     *
     * @param arr
     * @param n
     */
    public static void countFreq_1(int arr[], int n) {
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true) {
                continue;
            }

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }

    static void countFreq_2(int arr[], int n) {
        Map<Integer, Integer> mp = new HashMap<>();

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
            // instead of upper if and else can write follwing line
            //mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    static void countFreq_3(int arr[], int n) {
        Map<Integer, Integer> mp = new HashMap<>();

        // Traverse through array elements and 
        // count frequencies 
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1);
        }

        // To print elements according to first 
        // occurrence, traverse array one more time 
        // print frequencies of elements and mark 
        // frequencies as -1 so that same element 
        // is not printed multiple times. 
        for (int i = 0; i < n; i++) {
            if (mp.get(arr[i]) != -1) {
                System.out.println(arr[i] + " " + mp.get(arr[i]));
                mp.put(arr[i], -1);
            }
        }
    }

    static void countFreq_4(int arr[], int size) {
        // Creating a HashMap containing integer
        // as a key and occurrences as a value
        HashMap<Integer, Integer> freqMap= new HashMap<>();

        for (int i = 0; i < size; i++) {
            if (freqMap.containsKey(arr[i])) {

                // If number is present in freqMap,
                // incrementing it's count by 1
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
            } else {

                // If integer is not present in freqMap,
                // putting this integer to freqMap with 1 as it's value
                freqMap.put(arr[i], 1);
            }
        }

        // Printing the freqMap
        for (Map.Entry entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

// Driver code
    public static void main(String[] args) {
        int arr[] = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        countFreq_1(arr, n);
    }

}

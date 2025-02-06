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
public class Counting_Sort {

    public static void main(String[] args) {
//        int arr[] = {-1, 4, 4, 1, 0, 1};
//        int n = arr.length;
//        int k = 5;
//        countSort_efficient(arr, n, k);
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
        String str =  "edsab";
        System.out.println(lexicographicalSort(str));

    }

    static void countSort_naive(int arr[], int n, int k) {
        int[] count = new int[k];
        for (int i = 0; i < k; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i < k; i++) {
            count[i] = count[i - 1] + count[i];
        }

        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void countSort_efficient(int arr[], int n, int k) {
        int[] count = new int[k];
        for (int i = 0; i < k; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            //count[Math.abs(arr[i])]++;
            count[(arr[i])]++;
        }

        for (int i = 1; i < k; i++) {
            count[i] = count[i - 1] + count[i];
        }

        int[] output = new int[n];
        // Loop fot the reverse way is make sure the output is stable
        for (int i = n - 1; i >= 0; i--) {
            //output[count[Math.abs(arr[i])] - 1] = arr[i];
            output[count[(arr[i])] - 1] = arr[i];
            //count[Math.abs(arr[i])]--;
            count[(arr[i])]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    
    public static String lexicographicalSort(String arr) {
        // Frequency array for 26 lowercase English letters
        int[] freq = new int[26];

        // Count the frequency of each character in the string
        for (char c : arr.toCharArray()) {
            freq[c - 'a']++;
        }

        // Construct the sorted string
        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                sortedString.append((char) (i + 'a'));
                freq[i]--;
            }
        }

        return sortedString.toString();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searching;

import java.util.*;

class Count_More_Than_n_dividedBy_k_Occurences {

    public static void main(String[] args) {
        System.out.println(countOccurence(new int[]{3, 1, 2, 2, 1, 2, 3, 3}, 8, 4));
    }

    //Function to find all elements in array that appear more than n/k times.
    static int countOccurence(int[] arr, int n, int k) {
        //calculating the frequency barrier
        int barrier = n / k;
        //creating a HashMap to store the frequency of elements
        HashMap<Integer, Integer> map = new HashMap<>();
        //count for elements that appear more than n/k times
        int count = 0;
        //iterating through the array
        for (int i = 0; i < n; i++) {
            //updating the frequency of each element in the HashMap
            System.out.print(map.getOrDefault(arr[i], 0) + 1 + " ");
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        //iterating through the HashMap
        for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            //if frequency of an element is greater than the barrier, increment count
            if (element.getValue() > barrier) {
                count++;
            }
        }
        //returning the count of elements that appear more than n/k times
        return count;
    }

    static int countOccurence_naive(int[] arr, int n, int k) {
        int count = 0, cnt = 0, i, j, curr;
        for (i = 0; i < n; i++) {
            if (arr[i] == -1) {
                continue;
            }
            curr = arr[i];
            count = 0;
            for (j = 0; j < n; j++) {
                if (curr == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }
            if (count > (n / k)) {
                cnt++;
            }
        }
        return cnt;
    }
}

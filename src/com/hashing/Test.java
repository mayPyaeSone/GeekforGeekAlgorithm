/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import util.context.Context;

/**
 *
 * @author User
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test case 1.
        int A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int A2[] = {2, 1, 8, 3};
        //Context.print1DArray(printTree(A1, A2));

        //Test case2.
        int A1_1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int A2_2[] = {99, 22, 444, 56};
        Context.print1DArray(printTree(A1_1, A2_2));
    }

    static int[] printTree(int[] A1, int[] A2) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < A1.length; i++) {
            hm.put(A1[i], hm.getOrDefault(A1[i], 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i : A2) {
            set.add(i);
        }
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < A2.length; i++) {
            if (hm.containsKey(A2[i])) {
                int count = hm.get(A2[i]); // Get the individual value (frequency) of A2[i]
                while (count >= 1) {
                    result.add(A2[i]);
                    count--;
                }
            }
        }
        ArrayList<Integer> result2 = new ArrayList<>();
        if (result.size() > 0) {

            for (int i = 0; i < A1.length; i++) {
                if (!set.contains(A1[i])) {
                    result2.add(A1[i]);
                }
            }
            Collections.sort(result2);
        }
        if (result.size() < 1) {
            // TreeMap automatically sorts by key in ascending order
            TreeMap< Integer, Integer> treeMap = new TreeMap<>(hm);

            for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                int count = entry.getValue();

                // Add key `count` times to the result list
                while (count > 0) { // `>= 0` would add an extra element
                    result.add(entry.getKey());
                    count--;
                }
            }
        }

        int[] array = new int[result.size() + result2.size()];

        // Copy elements manually
        int j = 0;
        for (j = 0; j < result.size(); j++) {
            array[j] = result.get(j);

        }
        if (result2.size() > 0) {
            int k = j;
            for (int it : result2) {
                array[k] = it;
                k++;
            }

        }
        return array;
    }

    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        //storing all the elements of first array in map.
        for (int l = 0; l < N; l++) {
            if (!map.containsKey(A1[l])) {
                map.put(A1[l], 1);
            } else {
                map.put(A1[l], map.get(A1[l]) + 1);
            }
        }

        int i = 0;

        for (int l = 0; l < M; l++) {
            //if any element of second array has value more than 0 in map, we
            //store those elements in array and decrement the count in map.
            if (map.containsKey(A2[l])) {
                for (int k = 0; k < map.get(A2[l]); k++) {
                    A1[i++] = (A2[l]);
                }
                map.remove(A2[l]);
            }
        }

        //iterating over the map which helps in storing
        //elements in increasing order.
        for (Entry<Integer, Integer> nag : map.entrySet()) {
            //storing elements whose frequency is more than 0, as many times as
            //their count in output list.
            for (int p = 0; p < nag.getValue(); p++) {
                A1[i++] = nag.getKey();
            }
        }

        //returning the output.
        return A1;

    }
}

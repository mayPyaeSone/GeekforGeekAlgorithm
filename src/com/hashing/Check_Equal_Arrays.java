/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class Check_Equal_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a1[] = {1, 2, 5, 4, 0}, b1[] = {2, 4, 5, 0, 1};
        System.out.println(checkEqual(a1, b1));

        int a2[] = {1, 2, 5}, b2[] = {2, 4, 15};
        System.out.println(checkEqual(a2, b2));
    }

    public static boolean checkEqual(int[] a, int[] b) {
//         Set<Integer> setA = Arrays.stream(a).boxed().collect(Collectors.toSet());
//        Set<Integer> setB = Arrays.stream(b).boxed().collect(Collectors.toSet());
        Set<Integer> setA = new HashSet<Integer>();
        for (int i : a) {
            setA.add(i);
        }
        Set<Integer> setB = new HashSet<Integer>();
        for (int i : b) {
            setB.add(i);
        }
        if (setA.equals(setB)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkEqual_(int[] a, int[] b) {
        // Check if arrays have the same length
        if (a.length != b.length) {
            return false;
        }

        // using a HashMap to store frequency of elements.
        HashMap<Integer, Integer> hm = new HashMap<>();

        // incrementing frequencies of elements present in first array in HashMap.
        for (int num : a) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // decrementing frequencies of elements present in second array in the HashMap.
        for (int num : b) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) - 1);
            } else {
                return false; // If element not in a
            }
        }

        // Check if all frequencies are zero
        for (int count : hm.values()) {
            if (count != 0) {
                return false;
            }
        }

        // If all checks passed, arrays are equal
        return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author User
 */
public class Intersection_Of_Two_Unsorted_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] ch1 = {'a', 'b', 'c', 'c', 'a', 'e', 'f', 'd'};
        char[] ch2 = {'a', 'b', 'c', 'a', 'e', 'f', 'd'};
        // findUniqueIntersection(ch1, ch2);
        // findIntersectionWithDuplicates(ch1, ch2);// Output : a b c a e f d (in this there are two 'a' is duplicate)

        int arr1[] = {4, 3, 2, 2, 1}, arr2[] = {2, 4, 6, 7, 8,2};
        //findUniqueIntersection(arr1, arr2); //Output : [2, 4]
        findIntersectionWithDuplicates(arr1, arr2);// Output: 2 4 2 ( "2" is duplicate)
    }

    /**
     * Find pure intersection (without duplicate) and input is int array.
     *
     * @param a
     * @param b
     */
    public static void findUniqueIntersection(int[] a, int[] b) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Add elements of array `a` to setA
        for (int num : a) {
            setA.add(num);
        }

        // Check each element in array `b` for intersection
        for (int num : b) {
            // If ch is in setA, it's a common element
            if (setA.contains(num)) {
                result.add(num); // Add to result to avoid duplicates
                // setA.remove(ch); // Remove to avoid re-adding if found again in `b`
            }
        }

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }

    }

    /**
     * Find pure intersection (without duplicate) and input is char array.
     *
     * @param a
     * @param b
     */
    public static void findUniqueIntersection(char[] a, char[] b) {
        Set<Character> setA = new HashSet<>();
        Set<Character> result = new HashSet<>();

        // Add elements of array `a` to setA
        for (char num : a) {
            setA.add(num);
        }

        // Check each element in array `b` for intersection
        for (char num : b) {
            // If ch is in setA, it's a common element
            if (setA.contains(num)) {
                result.add(num); // Add to result to avoid duplicates
                // setA.remove(ch); // Remove to avoid re-adding if found again in `b`
            }
        }

        // Print the result
        for (char num : result) {
            System.out.print(num + " ");
        }

    }

    /**
     * Find intersection with duplicates and input is int type.
     *
     * @param a
     * @param b
     */
    public static void findIntersectionWithDuplicates(int[] a, int[] b) {
        Map<Integer, Integer> mapA = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count occurrences of each element in array `a`
        for (int ch : a) {
            mapA.put(ch, mapA.getOrDefault(ch, 0) + 1);
        }

        // Check each element in array `b` for intersection
        for (int ch : b) {
            if (mapA.containsKey(ch) && mapA.get(ch) > 0) {
                result.add(ch); // Add to result to include duplicates
                mapA.put(ch, mapA.get(ch) - 1); // Decrease count in mapA
            }
        }

        // Print the result
        for (int ch : result) {
            System.out.print(ch + " ");
        }
    }

    /**
     * Find intersection with duplicates and input is char type.
     *
     * @param a
     * @param b
     */
    public static void findIntersectionWithDuplicates(char[] a, char[] b) {
        Map<Character, Integer> mapA = new HashMap<>();
        List<Character> result = new ArrayList<>();

        // Count occurrences of each element in array `a`
        for (char ch : a) {
            mapA.put(ch, mapA.getOrDefault(ch, 0) + 1);
        }

        // Check each element in array `b` for intersection
        for (char ch : b) {
            if (mapA.containsKey(ch) && mapA.get(ch) > 0) {
                result.add(ch); // Add to result to include duplicates
                mapA.put(ch, mapA.get(ch) - 1); // Decrease count in mapA
            }
        }

        // Print the result
        for (char ch : result) {
            System.out.print(ch + " ");
        }

    }
}

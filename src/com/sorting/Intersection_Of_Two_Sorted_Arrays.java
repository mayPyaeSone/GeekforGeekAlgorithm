/*
 * Question
int a[] = new int[]{3,5,10,10,10,15,15,20};
int b[] = new int[]{5,10,10,15,30};

Output is to print common elements in array 
Output will be 5 10 15 
 */
package com.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class Intersection_Of_Two_Sorted_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'c', 'a', 'e', 'f', 'd'};
        Arrays.sort(ch);
//        for (char i : ch) {
//            System.out.println(i);
//        }
        String[] st = {"abc", "bdd", "cee", "cff", "ae", "ee", "fe", "de"};
//        Arrays.sort(st);
//        for (String i : st) {
//            System.out.println(i);
//        }
        int[] a = {3, 5, 10, 10, 10, 15, 15, 20};
        int[] b = {5, 10, 10, 15, 30};
        // intersection(a, b, a.length, b.length);
        findUniqueIntersection(a, b);

        int a1[] = {1, 1, 3, 3, 3};
        int b1[] = {1, 1, 1, 1, 3, 5, 7};
        // intersection(a1, b1, a.length, b.length);
    }

//Efficient method using sorted input array
    static void intersection(int a[], int b[], int m, int n) {

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }
// If the array is unsorted

    public static void findUniqueIntersection(int[] a, int[] b) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Add elements of array `a` to setA
        for (int num : a) {
            setA.add(num);
        }

        // Check each element in array `b` for intersection
        for (int num : b) {
            // If num is in setA, it's a common element
            if (setA.contains(num)) {
                result.add(num); // Add to result to avoid duplicates
                // setA.remove(num); // Remove to avoid re-adding if found again in `b`
            }
        }
        Set<Integer> intersection = result;

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}

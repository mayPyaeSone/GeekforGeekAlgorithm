/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author User
 */
public class Merge_Function_Of_Merge_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[]{10, 15, 20, 40, 8, 11, 15, 22, 25};
        int l = 0, h = 8, m = 3;

        merge(a, l, m, h);
        for (int x : a) {
            System.out.print(x + " ");
        }
        
//        int a[] = {1, 3, 5, 7}, b[] = {2, 4, 6, 8};
//        int size = a.length;
//        int size1 = b.length;
//
//        // Function call
//        mergeArrays(a, b, size, size1);
    }

    static void merge(int arr[], int l, int m, int h) {

        int n1 = m - l + 1, n2 = h - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[i + l];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    static void mergeArrays(int a[], int b[], int n, int m) {

        // Declaring a map.
        // using map as a inbuilt tool
        // to store elements in sorted order.
        Map<Integer, Boolean> mp = new TreeMap<Integer, Boolean>();

        // Inserting values to a map.
        for (int i = 0; i < n; i++) {
            mp.put(a[i], true);
        }
        for (int i = 0; i < m; i++) {
            mp.put(b[i], true);
        }

        // Printing keys of the map.
        for (Map.Entry<Integer, Boolean> me : mp.entrySet()) {
            System.out.print(me.getKey() + " ");
        }
    }

    // Driver Code
    

}

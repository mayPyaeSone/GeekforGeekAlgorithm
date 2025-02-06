/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class Reverse_Array_In_Groups {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        reverseInGroups(null, 0, 3);
    }

    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        arr = new ArrayList<>();
        for (int s : a) {
            arr.add(s);
        }
        for (int i = 0; i < arr.size(); i++) {
            int start = i;
            int end = i + k - 1;
            while (start < end && end < arr.size()) {
                int temp = arr.get(start);
                arr.set(start, arr.get(end));
                arr.set(end, temp);

                start++;
                end--;

            }
            i = i + k;
            if (i == arr.size() - 2) {
                int temp = arr.get(arr.size() - 1);
                arr.set(arr.size() - 1, arr.get(arr.size() - 2));
                arr.set(arr.size() - 2, temp);
                break;

            }

        }
        for(int s: arr){
            System.out.print(s);
        }
    }
}

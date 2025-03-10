/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashing;

import java.util.HashMap;

/**
 *
 * @author User
 */
public class Count_Non_Repeated_Elements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test Case 1
        int arr_1[] = new int[]{1, 1, 2, 2, 3, 3, 4, 5, 6, 7};
        //System.out.println(countNonRepeated(arr_1));
        
        //Test Case 2
        int arr_2[] = new int[] {10,20, 30, 40, 10};
        System.out.println(countNonRepeated(arr_2));
        
        
    }

    static int countNonRepeated(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int i : hm.values()) {
            if (i == 1) {
                count++;
            }
        }
        return count;
    }
}

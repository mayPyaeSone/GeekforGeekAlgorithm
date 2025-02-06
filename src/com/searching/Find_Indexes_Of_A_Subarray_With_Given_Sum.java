/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searching;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Find_Indexes_Of_A_Subarray_With_Given_Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(subarraySum(new int[]{1, 2, 3, 7, 5}, 5, 12).toString());
        //System.out.println(subarraySum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10, 15).toString());
        //System.out.println(subarraySum(new int[]{7, 2, 1}, 3, 2).toString());
        // System.out.println(subarraySum(new int[]{5, 3, 4}, 3, 2).toString());
        int[] arr = new int[]{135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143,
            28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70,
            113, 68, 100, 36, 95, 104, 12, 123, 134};
        //System.out.println(subarraySum(arr, arr.length, 468).toString());
         System.out.println(subarraySum(new int[]{1, 4, 5, 6, 0}, 5, 0).toString());
        System.out.println(subarraySum(new int[]{1, 4}, 2, 0).toString());

    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        int curr = 0;
        for (end = 0; end < arr.length; end++) {

            curr += arr[end];
            while (s < curr && start < end) {
                curr -= arr[start];
                start++;
            }
            if (curr == s) {
                list.add(start + 1);
                list.add(end + 1);
                break;

            }

        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        return list;
    }
}

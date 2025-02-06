/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array;

import java.util.Arrays;

/**
 *
 * @author User
 */
class Maximum_Index_Problem {

    public static void main(String[] args) {
        int arr[] = new int[]{34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(maxIndexDiff(arr));
    }

    static int maxIndexDiff(int arr[]) {
        if (arr.length == 1) {
            return 0;
        }
        int RMax[] = new int[arr.length];
        int LMin[] = new int[arr.length];

        //Constructing LMin[] such that LMin[i] stores the minimum value 
        //from (arr[0], arr[1], ... arr[i]).
        LMin[0] = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            LMin[i] = Integer.min(arr[i], LMin[i - 1]);
        }
        System.out.println(" Lmin");
        for (int s : LMin) {
            System.out.print(s+" ");
        }
        System.out.println(" RMax");
        //Constructing RMax[] such that RMax[j] stores the maximum value 
        //from (arr[j], arr[j+1], ..arr[n-1]). 
        RMax[arr.length - 1] = arr[arr.length - 1];
        for (int j = arr.length - 2; j >= 0; --j) {
            RMax[j] = Integer.max(arr[j], RMax[j + 1]);
        }
        
        for (int s : RMax) {
           System.out.print(s+" ");
        }
        System.out.println();
        int i = 0, j = 0, maxDiff = -1;
        //Traversing both arrays from left to right to find optimum j-i.
        //This process is similar to merge() of MergeSort.
        while (j < arr.length && i < arr.length) {
            if (LMin[i] <= RMax[j]) {
                //Updating the maximum difference.
                maxDiff = Integer.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }
        //returning the maximum difference.
        return maxDiff;
    }
}

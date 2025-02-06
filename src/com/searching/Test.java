/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searching;

import static java.lang.Math.abs;

/**
 *
 * @author User
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  int arr[] = new int[]{3, 1, 2, 2, 1, 2, 3, 3};
        int arr1[] = new int[]{1, 3, 5};
        int arr2[] = new int[]{2, 4};
        boolean b[] = new boolean[3];
        for(boolean f : b){
            System.out.println(f);
        }

    }

    static int maxWater_(int height[], int n) {
        int ans = Math.max(height[0], height[n - 1]);
        int water = (n - 2) * ans;
        return water;
    }

    static int maxWater(int[] arr, int n) {
        int max = 0;

        //using two pointers that point at first and last building respectively.
        int low = 0, high = n - 1;

        while (low < high) {
            //if arr at index low is less than arr at index high, updating 
            //maximum water stored so far and incrementing low.
            if (arr[low] < arr[high]) {
                max = Math.max(max, (high - low - 1) * arr[low]);
                low++;
            } //else if arr at index low is more than arr at index high,  
            //updating maximum water stored so far and decrementing high.
            else if (arr[high] < arr[low]) {
                max = Math.max(max, (high - low - 1) * arr[high]);
                high--;
            } //else updating maximum water stored so far and both pointers.
            else {
                max = Math.max(max, (high - low - 1) * arr[low]);
                low++;
                high--;
            }
        }
        //returning the result.
        return max;
    }

    public static int maxWaterTrapped(int[] heights) {
        int n = heights.length;
        int maxWater = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int water = Math.min(heights[i], heights[j]) * (j - i - 1);
                maxWater = Math.max(maxWater, water);
            }
        }

        return maxWater;
    }
}

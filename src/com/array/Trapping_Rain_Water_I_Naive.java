/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array;

/**
 *
 * @author User
 */
public class Trapping_Rain_Water_I_Naive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 2, 5}, n = 5;

        System.out.println(getWater(arr));
    }

    static int getWater(int arr[]) {
        int res = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            int lMax = arr[i];

            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, arr[j]);
            }

            int rMax = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                rMax = Math.max(rMax, arr[j]);
            }

            res = res + (Math.min(lMax, rMax) - arr[i]);
        }

        return res;
    }
}

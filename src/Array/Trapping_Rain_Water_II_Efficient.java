/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Trapping_Rain_Water_II_Efficient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // int arr[] = {5, 0, 6, 2, 3}, n = 5;
        int arr[] = {3, 0, 2, 0, 4}, n = 5;
        System.out.println(trappingWater(arr, n));
    }

   static long trappingWater(int arr[], int n) { 
        long res = 0;

        int lMax[] = new int[n];
        int rMax[] = new int[n];

        lMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(arr[i], lMax[i - 1]);
        }
        for(int i: lMax){
            System.out.print(i+" ");
        }

        rMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(arr[i], rMax[i + 1]);
        }
        System.out.println();
        for(int i: rMax){
            System.out.print(i+" ");
        }
         System.out.println();

        for (int i = 1; i < n - 1; i++) {
            res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
        }

        return res;
    }
}

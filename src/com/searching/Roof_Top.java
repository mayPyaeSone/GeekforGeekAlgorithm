/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searching;

/**
 *
 * @author User
 */
public class Roof_Top {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(maxStep(new int[]{7, 9, 9, 3, 6}, 5));
        System.out.println(maxStep(new int[]{1, 2, 2, 3, 2}, 5));
        System.out.println(maxStep(new int[]{1,2,3,4},4));
    }

    static int maxStep(int arr[], int n) {
        int max = 0;
        int pos = 0;
//        if (arr[0] - 1 == arr[n - 1]) {
//            max++;
//        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                pos++;
            } else {
                pos = 0;
            }
            max = Math.max(max, pos);
        }
        return max;
    }
}

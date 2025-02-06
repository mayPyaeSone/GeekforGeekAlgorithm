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
public class Who_Has_The_Majority_Problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(majorityWins(new int[] {1,1,2,2,3,3,4,4,4,4,5},11,4,5));
    }

    public static int majorityWins(int arr[], int n, int x, int y) {
        int xcount = 0;
        int ycount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                xcount++;
            } else if (arr[i] == y) {
                ycount++;
            }
        }

        if (xcount == ycount) {
            if (x < y) {
                return xcount;
            } else {
                return ycount;
            }
        }
        return xcount < ycount ? ycount : xcount;
    }
}


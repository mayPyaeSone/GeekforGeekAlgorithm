/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Leaders_In_An_Array_Problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        prinMethod_own(arr);
    }

    static void prinMethod_own(int arr[]) {
        ArrayList<Integer> temp = new ArrayList<>();
        int l = arr[arr.length - 1];
        temp.add(l);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > l) {
                l = arr[i];
                temp.add(l);
            }
        }
        int left = 0;
        int right = temp.size()-1;
        while(left<right){
            int swap = temp.get(left);
            temp.set(left, temp.get(right));
            temp.set(right, swap);
            left++;
            right--;
        }
        for(int h : temp){
            System.out.println(h);
        }
    }

}

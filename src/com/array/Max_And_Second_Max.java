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
public class Max_And_Second_Max {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(secondL(new int[]{50, 4, 5, 10, 20, 30, 49}));;
        System.out.println(secondL(new int[]{50, 50, 50}));;
    }

    static ArrayList<Integer> secMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secMax) {
                if (arr[i] > max) {
                    secMax = max;
                    max = arr[i];
                } else {
                    secMax = arr[i];
                }
            }
        }
        ArrayList<Integer> retList = new ArrayList<>();
        retList.add(max);
        retList.add(secMax);
        return retList;
    }

    static ArrayList<Integer> secondL(int[] arr) {
        int res = -1;
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[largest]);
        if(res== -1)
            list.add(-1);
        else
        list.add(arr[res]);
        return list;
    }

}

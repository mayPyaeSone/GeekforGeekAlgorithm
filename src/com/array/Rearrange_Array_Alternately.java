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
public class Rearrange_Array_Alternately {

    public static void main(String[] args) {
        //rearrange(new int[]{1, 2, 3, 4, 5, 6});
        rearrange(new long[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200});
    }

    static void rearrange(long[] arr) {
        int evenIndex = 1;
        int oddIndex = 0;
        int maxEle =(int) arr[(int)arr.length-1]+1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[arr.length - evenIndex] % maxEle) * maxEle;
                evenIndex++;
            } else {
                arr[i] += (arr[oddIndex] % maxEle) * maxEle;
                oddIndex++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] /= maxEle;
        }

    }
}

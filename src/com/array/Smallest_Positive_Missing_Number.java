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
public class Smallest_Positive_Missing_Number {

    /**
     * @param args the command line arguments
     */

    //Function to find the smallest positive number missing from the array.
    static int missingNumber_own(int arr[]) {
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == count) {
                count++;
            }
        }
        return count;
    }
    //Function that puts all non-positive (0 and negative) numbers on left 
    //side of arr[] and return count of such numbers.

    static int segregateArr(int arr[], int n) {
        int j = 0, i;
        for (i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                //changing the position of negative numbers and 0.
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                //incrementing count of non-positive integers.
                j++;
            }
        }
        return j;
    }

    //Finding the smallest positive missing number in an array 
    //that contains only positive integers.
    static int findMissingPositive(int arr[], int st, int end) {

        //marking arr[i] as visited by making arr[arr[i]-1] negative. 
        //note that 1 is subtracted because indexing starts from 0 and 
        //positive numbers start from 1.
        for (int i = st; i < end; i++) {
            if (Math.abs(arr[i]) + st - 1 < end && arr[Math.abs(arr[i]) + st - 1] > 0) {
                arr[Math.abs(arr[i]) + st - 1] = -1 * arr[Math.abs(arr[i]) + st - 1];
            }
        }

        for (int i = st; i < end; i++) {
            if (arr[i] > 0) {
                //returning the first index where value is positive. 
                // st is subtracted because we do not have to consider negative numbers present at the start of array.
                // 1 is added because indexing starts from 0. 
                return i - st + 1;
            }
        }
        return end - st + 1;
    }
    //Function to find the smallest positive number missing from the array.

    static int missingNumber(int arr[], int size) {
        //first separating positive and negative numbers. 
        int shift = segregateArr(arr, size);

        //shifting the array to access only positive part.
        //calling function to find result and returning it.
        return findMissingPositive(arr, shift, size);
    }

    public static void main(String[] args) {
//        System.out.println(missingNumber_own(new int[]{1, 2, 3, 4, 5}));;
//        System.out.println(missingNumber_own(new int[]{0, -10, 1, 3, -20}));;
        //System.out.println(missingNumber(new int[]{1, 2, 3, 4, 5},5));
        System.out.println(missingNumber(new int[]{0, -10, 1, 3, -20},5));;
        
        
    }
}

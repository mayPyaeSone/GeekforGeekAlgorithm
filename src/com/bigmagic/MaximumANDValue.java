/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigmagic;

/**
 *
 * @author User
 */
public class MaximumANDValue {

    // Utility function to check number of elements
    // having set msb as of pattern
    static int checkBit(int pattern, int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("pattern & arr[i]"+pattern+" "+arr[i]);
            if ((pattern & arr[i]) == pattern) {
                count++;
                System.out.println(pattern + " & " + arr[i]+" count "+count);
            }
        }

        return count;
    }

    // Function for finding maximum and value pair
    static int maxAND(int arr[], int n) {
        int res = 0, count;

        // iterate over total of 32bits
        // from msb to lsb
        for (int bit = 31; bit >= 0; bit--) {
            // find the count of element
            // having set msb
            System.out.println("res:"+res+" bit:"+bit+" (1 << bit)"+(1 << bit)+"(res |(1 << bit))"+(res |(1 << bit)));
            count = checkBit(res | (1 << bit), arr, n);
            // if count >= 2 set particular
            // bit in result
            if (count >= 2) {
                res |= (1 << bit);
            }
        }

        return res;
    }

    // driver function
    public static void main(String argc[]) {
        int arr[] = {4, 8, 6, 2};
        int n = arr.length;
        System.out.println("Maximum AND Value = "
                + maxAND(arr, n));
    }

}

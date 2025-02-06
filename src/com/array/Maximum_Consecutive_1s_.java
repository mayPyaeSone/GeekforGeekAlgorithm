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
public class Maximum_Consecutive_1s_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(ownMethod(new int[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}));//4
        //  System.out.println(maxConsecutiveOnes(new int[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}));//4
    }

    static int maxConsecutiveOnes(int arr[]) {
        int res = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = 0;

            for (int j = i; j < n; j++) {
                if (arr[j] == 1) {
                    curr++;
                } else {
                    break;
                }
            }

            res = Math.max(res, curr);
        }

        return res;
    }

    static int ownMethod(int[] arr) {
        int maxOne = 0;
        int oneCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
//                if (oneCount > maxOne) {
//                    maxOne = oneCount;
//                }
                //maxOne = Math.max(maxOne, oneCount);
                oneCount = 0;
            } else {
                oneCount++;
                maxOne = Math.max(maxOne, oneCount);
            }
        }

        // return maxOne > oneCount ? maxOne : oneCount;
       // maxOne = Math.max(maxOne, oneCount);
        return maxOne;
    }
}

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
public class Max_Circular_Subarray_Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {5, -2, 3, 4}, n = 4;

        //System.out.println(maxCircularSum_navie(arr, n));
        //System.out.println(maxCircularSum_efficient(arr, n));
        System.out.println(maxCircularSum_efficient(new int[]{8, -4, 3, -5, 4}));
    }

    static int maxCircularSum_navie(int arr[], int n) {
        int res = arr[0];

        for (int i = 0; i < n; i++) {
            int curr_max = arr[i];
            int curr_sum = arr[i];

            for (int j = 1; j < n; j++) {
                int index = (i + j) % n;

                curr_sum += arr[index];

                curr_max = Math.max(curr_max, curr_sum);
            }

            res = Math.max(res, curr_max);
        }
        return res;
    }

    static int normalMaxSum(int arr[], int n) {
        int res = arr[0];

        int maxEnding = arr[0];

        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);

            res = Math.max(maxEnding, res);
        }

        return res;
    }

    static int maxCircularSum_efficient(int arr[]) {
       int n = arr.length;
        int max_normal = normalMaxSum(arr, n);

        if (max_normal < 0) {
            return max_normal;
        }

        int arr_sum = 0;

        for (int i = 0; i < n; i++) {
            arr_sum += arr[i];

            arr[i] = -arr[i];
        }

        int max_circular = arr_sum + normalMaxSum(arr, n);

        return Math.max(max_circular, max_normal);
    }
}

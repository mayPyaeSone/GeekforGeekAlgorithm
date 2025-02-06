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
public class Maximum_Occured_Integer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int L[] = new int[]{2, 1, 3};
        int R[] = new int[]{5, 3, 9};
        int n = L.length;
        System.out.println(maxOccured_naive(L, R, n, 1));

//        int L[] = new int[]{1, 5, 9, 13, 21};
//        int R[] = new int[]{15, 8, 12, 20, 30};
//        int n = L.length;
//        System.out.println(maxOccured(L, R, n,1000000));
    }

   static int maxOccured_naive(int L[], int R[], int n, int maxx) {
        int i, j, cnt, ele = -1;
        int max1 = Integer.MAX_VALUE;
        for (i = 0; i <= maxx; i++) {
            cnt = 0;
            for (j = 0; j < n; j++) {
                if (i >= L[j] && i <= R[j]) {
                    cnt++;
                }
            }
            if (cnt > max1) {
                max1 = cnt;
                ele = i;
            }
        }
        return ele;
    }
    static int MAX = 1000000;

    // Return the maximum occurred element in all ranges.
    public static int maxOccured(int L[], int R[], int n, int maxx) {
        // Initialising all element of array to 0.
        int[] arr = new int[1000000];

        // Adding +1 at Li index and
        // subtracting 1 at Ri index.
        int maxi = -1;
        for (int i = 0; i < n; i++) {
            arr[L[i]] += 1;
            arr[R[i] + 1] -= 1;
            if (R[i] > maxi) {
                maxi = R[i];
            }
        }

        // Finding prefix sum and index
        // having maximum prefix sum.
        int msum = arr[0];
        int ind = 0;
        for (int i = 1; i < maxi + 1; i++) {
            arr[i] += arr[i - 1];
            if (msum < arr[i]) {
                msum = arr[i];
                ind = i;
            }
        }

        return ind;
    }
}

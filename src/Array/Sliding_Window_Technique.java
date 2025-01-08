/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author User
 */
public class Sliding_Window_Technique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(method_efficinet_own(new int[]{100, 200, 300, 400}, 2));
        System.out.println(method_efficinet_own(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20}, 4));//39
    }

    static int method_naive(int[] arr, int k) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
            int curr = 0;
            for (int j = i; j < i + k; j++) {
                curr += arr[j];
            }
            res = Integer.max(res, curr);
        }
        return res;

    }

    static int method_efficinet_own(int[] arr, int k) {
        int res = 0;
        int curr = 0;
        int count = 0;
        for (int i = 0; i < arr.length;) {
            curr += arr[i];
            count++;
            i++;
            if (count == k) {
                res = Integer.max(res, curr);
                curr -= arr[i - k];
                count--;
            }

        }
        return res;

    }

    static int maxSum(int arr[], int n, int k) {
        int curr_sum = 0;

        for (int i = 0; i < k; i++) {
            curr_sum += arr[i];
        }

        int max_sum = curr_sum;

        for (int i = k; i < n; i++) {
            curr_sum += (arr[i] - arr[i - k]);

            max_sum = Math.max(max_sum, curr_sum);
        }

        return max_sum;
    }
}

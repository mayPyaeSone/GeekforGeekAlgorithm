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
public class Longest_Even_Odd_Subarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 6, 3, 8}, n = 6;

        System.out.println(maxEvenOdd_naive(arr, n));
        System.out.println(maxEvenOdd_efficient(arr, n));
    }

    static int maxEvenOdd_naive(int arr[], int n) {
        int res = 1;

        for (int i = 0; i < n; i++) {
            int curr = 1;

            for (int j = i + 1; j < n; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0)
                        || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
                    curr++;
                } else {
                    break;
                }
            }

            res = Math.max(res, curr);
        }

        return res;
    }

    static int maxEvenOdd_efficient(int arr[], int n) {
        int res = 1;
        int curr = 1;

        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0)
                    || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                curr++;

                res = Math.max(res, curr);
            } else {
                curr = 1;
            }
        }

        return res;
    }
}

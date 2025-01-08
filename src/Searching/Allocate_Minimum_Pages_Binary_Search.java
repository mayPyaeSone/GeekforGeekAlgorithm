/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

/**
 *
 * @author User
 */
public class Allocate_Minimum_Pages_Binary_Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int arr[] = new int[]{10,20,10,30};
        System.out.println(minPages(arr, arr.length, 2));
       
    }

    static long minPages(int arr[], int n, int m) {
        if(m>=n){
            return -1;
        }
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        int low = max;
        int high = sum;
        int res = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isFeasible(arr, m, mid)) {
                res = mid;
                high = mid - 1;//go to left
            } else {
                low = mid + 1;//go to right
            }

        }
        return res;
    }

    static boolean isFeasible(int arr[], int noStu, int mid) {
        int req = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > mid) {
                req++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return (req <= noStu);
    }

}

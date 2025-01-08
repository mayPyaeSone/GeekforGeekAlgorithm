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
public class GFG {

    static int getPeak(int arr[], int n) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if ((mid == 0 || arr[mid - 1] <= arr[mid])
                    && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            }
            if (mid > 0 && arr[mid - 1] >= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        int arr[] = {5, 20, 40, 30, 20, 50, 60}, n = 7;

        System.out.println(getPeak(arr, n));
        
          int arr1[] = {5,5};
        System.out.println(getPeak(arr1,arr1.length));

    }
}

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
public class Minimum_Consecutive_Flips {

    public static void main(String args[]) {
//        int arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 0}, n = 9;
//
//        printGroups(arr, n);
        printGroups(new int[]{1, 1, 0, 0, 0, 1}, 6);

    }

    static void printGroups(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] != arr[0]) {
                    System.out.print("From " + i + " to ");
                } else {
                    System.out.println(i - 1);
                }
            }
        }

        if (arr[n - 1] != arr[0]) {
            System.out.println(n - 1);
        }
    }

}

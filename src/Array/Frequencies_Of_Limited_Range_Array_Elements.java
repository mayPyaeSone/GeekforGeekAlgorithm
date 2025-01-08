/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Frequencies_Of_Limited_Range_Array_Elements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //frequencyCount(new int[]{8, 9}, 2, 5);
        // frequencyCount(new int[]{3, 3, 3, 3}, 5, 4);
        frequencyCount(new int[]{2, 3, 2, 3, 5}, 5, 4);

    }

    public static void frequencyCount(int arr[], int N, int P) {
        int i, j;
        for (i = 0; i < arr.length;) {
            if (arr[i] > 0 && arr[i] <= N) {
                j = arr[i] - 1;
                if (arr[j] <= 0) {
                    arr[j]--;
                    arr[i] = 0;
                } else {
                    swap(arr, i, j);
                    arr[j] = -1;

                }
            } else if (arr[i] > N) {
                arr[i] = 0;
                i++;
            } else {
                i++;
            }

        }
        for (int a : arr) {
            System.out.println(a);
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

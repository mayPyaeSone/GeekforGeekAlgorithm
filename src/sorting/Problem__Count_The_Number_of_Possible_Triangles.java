/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Problem__Count_The_Number_of_Possible_Triangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = new int[]{28, 4, 33, 38, 0, 45};
        System.out.println(findNumberOfTriangles(arr, arr.length));
        System.out.println(countTriangles(arr));
    }

    static int findNumberOfTriangles(int arr[], int n) {
        if (n < 3) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] > arr[k] && arr[j] + arr[k] > arr[i] && arr[i] + arr[k] > arr[j]) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static int countTriangles(int[] arr) {
        int n = arr.length;

        // Edge case: If less than 3 elements, no triangle can be formed
        if (n < 3) {
            return 0;
        }

        // Sort the array
        Arrays.sort(arr);

        int count = 0;

        // Traverse each element as the largest side of the triangle (arr[k])
        for (int k = 2; k < n; k++) {
            int i = 0, j = k - 1;

            // Use two pointers to find valid triangles
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    // If arr[i] + arr[j] > arr[k], then all pairs (i, i+1, ..., j-1) with arr[j] will form valid triangles
                    count += (j - i);
                    j--; // Move the right pointer left to try a smaller pair
                } else {
                    i++; // Move the left pointer right to increase the sum
                }
            }
        }
        return count;
    }
}

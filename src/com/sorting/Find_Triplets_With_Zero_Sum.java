/*
Find triplets with zero sum
Difficulty: MediumAccuracy: 25.81%Submissions: 328K+Points: 4
Given an array arr[] of n integers. Check whether it contains a
triplet that sums up to zero. Return true, if there is at least 
one triplet following the condition else return false.

Examples:

Input: n = 5, arr[] = {0, -1, 2, -3, 1}
Output: 1
Explanation: 0, -1, and 1 form a triplet with a sum equal to 0.

Input: n = 3, arr[] = {1, 2, 3}
Output: 0

Explanation: No triplet with zero sum exists. 
Expected Time Complexity: O(n2)
Expected Auxiliary Space: O(1)
 */
package com.sorting;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Find_Triplets_With_Zero_Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        System.out.println(findTriplets(arr, 5));
    }
//This is editorial code expected approach.

    public static boolean findTriplets(int arr[], int n) {
        //Sorting the elements.
        Arrays.sort(arr);

        //Traversing the array elements.
        for (int i = 0; i < n - 2; i++) {
            //Taking two pointers. One at element after ith index and another
            //at the last index.
            int l = i + 1;
            int r = n - 1;
            int x = arr[i];

            //Using two pointers over the array which helps in checking if
            //the triplet sum is zero.
            while (l < r) {

                //If sum of elements at indexes i, l and r is 0, we return true.
                if (x + arr[l] + arr[r] == 0) {
                    return true;
                } //Else if the sum is less than 0, it means we need to 
                //increase the sum so we increase the left pointer l.
                else if (x + arr[l] + arr[r] < 0) {
                    l++;
                } //Else the sum is more than 0 and we need to decrease the
                //sum so we decrease the right pointer r.
                else {
                    r--;
                }
            }
        }
        //returning false if no triplet with zero sum is present.
        return false;
    }

//This is editorial code but time complexity is n^3    
    static boolean findTriplets_n3(int arr[], int n) {
        //Your code here
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        return true;
                    }
                }
            }
        }

        // If no triplet found then return false
        return false;
    }

//This is chat gpt generated code.
    public boolean findTriplets_gpt(int arr[], int n) {
        // Sort the array
        Arrays.sort(arr);

        // Iterate through the array
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1; // Pointer after the fixed element
            int right = n - 1; // Pointer at the end

            // Check for triplet sum
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    // Triplet found with zero sum
                    return true;
                } else if (sum < 0) {
                    left++; // Move left pointer to increase the sum
                } else {
                    right--; // Move right pointer to decrease the sum
                }
            }
        }

        // No triplet found with zero sum
        return false;
    }
}

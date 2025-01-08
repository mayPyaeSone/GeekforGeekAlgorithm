package Array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Check_If_Array_Is_sorted_And_Rotated {

    //Function to check if array is sorted in increasing order and rotated.
    static boolean II(int arr[]) {

        int i = 0;
        //We use a loop to check whether elements are in increasing order and 
        //stop at position where we find a smaller number than previous one.
        while (i < arr.length - 1 && arr[i] <= arr[i + 1]) {
            i++;
        }

        //If we reach the end of the array, we return false.
        if (i == arr.length - 1) {
            return false;
        }

        i++;
        //Now we check whether all remaining elements are in increasing order.
        while (i < arr.length - 1 && arr[i] <= arr[i + 1]) {
            i++;
        }

        //If we reach the end and the last element is smaller than or equal to
        //first element we return true else we return false.
        if (i == arr.length - 1 && arr[arr.length - 1] <= arr[0]) {
            return true;
        } else {
            return false;
        }
    }

    //Function to check if array is sorted in decreasing order and rotated.
    static boolean DD(int arr[]) {
        int i = 0;
        //We use a loop to check whether elements are in decreasing order and 
        //stop at position where we find a smaller number than next one.
        while (i < arr.length - 1 && arr[i] >= arr[i + 1]) {
            i++;
        }

        //If we reach the end of the array, we return false.
        if (i == arr.length - 1) {
            return false;
        }

        i++;
        //Now we check whether all remaining elements are in decreasing order.
        while (i < arr.length - 1 && arr[i] >= arr[i + 1]) {
            i++;
        }

        //If we reach the end and the last element is larger than or equal to 
        //first element we return true else we return false.
        if (i == arr.length - 1 && arr[arr.length - 1] >= arr[0]) {
            return true;
        } else {
            return false;
        }
    }

    //Function to check if array is sorted and rotated.
    static boolean checkRotatedAndSorted(int arr[]) {
        //returning true if any of the two function gives true.
        return II(arr) || DD(arr);
    }

    // Driver Method
    public static void main(String[] args) {
        //System.out.println(checkRotatedAndSorted_Video(new int[]{3,4, 5, 1, 2}));;
        //System.out.println(checkRotatedAndSorted_Video(new int[]{1,2,3}));;
        //System.out.println(checkRotatedAndSorted(new int[]{9,10,20,6,7,8}));;
        System.out.println(checkRotatedAndSorted_Video(new int[]{10,9,8,14,13,12}));;
    }

    static boolean checkRotatedAndSorted_Video(int[] arr) {
        if (arr[0] > arr[arr.length - 1]) {
            int pivotalPoint = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    pivotalPoint++;
                }
            }
            if (pivotalPoint == 1) {
                return true;
            }
        } else if (arr[arr.length - 1] > arr[0]) {
            int pivotalPoint = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i+1] > arr[i]) {
                    pivotalPoint++;
                }
            }
            if (pivotalPoint == 1) {
                return true;
            }
        }
        return false;
    }
}

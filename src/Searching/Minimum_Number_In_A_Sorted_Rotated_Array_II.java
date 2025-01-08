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
public class Minimum_Number_In_A_Sorted_Rotated_Array_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(minNumber_editorial(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 1}, 0, 9));
        System.out.println(minNumber_editorial(new int[]{3, 4, 5, 0, 2}, 0, 4));
        System.out.println(minNumber_editorial(new int[]{0, 1, 2, 3, 4}, 0, 4));

    }

    static int minNumber_editorial(int arr[], int low, int high) {
        if (low == high) {
            return arr[low];
        }
        if (arr[high - 1] > arr[high]) {
            return arr[high];
        }
        int l = low + 1;
        int h = high - 1;
       
        while (l <= h) {
             int mid = (l + h) / 2;
            if ((arr[mid] < arr[mid + 1]) && (arr[mid] < arr[mid - 1])) {
                return arr[mid];
            }
            if (arr[mid] > arr[high]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return arr[low];
    }

    static int minNumber_iterative(int arr[], int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            //if element at mid+1 is less than element at mid, we return 
            //element at mid+1 as it is minimum in the array.
            if (mid < high && arr[mid + 1] < arr[mid]) {
                return arr[mid + 1];

            }
            //if element at mid is less than element at mid-1, we return 
            //element at mid as it is minimum in the array.
            if (mid > low && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
            //if element at high is greater than element at mid, minimum element is
            //present in left half so calling function recursively for left half.
            if (arr[high] > arr[mid]) {
                high = mid - 1;

            } else {
                low = mid + 1;

            }
        }

        //else the minimum element is present in right half so calling
        //function recursively for right half.
        return -1;
    }

    static int minNumber(int arr[], int low, int high) {
        //when array is not rotated at all, we return first element.
        if (high < low) {
            return arr[0];
        }

        //when both pointers become same, we return element at that pointer.
        if (high == low) {
            return arr[(int) low];
        }

        int mid = low + (high - low) / 2;

        //if element at mid+1 is less than element at mid, we return 
        //element at mid+1 as it is minimum in the array.
        if (mid < high && arr[mid + 1] < arr[mid]) {
            return arr[mid + 1];
        }

        //if element at mid is less than element at mid-1, we return 
        //element at mid as it is minimum in the array.
        if (mid > low && arr[mid] < arr[mid - 1]) {
            return arr[mid];
        }

        //if element at high is greater than element at mid, minimum element is
        //present in left half so calling function recursively for left half.
        if (arr[high] > arr[mid]) {
            return minNumber(arr, low, mid - 1);
        }

        //else the minimum element is present in right half so calling
        //function recursively for right half.
        return minNumber(arr, mid + 1, high);
    }
}

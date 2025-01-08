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
public class Rotate_Array_Problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[];
        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        rotateArr(arr, 3, 12);
        arr = new int[]{1, 2, 3, 4};
        rotateArr(arr, 5, 4);
        arr = new int[]{40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53, 57, 2, 81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 25, 29, 72, 33, 30, 4, 20, 1, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65, 25};
        rotateArr(arr, 69, 77);

    }

    static void rotateArr(int arr[], int d, int n) {

        System.out.println(d);
        //First reversing d elements from starting index.
        rvereseArray(arr, 0, d - 1);
        //Then reversing the last n-d elements.
        rvereseArray(arr, d, n - 1);
        //Finally, reversing the whole array.
        rvereseArray(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void rvereseArray(int arr[], int start, int end) {
        int temp;

        while (start < end) {
            //Swapping values at start index and end index.
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            //Updating the values of start and end.
            start++;
            end--;
        }
    }
}

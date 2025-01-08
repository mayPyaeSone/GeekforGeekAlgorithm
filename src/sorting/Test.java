/*

 */
package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {3 ,2 ,10, 4 ,40}; // output :; 1   
        System.out.println(closer(arr,arr.length,2));
        
        int arr1[] = {2, 1 ,4 ,3}; // output :; -1
        System.out.println(closer(arr1,arr1.length,5));
    }

    static long closer(int arr[], int n, long x) {
        int low = 0;
        int high = n - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            }

            if (mid > 0 && arr[mid - 1] == x) {
                return mid - 1;
            }
            if (mid < n - 1 && arr[mid + 1] == x) {
                return mid + 1;
            }
            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}

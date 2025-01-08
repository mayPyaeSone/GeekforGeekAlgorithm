/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Vector;

/**
 *
 * @author User
 */
public class Maximum_Subarray_Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // System.out.println(method(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
        //System.out.println(maxSum(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
        Vector<Integer> arr = new Vector<>();
        arr.add(1);
        arr.add(-2);
        arr.add(3);
        arr.add(-1);
        arr.add(2);

//        arr.add(-2);
//        arr.add(-5);
//        arr.add(6);
//        arr.add(-2);
//        arr.add(-3);
//        arr.add(1);
//        arr.add(5);
//        arr.add(-6);
        // Function call
        SubarrayWithMaxSum(arr);
    }

    public static long maxSum(int[] arr) {
        int n = arr.length;
        long currentMax = Integer.MIN_VALUE;
        long globalMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            currentMax = Math.max(currentMax + arr[i], arr[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

    static void SubarrayWithMaxSum(Vector<Integer> nums) {
        // Initialize currMax and globalMax
        // with first value of nums
        int endIndex = 0, currMax = nums.get(0);
        int globalMax = nums.get(0);

        // Iterate for all the elements
        // of the array
        for (int i = 1; i < nums.size(); ++i) {

            // Update currMax
            currMax = Math.max(nums.get(i),
                    nums.get(i) + currMax);

            // Check if currMax is greater
            // than globalMax
            if (currMax > globalMax) {
                globalMax = currMax;
                endIndex = i;
            }
        }

        int startIndex = endIndex;

        // Traverse in left direction to
        // find start Index of subarray
        while (startIndex >= 0) {
            globalMax -= nums.get(startIndex);

            if (globalMax == 0) {
                break;
            }

            // Decrement the start index
            startIndex--;
        }

        // Printing the elements of
        // subarray with max sum
        for (int i = startIndex; i <= endIndex; ++i) {
            System.out.print(nums.get(i) + " ");
        }
    }
}

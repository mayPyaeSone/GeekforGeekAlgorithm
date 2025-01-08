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
public class Equilibrium_Point {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println(equilibriumPoint(new long[]{-7, 1, 5, 2, -4, 3, 0}, 7));
//        System.out.println(equilibriumPoint(new long[]{1, 2, 3},3));
        //   System.out.println(equilibriumPoint(new long[]{1, 2, 0, 3}, 4));8 8 3 7 8 2 7 2
        System.out.println(equilibriumPoint(new long[]{8, 8, 3, 7, 8, 2, 7, 2}, 8));
    }

//    public static int equilibriumPoint(long arr[], int n) {
//
//        if (arr.length == 1) {
//            return (int) arr[0];
//        }
//        int leftSum = 0;
//        int rightSum = 0;
//        int i = 0;
//        for (; i * i < arr.length; i++) {
//
//            leftSum++;
//            rightSum++;
//        }
//        if (leftSum == rightSum) {
//            if (arr.length % 2 == 0) {
//                return arr.length / 2;
//            } else {
//                return (arr.length / 2) + 1;
//            }
//        }
//
//        return -1;
//    }
    public static int equilibriumPoint(long arr[], int n) {

        int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum

        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i) {
            sum += arr[i];
        }

        for (int i = 0; i < n; ++i) {
            sum -= arr[i]; // sum is now right sum for index
            // i

            if (leftsum == sum) {
                return i;
            }

            leftsum += arr[i];
        }

        /* If no equilibrium index found, then return 0 */
        return -1;
    }
}

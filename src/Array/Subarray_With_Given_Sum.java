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
public class Subarray_With_Given_Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        mehtod(new int[]{1, 4, 20, 3, 10, 5}, 33);// 2 and 4
//        mehtod(new int[]{1, 4, 0, 0, 3, 10, 5}, 7);// 1 and 4
        //       mehtod(new int[]{4, 8, 12, 5}, 17);// 2 and 3//wrong point
//        mehtod(new int[]{1, 4}, 0);//not found

        subSum(new int[]{1, 4, 20, 3, 10, 5}, 33);// 2 and 4
        subSum(new int[]{1, 4, 0, 0, 3, 10, 5}, 7);// 1 and 4
        subSum(new int[]{4, 8, 12, 5}, 17);// 2 and 3
        subSum(new int[]{1, 4}, 0);//not found
    }

    static void subSum(int[] arr, int sum) {
        int start = 0;
        int end = 0;
        int curr = 0;
        for (; end < arr.length; end++) {
            curr += arr[end];
            while (sum < curr) {
                curr -= arr[start];
                start++;
            }
            if (curr == sum) {
                if (start > end) {
                    System.out.println("Not found");
                    break;
                }
                System.out.println("Sum of elements between indices " + start + " and " + end);

                break;
            }
        }
        if (curr != sum) {
            System.out.println("Not found");
        }
    }
//wrong thinking idea code
//    static void mehtod(int[] arr, int sum) {
//        int curr = 0;
//        int total = 0;
//        for (int i = 0; i < arr.length; i++) {
//            total += arr[i];
//        }
//        int midLen = 0;
//        if (arr.length % 2 == 0) {
//            midLen = (arr.length / 2) - 1;
//        } else {
//            midLen = (arr.length / 2);
//        }
//        for (int i = 0; i * i < arr.length; i++) {
//            curr = total - arr[i];
//            if (curr == sum) {
//                System.out.println("Sum of elements between indices " + (i + 1) + " and " + (arr.length - 1 - i));
//                break;
//            }
//            curr = total - arr[arr.length - 1 - i];
//            if (curr == sum) {
//                System.out.println("Sum of elements between indices " + (i) + " and " + (arr.length - 2 - i));
//                break;
//            }
//            curr = (total - arr[i]) - arr[arr.length - i - 1];
//            if (curr == sum && i != midLen) {
//                System.out.println("Sum of elements between indices " + (i + 1) + " and " + (arr.length - i - 2));
//                break;
//            }
//            total = curr;
//        }
//        if (curr != sum) {
//            System.out.println("Not found");
//        }
//    }
}

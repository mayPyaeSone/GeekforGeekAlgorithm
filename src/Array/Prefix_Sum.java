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
public class Prefix_Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(prefixSum(new int[]{10, 20, 10, 5, 15}, 0, 2));;
        System.out.println(prefixSum(new int[]{2, 8, 3, 9, 6, 5, 4}, 1, 3));;

//        System.out.println(prefixWeightSum(new int[]{2, 3, 5, 4, 6, 1}, 0, 2));
//        System.out.println(prefixWeightSum(new int[]{2, 3, 5, 4, 6, 1}, 2, 3));
    }

    static int getSum(int ps[], int l, int r) {

        if (l == 0) {
            return ps[r];
        }

        return ps[r] - ps[l - 1];

    }

    static int prefixWeightSum(int[] arr, int l, int r) {
        int[] arrPrefix = new int[arr.length];
        arrPrefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arrPrefix[i] = (arrPrefix[i - 1] + (arr[i] * (i - l + 1)));
        }
        return getSum(arrPrefix, l, r);
    }

    static int prefixSum(int[] arr, int l, int r) {
        int[] prefixArr = new int[arr.length];
        prefixArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }
        for (int i : prefixArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        return getSum(prefixArr, l, r);
    }
}

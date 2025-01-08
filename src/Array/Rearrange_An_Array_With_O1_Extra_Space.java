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
public class Rearrange_An_Array_With_O1_Extra_Space {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //arrange(new long[] {1,0});
        arrange(new long[]{4, 0, 2, 1, 3}, 5);

    }

    static void arrange(long arr[]) {
        long[] temp;
        temp = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[(int) temp[i]];
        }

        for (long i : arr) {
            System.out.print(i + " ");
        }
    }

    static void arrange(long arr[], int n) {
        int i = 0;

        //Increasing all values by (arr[arr[i]]%n)*n to store the new element.
        for (i = 0; i < n; i++) {
            arr[(int) i] += (arr[(int) arr[(int) i]] % n) * n;
        }
        for (long l : arr) {
            System.out.print(l + " ");
        }
        //Since we had multiplied each element with n.
        //We will divide by n too to get the new element at that 
        //position after rearranging.
        for (i = 0; i < n; i++) {
            arr[(int) i] = arr[(int) i] / n;
        }
    }
}

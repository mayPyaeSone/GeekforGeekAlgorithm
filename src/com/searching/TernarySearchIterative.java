/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searching;

/**
 *
 * @author User
 */
public class TernarySearchIterative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ternarySearch(0, 10, 0, arr);
    }

    static int ternarySearch(int l, int r, int key, int ar[]) {
        while (r >= l) {

            // Find mid1 and mid2 
            System.out.println("l: "+l+" r: "+r);
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;
            System.out.println("mid1: "+mid1+" mid2: "+mid2);
            // Check if key is present at any mid 
            if (ar[mid1] == key) {
                return mid1;
            }
            if (ar[mid2] == key) {
                return mid2;
            }

            // Since key is not present at mid, 
            // check in which region it is present 
            // then repeat the Search operation 
            // in that region 
            if (key < ar[mid1]) {

                // The key lies in between l and mid1 
                r = mid1 - 1;
            } else if (key > ar[mid2]) {

                // The key lies in between mid2 and r 
                l = mid2 + 1;
            } else {

                // The key lies in between mid1 and mid2 
                l = mid1 + 1;
                r = mid2 - 1;
            }
        }

        // Key not found 
        return -1;
    }
}

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
public class TernarySearchRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    int ternarySearch(int l, int r, int key, int ar[]) {
        if (r >= l) {
            // Find mid1 and mid2 
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

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
                return ternarySearch(l, mid1 - 1, key, ar);
            } else if (key > ar[mid2]) {

                // The key lies in between mid2 and r 
                return ternarySearch(mid2 + 1, r, key, ar);
            } else {

                // The key lies in between mid1 and mid2 
                return ternarySearch(mid1 + 1, mid2 - 1, key, ar);
            }
        }

        // Key not found 
        return -1;
    }
}

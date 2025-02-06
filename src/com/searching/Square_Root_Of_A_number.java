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
public class Square_Root_Of_A_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    long floorSqrt(long x) {
        long low = 1;
        long high = (int) x;
        long res = -1;
        while (low <= high) {
            long mid = (low + high) / 2;
            long sqMid = mid * mid;
            if (sqMid == x) {
                return mid;
            } else if (sqMid > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                res = mid;
            }
        }
        return (long) res;

    }
}

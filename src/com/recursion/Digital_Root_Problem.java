/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

/**
 *
 * @author User
 */
public class Digital_Root_Problem {

    public static void main(String[] args) {
        System.out.println(countDigit(999999999));
    }

    static long countDigit(long n) {
        long res = 0L;
        if (n < 10) {
            return n;
        } else {

            res = n % 10 + countDigit(n / 10);
            if (res > 10) {
                res = res % 10 + countDigit(res / 10);
            }
        }
        return res;
    }

}

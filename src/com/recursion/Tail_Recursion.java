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
public class Tail_Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // fun(3, 1);
        System.out.println(fact(3, 1));
    }

    static void fun(int n, int k) {
        if (n == 0) {
            return;
        }

        System.out.print(k + " ");

        fun(n - 1, k + 1);

    }

    static int fact(int n, int k) {
        if (n == 0 || n == 1) {
            return k;
        }
        return fact(n - 1, k * n);

    }
}

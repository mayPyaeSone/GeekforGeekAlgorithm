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
public class Rope_Cutting_Problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5, a = 2, b = 1, c = 5;

        System.out.println(maxCuts(n, a, b, c));
    }

    static int maxCuts(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }
        if (n <= -1) {
            return -1;
        }

        int res = Math.max(maxCuts(n - a, a, b, c),
                Math.max(maxCuts(n - b, a, b, c),
                        maxCuts(n - c, a, b, c)));
        if (res == -1) {
            return -1;
        }

        return res + 1;
    }
}

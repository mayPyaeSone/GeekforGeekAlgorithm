/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maths;

/**
 *
 * @author User
 */
public class PowerCalculator {

    // Optimized recursive method to calculate power
    public static int power(int base, int exponent) {
        // Base case: any number to the power of 0 is 1
        if (exponent == 0) {
            return 1;
        }
        // Recursive case: divide the problem into smaller subproblems
        int backAns = power(base, exponent /2);
        if (exponent % 2 == 0) {
            return backAns * base;
        } else {
            return base * base * backAns;
        }
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geekforgeekalgorithm;

import java.util.Vector;

/**
 *
 * @author User
 */
public class DivisorOfNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The divisors of 100 are: ");
        //printDivisors(27);
        //printDivisors_efficient(30);
        //printDivisors_efficient(99);//6
        //printDivisors_efficient(101);//2
        //printDivisors_efficient(182);//8
        printDivisors_efficient(43);
        
    }
// method to print the divisors

    static void printDivisors(int n) {
        // Note that this loop runs till square root
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // If divisors are equal, print only one
                if (n / i == i) {
                    System.out.print(" " + i);
                } else // Otherwise print both
                {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

    static void printDivisors_efficient(int n) {
        // Vector to store half of the divisors
        Vector<Integer> v = new Vector<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                // check if divisors are equal
                if (n / i == i) {
                    System.out.printf("%d ", i);
                } else {
                    System.out.printf("%d ", i);

                    // push the second divisor in the vector
                    v.add(n / i);
                }
            }
        }

        // The vector will be printed in reverse
        for (int i = v.size() - 1; i >= 0; i--) {
            System.out.printf("%d ", v.get(i));
        }
    }
}

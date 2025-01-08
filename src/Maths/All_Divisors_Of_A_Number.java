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
public class All_Divisors_Of_A_Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    static void printDivisors(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(" " + i);
            } else {
                System.out.println(i + " " + n / i + " ");
            }
        }

    }
}

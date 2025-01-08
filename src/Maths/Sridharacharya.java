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
public class Sridharacharya {

    public static void main(String[] args) {
        findRoots(1,-7, 12);
        findRoots(1, 1, 1);
    }

    static void findRoots(int a, int b, int c) {
        if (a == 0) {
            return;
        }
        int d = b * b - (4 * a * c);
        double sqrt_val = Math.sqrt(Math.abs(d));

        if (d > 0) {
            System.out.println(
                    (double) (-b + sqrt_val) / (2 * a) + "\n"
                    + (double) (-b - sqrt_val) / (2 * a)
            );
        } else if (d == 0) {
            System.out.println(
                    (double) -b / (2 * a) + "\n"
                    + (double) -b / (2 * a)
            );
        } else {
            System.out.println(
                    -(double) b / (2 * a) + "+i" + sqrt_val / (2 * a) + "\n"
                    + -(double) b / (2 * a) + "-i" + sqrt_val / (2 * a)
            );
        }

    }

}

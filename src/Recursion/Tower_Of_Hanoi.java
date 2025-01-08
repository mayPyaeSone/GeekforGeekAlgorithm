/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author User
 */
public class Tower_Of_Hanoi {
    static void ToH(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }
        ToH(n - 1, A, C, B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        ToH(n - 1, B, A, C);
    }

    public static void main(String args[]) {
        int n = 4;
        ToH(n, 'A', 'B', 'C');
    }
}

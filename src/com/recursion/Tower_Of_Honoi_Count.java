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
public class Tower_Of_Honoi_Count {

    public static long toh(int N, char from, char aux, char to) {
        long moves = 0L;
        if (N >= 1) {
            // recursive call to move top disk from "from" to aux in current call
            moves += toh(N - 1, from, to, aux);
            System.out.println("move disk " + N + " from rod " + from
                    + " to rod " + to);

            // increment moves
            moves++;

            // recursive call to move top disk from aux to "to" in current call
            moves += toh(N - 1, aux, from, to);
        }
        return moves;
    }

    public static void main(String args[]) {
        int n = 3;
        //System.out.println(toh(n, 'A', 'B', 'C'));;
        System.out.println(toh_sec(n, 'A', 'B', 'C'));;
    }

    public static long toh_sec(int n, char A, char B, char C) {
        long moves = 0L;
        if (n == 1) {
            System.out.println("Move 1 from " + A + " to " + C);
            return 1;
        }
        moves += toh_sec(n - 1, A, C, B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        moves++;
        moves += toh_sec(n - 1, B, A, C);
        return moves;
    }

}

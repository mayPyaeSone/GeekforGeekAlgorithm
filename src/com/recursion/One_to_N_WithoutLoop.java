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
public class One_to_N_WithoutLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public void printNos(int N) {
        if (N == 0) {
            return;
        }
        printNos(N - 1);
        System.out.print(N + " ");
    }
}

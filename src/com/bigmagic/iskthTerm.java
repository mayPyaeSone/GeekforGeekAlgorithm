/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigmagic;

/**
 *
 * @author User
 */
public class iskthTerm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(iskthTerm.isSet(12));;
    }

    static int isSet(int n) {
        int x = 1;
        int i = 1;
        while (x <= n) {
            if ((n & x) != 0) {
                return i;
            }
            x = x * 2;
            i++;
        }
        return 0;
    }

}

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
public class Decimal_to_Binary_Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(fun(16));//4
        System.out.println(fun(17));//4
        System.out.println(fun(18));//4
        System.out.println(fun(19));//4
        System.out.println(fun(31));//4
        System.out.println(fun(32));//5
    }
    static int fun(int n){
        if(n==1)
            return 0;
        else {
           return 1 + fun(n/2); 
        }
            
    }
}

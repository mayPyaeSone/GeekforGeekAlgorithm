/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geekforgeekalgorithm;

import java.math.BigInteger;

/**
 *
 * @author User
 */
public class factorial {

    public static long factorial(int N) {
         long res = 1;
        for(;N>0;N--){
            res *=N;
        }
        int count= 0;
        while(res >0){
            res /=10;
            count++;
        }
        return count;
    }
     public boolean isPrime(int N) {
     if(N==1)
        return false;
     if(N==2 || N==3)
        return true;
    for( int i =2; i<N ;i++){
        if(N%i==0){
            return false;
        }
    }
    return true;
    }
    public static void main(String args[]){
        System.out.println(factorial(120));
    }
}

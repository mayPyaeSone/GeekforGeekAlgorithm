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
public class LongestConsecutive1s {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println(maxConsecutiveOnes(14));
        System.out.println(maxConsecutiveOnes(222));
        System.out.println(maxConsecutiveOnes(21));
    }
    public static int maxConsecutiveOnes(int N) {
        int bitCount = 0; int max = 0;
        while(N>0){
            if((N&1)>0){
                    bitCount++;  
            }else{
                if( bitCount>max )
                {
                    max = bitCount;
                    
                }
                bitCount = 0;
            }
            N>>=1;
        }
        return bitCount>max?bitCount:max;
    }    
}

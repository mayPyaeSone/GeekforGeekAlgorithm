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
public class CountSetBit {

    static int[] BitsSetTable256 = new int[256];

    public static void main(String[] args) {
        //System.out.println(countSetBit(6));
        //initialize();
        //System.out.println(countSetBits(4));;
        		// Initialise the lookup table
		//initialize();
             //   put();
		//int n = 9;
		System.out.print(countSetBits__(4));
    }
    public static int countSetBits__(int n){
    
      n+=1;
        int count=0;
        
        //Counting set bits from 1 to n.
        for( int x=2 ; x/2<n ; x=x*2 )
        {
            //Total count of pairs of 0s and 1s.
            int quotient = n/x;
            System.out.println("quotient "+quotient);
            //quotient gives the complete count of pairs of 1s.
            //Multiplying it with the (current power of 2)/2 will give
            //the count of 1s in the current bit.
            count += quotient * x / 2;
            System.out.println("count "+count);
            int remainder = n%x;
            System.out.println("remainder "+remainder);
            //If the count of pairs is odd then we add the remaining 1s 
            //which could not be grouped together. 
            if(remainder > x/2)
                count += remainder - x/2;
        }
        
        //returning count of set bits.
        return count;
    }      
    static int countSetBits(int n) {
        int zeroCount = 0;
        int oneIncConut = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                oneIncConut += zeroCount + 1;
                zeroCount = 0;
            } else {
                zeroCount++;
            }
            n = n >> 1;

        }
        return oneIncConut;
    }

    static int countSetBit(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;

        }
        return count;
    }

    public static void initialize() {
        BitsSetTable256[0] = 0;
        for (int i = 0; i < 256; i++) {
            BitsSetTable256[i] = (i & 1) + BitsSetTable256[i / 2];
        }
    }
    public static void put(){
       for (int i = 0; i < 256; i++) {
            System.out.println(BitsSetTable256[i]);
        } 
    }

    public static int countSetBits_(int n) {
        System.out.println(BitsSetTable256[9]);
        return (BitsSetTable256[n & 0xff]
                + BitsSetTable256[(n >> 8) & 0xff]
                + BitsSetTable256[(n >> 16) & 0xff]
                + BitsSetTable256[n >> 24]);
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geekforgeekalgorithm;

/**
 *
 * @author User
 */
public class exactly3Divisors {

   public int exactly3Divisors(int N)
    {   int count = 0;
        for(int i = 1; i<=N;i++)
        {
            if(N%i==0){
                int secNum = i;
                int countToThree = 0;
                for(int j = 1;j<=secNum;j++){
                    if(secNum%j==0) countToThree++;
                }
                if(countToThree==3)count++;
            }
        }
        return count;
    }
   
   static boolean hasThreeDivisors(int n)
   {
       int numberofFactors = 2;
       for (int i = 2; i * i <= n; i++) {
           if (n % i == 0) {
               numberofFactors++;
//               if (i * i != n)
//                   numberofFactors++;
           }
       }
       return numberofFactors == 3;
   }
static int exactly3Divisors2(int N)
    {
      int ans = 0;
       for (int i = 1; i <= N; i++) {
           if (hasThreeDivisors(i))
               System.out.println(i);
               ans++;
       }
       return ans;
    }  
public static void main(String args[]){
    exactly3Divisors2(20);
}
}

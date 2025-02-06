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
public class SparseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // System.out.println(isSparse(3));
//       test(1);
//       test(2);
//       test(3);
//       test(4);
//       test(5);
//       test(6);
//       test(8);
       int arr[] = new int[]{9,12,2,11,2,2,10,9,12,10,9,11,2};
        System.out.println(fun(arr));
       
    }
   public static boolean isSparse(int n){
        // Your code
        int ans=0, count=0;
        while(n>0){
            if((n&1)>0){
                count++;
            }
            else{
                count=0;
            }
            ans=Math.max(ans, count);
            n=n>>1;
        }
        return (ans<2);
    }  
   static void test(int x){
       System.out.println((x<<1)+x+(x>>1));
   }
  static int fun (int arr[]){
       int x = 0;
       for(int i = 0; i< arr.length;i++){
           x = x^arr[i];
       }
       return x;
   }
}

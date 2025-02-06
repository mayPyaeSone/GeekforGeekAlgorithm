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
public class Powers_Using_Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(RecursivePower(2, 3));
    }
       static int RecursivePower(int n,int p)
    {
       if(n==0)
        return 0;
         
        if(p==0)
         return 1;
         int y; int ans;
       if(p%2 == 0){
           y = RecursivePower(n,p/2);
           ans = y * y;
       }else{
            y = RecursivePower(n,p-1);
           ans = n * y;
       }
        return ans;
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author User
 */
public class Natural_Number_Sum_Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       	System.out.println(getSum(4));
    }

    static int getSum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + getSum(n - 1);

    }
}

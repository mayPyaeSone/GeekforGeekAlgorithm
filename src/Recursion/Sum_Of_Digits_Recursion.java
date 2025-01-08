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
public class Sum_Of_Digits_Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(fun_iterative(12345));
        //System.out.println(fun_iterative(45632));
        System.out.println(sum_of_digit(45632));
    }

    static int fun_iterative(int n) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }

    static int sum_of_digit(int n) {
        if(n < 10){
            return n;
        }
        return sum_of_digit(n / 10) + n % 10;
    }
}

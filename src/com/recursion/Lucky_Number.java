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
public class Lucky_Number {

    public static boolean check(int n, int counter) {
        if (counter <= n) {
            if (n % counter == 0) {
                return false;
            }
            // calculate next position of input number
            n = n - n / counter;
            counter++;
            // make recursive call with updated counter 
            // and position return check(n, counter);
            return check(n, counter);
        } else {
            return true;
        }
    }

    public static boolean isLucky(int n) {
        return check(n, 2);
    }

    public static void main(String[] args) {
        isLucky(5);
    }

}

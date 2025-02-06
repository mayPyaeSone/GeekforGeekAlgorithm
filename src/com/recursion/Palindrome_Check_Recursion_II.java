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
public class Palindrome_Check_Recursion_II {

    public static boolean isPalindrome(String s, int i) {
        if (i > s.length() / 2) {
            return true;
        }
        return s.charAt(i) == s.charAt(s.length() - i - 1) && isPalindrome(s, i + 1);

    }

    public static void main(String[] args) {
        String str = "geeg";
        if (isPalindrome(str, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}

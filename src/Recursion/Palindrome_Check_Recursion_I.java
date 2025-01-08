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
public class Palindrome_Check_Recursion_I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "gabg";
        if (isPalindrome(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // A recursive function that 
    // check a str(s..e) is 
    // palindrome or not.
    static boolean isPalRec(String str,
            int s, int e) {
        // If there is only one character
        if (s == e) {
            return true;
        }

        // If first and last 
        // characters do not match
        if ((str.charAt(s)) != (str.charAt(e))) {
            return false;
        }

        // If there are more than 
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (s < e ) {
            System.out.println("s: "+ s+" e: " + e);
            return isPalRec(str, s + 1, e - 1);
        }

        return true;
    }

    static boolean isPalindrome(String str) {
        int n = str.length();

        // An empty string is 
        // considered as palindrome
        if (n == 0) {
            return true;
        }

        return isPalRec(str, 0, str.length() - 1);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Generate_Subsets {

    static void powerSet(String str, int index, String curr) {
        int n = str.length();

        // base case
        if (index == str.length()) {
            System.out.println(curr);
            return;
        }

        // Two cases for every character
        // (i) We consider the character
        // as part of current subset
        // (ii) We do not consider current
        // character as part of current
        // subset
        powerSet(str, index + 1, curr + str.charAt(index));
        powerSet(str, index + 1, curr);
    }

    // Driver code
    public static void main(String[] args) {
        String str = "abc";
        int index = 0;
        String curr = "";
        //powerSet(str, index, curr);
        powerSet("abc");
    }

    static ArrayList<String> powerSet(String s) {

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if((i&(1<<j))!=0){
                    System.out.print(s.charAt(j)+",");
                }
            }
           
        }

        return null;
    }
}

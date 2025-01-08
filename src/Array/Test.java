/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {
        String str = "GgG1*";
        String regex = "^(?=.*[a-z])(?=."
                + "*[A-Z])(?=.*\\d)"
                + ".+$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        if (str == null) {
            System.out.println("No");
            return;
        }

        // Find match between given string
        // & regular expression
        Matcher m = p.matcher(str);

        // Print Yes if string
        // matches ReGex
        if (m.matches()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    static void program(String str) {
        String regex = "^(?=.*[a-z])(?=."
                + "*[A-Z])(?=.*\\d)"
                + ".+$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        if (str == null) {
            System.out.println("No");
            return;
        }

        // Find match between given string
        // & regular expression
        Matcher m = p.matcher(str);

        // Print Yes if string
        // matches ReGex
        if (m.matches()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

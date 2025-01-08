/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maths;

/**
 *
 * @author User
 */
public class Count_Digit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(countDigit_recursive(1234));
    }

    public static int countDigit(int x) {
        int count = 0;
        while (x > 0) {

            count++;

            x /= 10;
        }
        return count;
    }

    public static int countDigit_recursive(int x) {
        if (x / 10 == 0) {
            return 1;
        }
        return 1 + countDigit(x / 10);
    }

}

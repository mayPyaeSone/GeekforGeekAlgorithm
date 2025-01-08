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
public class Fibonacci_Using_Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    static int fibonacci(int n) {
        if (n == 0) {return 0;}
        if (n == 1) { return 1;}
        
        return fibonacci(n-1)+fibonacci(n-2);
    }
}

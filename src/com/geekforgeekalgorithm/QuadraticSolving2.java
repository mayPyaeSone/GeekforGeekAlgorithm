/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geekforgeekalgorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class QuadraticSolving2 {

 public static void main(String[] args)
    {
// 752 904 164
// 280 399 573
        // value of the constants a, b, c
        double a = 280, b = 399, c = 573;
 
        // declared the two roots
        double firstroot = 0, secondroot;
 
        // determinant (b^2 - 4ac)
        double det = b * b - 4 * a * c;
        ArrayList<Integer> list = new ArrayList<Integer>();
        // check if determinant is greater than 0
        if (det > 0) {
 
            // two real and distinct roots
            firstroot = (-b + Math.sqrt(det)) / (2 * a);
            secondroot = (-b - Math.sqrt(det)) / (2 * a);
 
            System.out.format(
                "First Root = %.2f and Second Root = %.2f",
                firstroot, secondroot);
            list.add((int)Math.floor(firstroot));
            list.add((int)secondroot);
             System.out.println("two"+firstroot);
             System.out.println(secondroot);
        }
 
        // check if determinant is equal to 0
        else if (det == 0) {
 
            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            firstroot = secondroot = -b / (2 * a);
 
            System.out.format(
                "First Root = Second Root = %.2f;",
                firstroot);
             System.out.println(firstroot);
        }
 
        // if determinant is less than zero
        else {
 
            // roots are complex number and distinct
            double real = -b / (2 * a);
 
            double imaginary = Math.sqrt(-det) / (2 * a);
 
            System.out.printf("First Root = %.2f+%.2fi",
                              real, imaginary);
            System.out.printf("\nSecond Root = %.2f-%.2fi",
                              real, imaginary);
            
       
        }
        System.out.println(list.toString());
    }
}

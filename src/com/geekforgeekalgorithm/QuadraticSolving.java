/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geekforgeekalgorithm;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class QuadraticSolving {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
   public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        if(a==0){
            return null;
        }
        ArrayList<Integer> retArrList = new ArrayList<Integer>();
        double firstroot, secondroot;
        double det = b * b - 4 * a * c;
        if(det>0){
            firstroot = (-b + Math.sqrt(det)) / (2 * a);
            secondroot = (-b - Math.sqrt(det)) / (2 * a);
            retArrList.add((int)firstroot);
            retArrList.add((int)secondroot);
        }else if(det==0){
           firstroot = secondroot = -b / (2 * a);
            retArrList.add((int)firstroot);
            retArrList.add((int)secondroot);
        }else{
           double real = -b / (2 * a);
           //double imaginary = Math.sqrt(-det) / (2 * a);
            retArrList.add((int)real);
            retArrList.add((int)real);
        }
        return retArrList;
    }  
}

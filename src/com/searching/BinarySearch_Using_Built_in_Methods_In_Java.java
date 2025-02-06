/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searching;

/**
 *
 * @author User
 */
// Java program to demonstrate working of Arrays.
// binarySearch() in a sorted array
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch_Using_Built_in_Methods_In_Java {

    public static void main(String[] args) {

        List al = new ArrayList();
        al.add(1);
        al.add(11);
//        al.add(3);
//        al.add(10);
//        al.add(11);

        // 10 is present at index 3.
        int index = Collections.binarySearch(al, 10);
        System.out.println(index);

        // 13 is not present. 13 would have been inserted
        // at position 4. So the function returns (-4-1) 
        // which is -5.
        index = Collections.binarySearch(al, 15);
        System.out.println(index);
    }
}

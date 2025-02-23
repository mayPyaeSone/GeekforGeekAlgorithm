/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting.built_in.methods.array.sorts;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Test_Arrays_Sorts_With_Comparable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Array of 3 objects
        Point arr[] = {
            new Point(10, 20),
            new Point(3, 12),
            new Point(5, 7)};

        // Sorting the object containing array 
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(
                    arr[i].x + " " + arr[i].y);
        }
    }

}

class Point implements Comparable<Point> {

    int x, y;

    // Costructor intialising x & y
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // compareTo() function defining the
    // nature of sorting i.e., according to
    // x-coordinate
    public int compareTo(Point P) {
        // Comparing two objects by
        // Subtracting the passed object 
        // from current object
        return this.x - P.x;
    }
}

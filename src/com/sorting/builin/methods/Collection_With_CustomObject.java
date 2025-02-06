/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting.builin.methods;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author User
 */
public class Collection_With_CustomObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a list of Integers 
        List<Point> list = new ArrayList<Point>();
        list.add(new Point(5, 10));
        list.add(new Point(2, 20));
        list.add(new Point(10, 30));

        // List is sorted in natural order
        // Passing the list and MyCmp object
        Collections.sort(list, new MyCmp());

        // Displaying the points
        for (Point p : list) {
            System.out.println(p.x + " " + p.y);
        }
    }

    static class Point {

        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

// This class implements 
// Comparator interface
    static class MyCmp implements Comparator<Point> {
        // Sorts the Point objects according
        // to x-coordinates in natural order

        public int compare(Point p1, Point p2) {
            return p1.x - p2.x;
        }
    }
}

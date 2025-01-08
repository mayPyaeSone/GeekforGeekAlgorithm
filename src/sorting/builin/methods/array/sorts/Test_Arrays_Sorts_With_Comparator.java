/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.builin.methods.array.sorts;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author User
 */
public class Test_Arrays_Sorts_With_Comparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Array of 3 objects
        Point2 arr[] = {
            new Point2(10, 20), 
            new Point2(3, 12), 
            new Point2(5, 7) };
            
        // Sorting the object containing the array 
        // by passing the array and object MyCmp
        Arrays.sort(arr, new MyCmp());
        
        // Displaying the sorted array
        for(int i = 0; i < arr.length; i++)
            System.out.println(
                arr[i].x + " " + arr[i].y);
    }

}
// Point class which does not implement
// Comparable interface. Thus the objects
// of this class are not comparable.

class Point2 {

    int x, y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// This class implements 
// Comparator interface to compare 
class MyCmp implements Comparator<Point2> {

    // Sorts the Point objects according
    // to x-coordinates in natural order
    @Override
    public int compare(Point2 p1, Point2 p2) {
        return p1.x - p2.x;

    }
}

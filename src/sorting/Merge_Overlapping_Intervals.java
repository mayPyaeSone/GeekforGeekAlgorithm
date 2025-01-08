/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author User
 */
class Interval implements Comparable<Interval> {

    int s, e;

    Interval(int s, int e) {
        this.s = s;
        this.e = e;
    }

    public int compareTo(Interval a) {
        return this.s - a.s;
    }
};

public class Merge_Overlapping_Intervals {

    public static void main(String[] args) {
        Interval arr[] = {new Interval(5, 10), new Interval(3, 15), new Interval(18, 30),
            new Interval(2, 7)};

        int n = arr.length;

        mergeIntervals(arr, n);
    }

    static void mergeIntervals(Interval arr[], int n) {
        Arrays.sort(arr);

        int previous = 0;

        for (int i = 1; i < n; i++) {
            if (arr[previous].e >= arr[i].s) {
                arr[previous].e = Math.max(arr[previous].e, arr[i].e);
                arr[previous].s = Math.min(arr[previous].s, arr[i].s);
            } else {
                previous++;
                arr[previous] = arr[i];
            }
        }
        

        for (int i = 0; i <= previous; i++) {
            System.out.print("[" + arr[i].s + ", " + arr[i].e + "] ");
        }
    }
}

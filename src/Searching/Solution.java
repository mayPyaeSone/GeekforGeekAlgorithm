/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Vector;

/**
 *
 * @author User
 */
class Solution {

    static class Pair {

        long x;

        long y;

        Pair(long x, long y) {

            this.x = x;

            this.y = y;
        }
    }

    // Function to find repeated element and its frequency.
    static Pair sequence(Vector<Long> a) {

        // if array has no repeating element, we return (-1,-1).
        if (a.size() - (a.get(a.size() - 1) - a.get(0)) == 1) {
            return new Pair(-1l, -1l);
        }

        int low = 0;
        int high = a.size() - 1;

        // using binary search to find the repeating element.
        while (low < high) {
            int mid = (low + high) / 2;

            // if arr[mid]=mid+a[0], there is no repeating
            // number in [low..mid].
            if (a.get(mid) >= mid + a.get(0)) low = mid + 1;

            // else there is repeating number in [low..mid].
            else
                high = mid;
        }
        // returning the repeated element and its frequency.
        return new Pair(a.get(low), a.size() - (a.get(a.size() - 1) - a.get(0)));
    }

    public static Pair findRepeating(long arr[], int n) {
        Vector<Long> vec = new Vector<>();
        for (long num : arr) {
            vec.add(num);
        }
        Pair p = sequence(vec);
        return p;
    }
}

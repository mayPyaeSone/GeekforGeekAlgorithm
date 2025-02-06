/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.searching;

import java.util.Vector;

/**
 *
 * @author User
 */
public class Count_Only_Repeated {

    static class Pair {

        private int x;
        private int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }// End of Pair

    static Pair repeatedVal(Vector<Integer> vector) {
        if ((vector.size() - (vector.get(vector.size()-1) - vector.get(0))) == 1) {
            return new Pair(-1, -1);
        }
        int low = 0;
        int high = vector.size() - 1;
        int mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (vector.get(mid) >= vector.get(0) + mid) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        System.out.println(vector.get(mid));
        System.out.println(vector.size() - (vector.get(vector.size()-1) - vector.get(0)));
        return new Pair(vector.get(mid), vector.size() - (vector.get(vector.size()-1) - vector.get(0)));
    }// repeatedVal method

    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[]{1, 2, 3, 3, 4};
        Vector<Integer> vector = new Vector<>();
        for(int i: arr){
            vector.add(i);
        }
        repeatedVal(vector);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Mean_And_Median_of_Array_Problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int median(int a[], int n) {

        Arrays.sort(a);
        int index = a.length / 2;
        int res = 0;
        if (index % 2 == 0) {
            res = a[index] + a[index - 1] / 2;
        } else {
            res = a[index];
        }
        return res;
    }

    public int mean(int a[], int n) {
        int res = 0;
        for (int i : a) {
            res += i;
        }
        return res / n;
    }
}

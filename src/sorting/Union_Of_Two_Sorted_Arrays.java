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
public class Union_Of_Two_Sorted_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[]{3, 8, 8};
        int b[] = new int[]{2, 8, 8, 10, 15};

        int m = a.length;
        int n = b.length;
       // printUnion(a, b, m, n);

        int a2[] = {2, 2, 3, 4, 5}, b2[] = {1, 1, 2, 3, 4};
        printUnion(a2, b2, a2.length, b2.length);

        int a1[] = new int[]{3, 8, 10};
        int b1[] = new int[]{2, 8, 9, 10, 15};

        int m1 = a.length;
        int n1 = b.length;
        //printUnion_naive(a1, b1, m1, n1);

    }

    static void printUnion(int a[], int b[], int m, int n) {

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }
            if (j > 0 && b[j - 1] == b[j]) {
                j++;
                continue;
            }
            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        // if ony b[] is exausted
        while (i < m) {
            if (i == 0 || a[i] != a[i - 1]) {
                System.out.print(a[i] + " ");
            }
            i++;
        }
        // if ony a[] is exausted
        while (j < n) {
            if (j == 0 || b[j] != b[j - 1]) {
                System.out.print(b[j] + " ");
            }
            j++;
        }
    }

    static void printUnion_naive(int a[], int b[], int m, int n) {

        int[] c = new int[m + n];
        for (int i = 0; i < m; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            c[i + m] = b[i];
        }
        Arrays.sort(c);

        for (int i = 0; i < m + n; i++) {
            if (i == 0 || c[i] != c[i - 1]) {
                System.out.print(c[i] + " ");
            }
        }
    }
}

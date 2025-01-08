/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class Merge_Three_Sorted_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[] = new int[]{1, 2, 3, 4};
        int B[] = {1, 2, 3, 4, 5};
        int C[] = {1, 2, 3, 4, 5, 6};
        System.out.println(merge3sorted(A, B, C).toString());
    }

    static ArrayList<Integer> merge3sorted_gpt(int A[], int B[], int C[]) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        for (int num : A) {
            mergedList.add(num);
        }
        for (int num : B) {
            mergedList.add(num);
        }
        for (int num : C) {
            mergedList.add(num);
        }
        Collections.sort(mergedList);
        return mergedList;
    }

    static ArrayList<Integer> merge3sorted_exceedTimelimit(int A[], int B[], int C[]) {
        int n = A.length;
        int m = B.length;
        int p = C.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < n || j < m || k < p) {
            int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE, c = Integer.MAX_VALUE;
            if (i < n) {
                a = A[i];
            }
            if (j < m) {
                b = B[j];
            }
            if (k < p) {
                c = C[k];
            }
            if (a < b && a < c) {
                list.add(a);
                i++;
            } else if (b < a && b < c) {
                list.add(b);
                j++;
            } else {
                if (c < a && c < b) {
                    list.add(c);
                    k++;
                }
            }
        }
        return list;
    }

    //Function to merge three sorted lists into a single list.
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[]) {
        //Storing the size of the three lists.
        int m = A.length;
        int n = B.length;
        int o = C.length;

        int i = 0, j = 0, k = 0;

        //Creating a list for storing output.
        ArrayList<Integer> list = new ArrayList<>();

        //Using three pointers over the three lists which helps in choosing
        //and storing the smallest element in the output list.
        while (i < m && j < n && k < o) {
            //Finding minimum of A[i], B[j] and C[k].
            int min = Math.min(Math.min(A[i], B[j]), C[k]);

            //We store the minimum value in output list. 
            list.add(min);

            //Incrementing the pointer which had the minimum value.
            if (min == A[i]) {
                i++;
            } else if (min == B[j]) {
                j++;
            } else if (min == C[k]) {
                k++;
            }
        }

        //If C has exhausted(its pointer has crossed last element) then 
        //we continue storing the minimum values from other two lists.
        while (i < m && j < n) {
            if (A[i] <= B[j]) {
                list.add(A[i]);
                i++;
            } else {
                list.add(B[j]);
                j++;
            }
        }

        //If B has exhausted(its pointer has crossed last element) then 
        //we continue storing the minimum values from other two lists.
        while (i < m && k < o) {
            if (A[i] <= C[k]) {
                list.add(A[i]);
                i++;
            } else {
                list.add(C[k]);
                k++;
            }
        }

        //If A has exhausted(its pointer has crossed last element) then 
        //we continue storing the minimum values from other two lists.
        while (j < n && k < o) {
            if (B[j] <= C[k]) {
                list.add(B[j]);
                j++;
            } else {
                list.add(C[k]);
                k++;
            }
        }

        //If B and C have exhausted (their pointer has crossed last element) then
        //we continue storing the minimum values from the last list A.
        while (i < m) {
            list.add(A[i]);
            i++;
        }

        //If A and C have exhausted (their pointer has crossed last element) then
        //we continue storing the minimum values from the last list B.
        while (j < n) {
            list.add(B[j]);
            j++;
        }

        //If A and B have exhausted (their pointer has crossed last element) then
        //we continue storing the minimum values from the last list C.
        while (k < o) {
            list.add(C[k]);
            k++;
        }
        //returning the resultant list.
        return list;

    }
}

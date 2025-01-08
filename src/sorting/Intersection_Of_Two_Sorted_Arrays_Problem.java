/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Intersection_Of_Two_Sorted_Arrays_Problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4}, arr2[] = {2, 4, 6, 7, 8};
        System.out.println(intersection(arr1, arr2).toString());
        
        int arr3[] = {1, 2, 2, 3, 4}, arr4[] = {2, 2, 4, 6, 7, 8};
        System.out.println(intersection(arr3, arr4).toString());
        
        int arr5[] = {1, 2}, arr6[] = {3, 4};
         System.out.println(intersection(arr5, arr6).toString());
        
    }

    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (i > 0 && arr1[i - 1] == arr1[i]) {
                i++;
                continue;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        return list;
    }

}

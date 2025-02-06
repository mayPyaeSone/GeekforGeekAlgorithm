/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.builin.methods.array.sorts;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author User
 */
public class SortExample {

    public static void main(String[] args) {
        String arr[] = {"practice.geeksforgeeks.org",
            "quiz.geeksforgeeks.org",
            "code.geeksforgeeks.org"
        };

        // Sorts arr[] in ascending order
        Arrays.sort(arr);
        System.out.printf("Modified arr[] : \n%s\n\n",
                Arrays.toString(arr));

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.printf("Modified arr[] : \n%s\n\n",
                Arrays.toString(arr));
    }

}

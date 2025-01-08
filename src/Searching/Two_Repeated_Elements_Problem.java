/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.HashSet;

/**
 *
 * @author User
 */
public class Two_Repeated_Elements_Problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 4;
        int arr[] = new int[]{1, 2, 1, 3, 4, 3};
        twoRepeated(n, arr);
    }

    static int[] twoRepeated(int n, int arr[]) {
        HashSet<Integer> seen = new HashSet<>();
        int first = -1;
        //int second = -1;
        int nArr[] = new int[2];
        
        for (int i = 0; i<arr.length;i++){
            if (seen.contains(arr[i])) {
                if (first == -1) {
                    first = arr[i];
                    nArr[0] = first;
                } else {
                   // second = arr[i];
                    nArr[1] = arr[i];
                    break;
                }
            } else {
                seen.add(arr[i]);
            }
            
        }
        return nArr;
    }

}

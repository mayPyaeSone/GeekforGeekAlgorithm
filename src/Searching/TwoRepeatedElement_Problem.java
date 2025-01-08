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
public class TwoRepeatedElement_Problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 3, 4, 3};
      int ans[]=  twoRepeated(6, arr);
      for(int i: ans){
          System.out.println(i);
      }
    }

    public static int[] twoRepeated(int n, int arr[]) {
        HashSet<Integer> seen = new HashSet<>();
        int first = -1, second = -1;
        int nArr[] = new int[2];
        int i = 0;

        for (int num : arr) {
            if (seen.contains(num)) {
                if (first == -1) {
                    first = num;
                    nArr[0] = first;
                } else {
                    second = num;
                    nArr[1] = second;
                    break;
                }
            } else {
                seen.add(num);

            }
        }
        return nArr;
    }

}

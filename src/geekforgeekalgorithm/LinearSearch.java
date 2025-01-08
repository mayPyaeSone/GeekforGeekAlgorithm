/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geekforgeekalgorithm;

/**
 *
 * @author User
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int arr[]={2,8,12,9};
 	int x=12;
     int n = arr.length;
 	System.out.print(x+" is present in index : " + search(arr,n,x));
    }

    static int search(int arr[],int n ,int x) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}

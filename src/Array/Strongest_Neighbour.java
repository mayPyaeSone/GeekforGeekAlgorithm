/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author User
 */
public class Strongest_Neighbour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // maximumAdjacent(6, new int[]{1,2,2,3,4,5});
        maximumAdjacent(2, new int[]{5,5});
    }
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        
        for(int i = 0; i<sizeOfArray-1;i++){
             int max = Math.max(arr[i],arr[i+1]);
             System.out.print(max+" ");
        }
        
    }
}

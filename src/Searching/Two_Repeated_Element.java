/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

/**
 *
 * @author User
 */
public class Two_Repeated_Element {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int  arr[] = new int[]{1, 2, 1, 3, 4, 3};
        for(int i :twoRepeated(arr)){
            System.out.println(i+" ");
        }
    }
    
    public static int[] twoRepeated(int[]arr){
        int[] ansArr  = new int[2];
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            int index = Math.abs(arr[i]);
            if(arr[i]>0){
                arr[index] *=-1;
            }else{
                ansArr[j++]=Math.abs(arr[i]);
            }
        }
        
        return ansArr;
    }
    
}

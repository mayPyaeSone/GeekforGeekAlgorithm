/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import util.context.Context;

/**
 *
 * @author User
 */
public class Print_Non_Repeated_Elements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int arr_1[] = {1,1,2,2,3,3,4,5,6,7};
        System.out.println(printNonRepeated(arr_1)); 
    }

     static ArrayList<Integer> printNonRepeated(int arr[])
    {
       LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
       
       for(int num: arr){
           hm.put(num, hm.getOrDefault(num,0)+1);
       }
       ArrayList<Integer> list  = new ArrayList<>();
      
      for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
          if(entry.getValue().equals(1)){
              list.add(entry.getKey());
          }
      }
      return list;
    }
}

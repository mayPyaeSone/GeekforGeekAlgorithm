/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashing;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Separate_Chaining_In_Hashing {

    static void print(ArrayList<ArrayList<Integer>> list) {
        for (ArrayList<Integer> arrL : list) {
            for (Integer i : arrL) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //Input: hashSize = 10 sizeOfArray = 6 arr[] = {92,4,14,24,44,91}
        Separate_Chaining_In_Hashing hash = new Separate_Chaining_In_Hashing();
        //  hash.separateChaining(new int[]{92, 4, 14, 24, 44, 91}, 6, 10);
        print(hash.separateChaining(new int[]{92, 4, 14, 24, 44, 91}, 6, 10));
    }

    public ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize) {
        Node node = new Node(hashSize);
        for (int i = 0; i < arr.length; i++) {
            node.insert(arr[i]);
        }
        return node.table;
    }

}

class Node {

    int BUCKET;
    ArrayList<ArrayList<Integer>> table;

    Node(int bucket) {
        this.BUCKET = bucket;
        this.table = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < bucket; i++) {
            table.add(new ArrayList<Integer>());
        }
    }

    void insert(int key) {
        int index = key % BUCKET;
        table.get(index).add(key);
    }
    
}

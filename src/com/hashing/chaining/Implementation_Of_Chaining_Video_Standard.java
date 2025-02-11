/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashing.chaining;

/**
 *
 * @author User
 */
import java.util.*;

public class Implementation_Of_Chaining_Video_Standard {
//The main class is MyHash
}

class MyHash {

    int BUCKET;
    ArrayList<LinkedList<Integer>> table;

    MyHash(int b) {
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(int key) {
        int index = key % BUCKET;
        table.get(index).add(key);
    }

    boolean search(int key) {
        int index = key % BUCKET;
        return table.get(index).contains(key);
//        LinkedList<Integer> list = table.get(index);
//        for (int i : list) {
//            if (key == i) {
//                return true;
//            }
//        }
//        return false;

    }

    void delete(int key) {
        int index = key % BUCKET;
        table.get(index).remove(key);
//        LinkedList<Integer> list = table.get(index);
//        {
//            for (int i = 0; i < list.size(); i++) {
//                if (key == list.get(i)) {
//                    list.remove(i);
//                }
//            }
//        }
    }
}

class GFG {
    // Driver method to test Map class 

    public static void main(String[] args) {
        MyHash mh = new MyHash(7);
        mh.insert(10);
        mh.insert(20);
        mh.insert(15);
        mh.insert(7);
        System.out.println(mh.search(10));
        mh.delete(15);
        System.out.println(mh.search(15));
    }
}

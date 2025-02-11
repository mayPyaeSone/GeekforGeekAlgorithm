/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashing.chaining;

import java.util.*;
public class Implementation_Of_Chaining_Article_Method_1{
    
}
class Hash {
    int BUCKET;    // No. of buckets

    // Array to hold the buckets
    LinkedList<Integer> table[];

    // Constructor to initialize the hash table
    Hash(int b) {
        this.BUCKET = b;
        table = new LinkedList[BUCKET];
        
        // Initialize each bucket as a LinkedList
        for (int i = 0; i < BUCKET; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function to map values to a key
    int hashFunction(int x) {
        return (x % BUCKET);
    }

    // Inserts a key into the hash table
    void insertItem(int key) {
        int index = hashFunction(key);
        table[index].add(key);
    }

    // Deletes a key from the hash table
    void deleteItem(int key) {
        int index = hashFunction(key);
        
        // Check if the key exists and remove it
        if (table[index].contains(key)) {
            table[index].remove(Integer.valueOf(key));
        }
    }

    // Function to display the hash table
    void displayHash() {
        for (int i = 0; i < BUCKET; i++) {
            System.out.print(i);
            for (Integer x : table[i]) {
                System.out.print(" --> " + x);
            }
            System.out.println();
        }
    }

    // Driver program
    public static void main(String[] args) {
        // Array containing keys to be mapped
        int[] a = {15, 11, 27, 8, 12};
        int n = a.length;

        // Create a hash table with 7 buckets
        Hash h = new Hash(7);
        
        // Insert keys into the hash table
        for (int i = 0; i < n; i++) {
            h.insertItem(a[i]);
        }

        // Delete 12 from the hash table
        h.deleteItem(12);

        // Display the hash table
        h.displayHash();
    }
}

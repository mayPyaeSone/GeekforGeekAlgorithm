/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashing;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Open_Addressing_Simple_With_Dummy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}

class HashNode {

    int key;
    int value;

    public HashNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class HashTable {

    private static final int capacity = 10;
    private static int size = 0;
    private static HashNode[] arr;
    private static HashNode dummy;

    // Function to add key-value pair
    public static void insert(int key, int value) {
        HashNode temp = new HashNode(key, value);
        int hashIndex = key % capacity;
        int h = hashIndex;
        if (size == capacity) {
            System.out.println("It's beyound the capacity");
            return;
        }
        while (arr[hashIndex] != null && arr[hashIndex].key != key && arr[hashIndex].key != -1) {
            hashIndex++;
            hashIndex = hashIndex % capacity;
//            if (hashIndex == h) {
//                System.out.println("It's beyound the capacity");
//                return;
//            }
        }

        if (arr[hashIndex] == null || arr[hashIndex].key == -1) {
            size++;
        }
        arr[hashIndex] = temp;
    }

    // Function to delete a key-value pair
    public static boolean deleteKey(int key) {
        int hashIndex = key % capacity;
        int h = hashIndex;
        while (arr[hashIndex] != null) {
            if (arr[hashIndex].key == key) {
                arr[hashIndex] = dummy;
                size--;
                return true;
            }
            hashIndex++;
            hashIndex %= capacity;
            if (h == hashIndex) {
                break;
            }
        }
        return false;
    }

    // Function to search for a value
    public static int find(int key) {
        int hashIndex = key % capacity;
        int counter = 0;

        while (arr[hashIndex] != null) {
            if (counter++ > capacity) {
                break;
            }
            if (arr[hashIndex].key == key) {
                return arr[hashIndex].value;
            }
            hashIndex++;
            hashIndex %= capacity;
        }
        return -1;
    }

    // Driver Code
    public static void main(String[] args) {
        arr = new HashNode[capacity];
        Arrays.fill(arr, null);
        dummy = new HashNode(-1, -1);

        insert(1, 5);
        insert(1, 3);
        insert(2, 15);
        insert(3, 20);
        insert(4, 7);
        insert(5, 12);
        insert(6, 13);
        insert(7, 11);
        insert(8, 11);
        insert(9, 11);
        insert(10, 11);
        insert(11, 30);

        if (find(4) != -1) {
            System.out.println("Value of Key 4 = " + find(4));
        } else {
            System.out.println("Key 4 does not exist");
        }

        if (deleteKey(4)) {
            System.out.println("Node value of key 4 is deleted successfully");
        } else {
            System.out.println("Key does not exist");
        }
        deleteKey(4);
        if (find(4) != -1) {
            System.out.println("Value of Key 4 = " + find(4));
        } else {
            System.out.println("Key 4 does not exist");
        }
        if (find(1) != -1) {
            System.out.println("Value of Key 1 = " + find(1));
        } else {
            System.out.println("Key 1 does not exist");
        }
    }
}

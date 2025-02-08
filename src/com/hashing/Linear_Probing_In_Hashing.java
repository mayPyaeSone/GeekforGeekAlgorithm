/*
Input:
hashSize = 10
sizeOfArray = 4 
Array[] = {4,14,24,44}
Output:
-1 -1 -1 -1 4 14 24 44 -1 -1
Explanation: 
4%10=4, So put 4 in hashtable[4].
Now, 14%10=4, but hashtable[4] is already filled so put 14 in the next slot and so on for further elements.


Input:
hashSize = 10
sizeOfArray = 4 
Array[] = {9,99,999,9999}
Output:
99 999 9999 -1 -1 -1 -1 -1 -1 9
Explanation: 
9%10=9, So put 9 in hashtable[9]. 
Now, 99%10=9, but hashtable[9] is already filled so put 99 in the (99+1)%10 = 0 slot so 99 goes into hashtable[0] and so on for further elements.
 */
package com.hashing;

import java.util.Arrays;
import util.context.Context;

/**
 *
 * @author User
 */
public class Linear_Probing_In_Hashing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr_1[] = {4, 14, 24, 44};
        //Context.print1DArray(linearProbing_editorial(10, arr_1, 4)); //hashSize = 10 sizeOfArray = 4 
        int arr_2[] = {9, 99, 999, 9999};
        //Context.print1DArray(linearProbing_editorial(10, arr_2, 4));// hashSize = 10 sizeOfArray = 4 
        int arr_3[] = {9, 4, 12, 18, 10, 17, 15, 3, 15, 0, 20};
        Context.print1DArray(linearProbing(6, arr_3, 11));// hashSize = 6 sizeOfArray = 11

    }

    static int[] linearProbing(int hash_size, int arr[], int sizeOfArray) {
        int hash[] = new int[hash_size];
        Arrays.fill(hash, -1);
        for (int i = 0; i < sizeOfArray; i++) {
            int index = arr[i] % hash_size;
            if (hash[index] != -1) {
                int j = 1;
                while (hash[index] != -1 && index < hash_size) {
                    index = (arr[i] + j) % 10;
                    j++;
                }
            }
            hash[index] = arr[i];

        }
        return hash;
    }

    static int[] linearProbing_editorial(int hash_size, int arr[], int array_size) {
        int hash_table[] = new int[hash_size];

        //storing -1 at all indexes in the hash table.
        for (int i = 0; i < hash_size; i++) {
            hash_table[i] = -1;
        }

        //iterating over the array. 
        for (int i = 0; i < array_size; i++) {
            //if the value of hash table at index (arr[i]%hashSize) is -1 
            //which means empty then, we insert arr[i] at that place.
            if (hash_table[arr[i] % hash_size] == -1) {
                hash_table[arr[i] % hash_size] = arr[i];
            } //else we move linearly from the filled position 
            //to find an index with -1 in hash table.
            else {
                int counter = 0;
                int k = (arr[i]) % hash_size;
                int flag = 0;
                //using a loop which runs until we find an index with -1
                //in hash table which means empty.
                while (counter < hash_size && hash_table[k] != -1) {
                    if (hash_table[k] == arr[i]) {
                        flag = 1;
                        break;
                    }
                    k = (k + 1) % hash_size;
                    counter++;
                }
                if (flag == 1) {
                    continue;
                }
                //if we find a position where arr[i] can be inserted 
                //then we insert the element.
                if (counter < hash_size) {
                    hash_table[k] = arr[i];
                }
            }
        }
        //returning the hash table.
        return hash_table;
    }
}

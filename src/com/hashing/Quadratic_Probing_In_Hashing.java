/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashing;

import java.util.Arrays;
import util.context.Context;
import util.context.ReadPropertyFile;
import util.context.ReadTextFile;

/**
 *
 * @author User
 */
public class Quadratic_Probing_In_Hashing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test Case 1
        int arr_1[] = {21, 10, 32, 43};
        int hashSize_1 = 11, n_1 = 4;
        int hash_1[] = new int[hashSize_1];
        Arrays.fill(hash_1, -1);
        quadraticProbing(hash_1, hashSize_1, arr_1, n_1);
        Context.print1DArray(hash_1);
        
        //Test Case 2
        int hashSize_2 = 11, n_2 = 4, arr_2[] = {880, 995, 647, 172};
        int hash_2[] = new int[hashSize_2];
        Arrays.fill(hash_2, -1);
        quadraticProbing(hash_2, hashSize_2, arr_2, n_2);
        Context.print1DArray(hash_2);

        //Test Case 3
        ReadPropertyFile.read("inputFile");
        int[] arr_3 = ReadTextFile.txtFileToArray(ReadPropertyFile.read("inputFile"));
        int hashSize_3 = 67;
        int hash_3[] = new int[hashSize_3];
        quadraticProbing(hash_3, hashSize_3, arr_3, arr_3.length);
        Context.print1DArray(hash_3);

    }

    static void quadraticProbing(int[] hash, int hash_size, int arr[], int N) {
        Arrays.fill(hash, -1);
        int count = 0;
        for (int i = 0; i < arr.length && count < hash_size; i++) {

            int index = arr[i] % hash_size;
            int flag = 0;
            if (hash[index] != -1) {
                int j = 1;

                while (hash[index] != -1) {
                    if (hash[index] == arr[i]) {
                        flag = 1;
                        break;
                    }
                    index = (arr[i] + (j * j)) % hash_size;
                    j++;
                }
            }
            if (flag == 1) {
                continue;
            }
            hash[index] = arr[i];
            count++;

        }
    }
}

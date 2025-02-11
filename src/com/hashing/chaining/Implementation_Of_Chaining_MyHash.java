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

class Implementation_Of_Chaining_MyHash
{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;
    Implementation_Of_Chaining_MyHash(int b)
    {
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i=0; i<b; i++)
           table.add(new LinkedList<Integer>());
    }
    void insert(Integer k)
    {
        int i = k % BUCKET;
        table.get(i).add(k);
    }
    boolean search(Integer k)
    {
        int i = k % BUCKET;
        return table.get(i).contains(k);
    }
    void delete(Integer k)
    {
        int i = k % BUCKET;
        table.get(i).remove(k);
    }
}

class GFG
{
	// Driver method to test Map class 
	public static void main(String[] args) 
	{ 
	    Implementation_Of_Chaining_MyHash mh = new Implementation_Of_Chaining_MyHash(7);
	    mh.insert(10);
	    mh.insert(20);
	    mh.insert(15);
	    mh.insert(7);
	    System.out.println(mh.search(10));
	    mh.delete(15);
	    System.out.println(mh.search(15));
	} 
} 


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package big_magic;

/**
 *
 * @author User
 */
// Java program to find the element occurring
// odd number of times
class OddOccurrence {
	
	// function to find the element occurring odd
	// number of times
	static int getOddOccurrence(int arr[], int arr_size)
	{
		int i;
		for (i = 0; i < arr_size; i++) {
			int count = 0;
			for (int j = 0; j < arr_size; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count % 2 != 0)
				return arr[i];
		}
		return -1;
	}
	static int findOdd(int arr[], int n)
    {
        int res = 0;
        
        for(int i = 0; i < n; i++)
        {
            res = res ^ arr[i];
        }
        
        return res;
    }
	// driver code
	public static void main(String[] args)
	{
		//int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4,1 };
          //int arr[]= {4, 3, 4, 4, 5, 5, 3};
          int arr[]= { 3, 4, 3, 3,4, 5,5};
		int n = arr.length;
		//System.out.println(getOddOccurrence(arr, n));
          System.out.println(findOdd(arr, n));
	}
}


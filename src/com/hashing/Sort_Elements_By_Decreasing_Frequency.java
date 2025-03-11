/*
 * Given an array of integers arr[], sort the array according to the frequency of elements, i.e. elements that have higher frequency comes first. If the frequencies of two elements are the same, then the smaller number comes first.

Examples :

Input: arr[] = [5, 5, 4, 6, 4]
Output: [4, 4, 5, 5, 6]
Explanation: The highest frequency here is 2. Both 5 and 4 have that frequency. Now since the frequencies are the same the smaller element comes first. So 4 4 comes first then comes 5 5. Finally comes 6. The output is 4 4 5 5 6.
Input: arr[] = [9, 9, 9, 2, 5]
Output: [9, 9, 9, 2, 5]
Explanation: The highest frequency here is 3. Element 9 has the highest frequency So 9 9 9 comes first. Now both 2 and 5 have the same frequency. So we print smaller elements first. The output is 9 9 9 2 5.
 */
package com.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author User
 */
public class Sort_Elements_By_Decreasing_Frequency {

    public static void main(String args[]) {
        int arr_1[] = {5, 5, 4, 6, 4};
        System.out.println(sortByFreq(arr_1));//Output: [4, 4, 5, 5, 6]

        int arr_2[] = {9, 9, 9, 2, 5};
        System.out.println(sortByFreq(arr_2));//Output: [9, 9, 9, 2, 5]
    }

    // Function to sort the array according to frequency of elements.
    public static ArrayList<Integer> sortByFreq(int arr[]) {
        int n = arr.length;
        // using map to keep count of the elements.
        HashMap<Integer, Integer> map = new HashMap<>();

        // storing the frequency of each element in map.
        for (int i = 0; i < n; i++) {
            int num = arr[i];

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 0);
            }
        }

        // copying the elements and their count from map to list.
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // sorting the list according to frequency.
        Collections.sort(list, new comparator());
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < map.size(); i++) {
            int count = list.get(i).getValue();
            // storing elements as many times as their count in output list.
            while (count >= 0) {
                ans.add(list.get(i).getKey());
                count--;
            }
        }
        // returning the output.
        return ans;
    }

}

class comparator implements Comparator<Map.Entry<Integer, Integer>> {

    // Function used in sorting list elements first according to frequency
    // and if it is same for both values, then smaller number comes first.
    @Override
    public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
        if (o1.getValue() > o2.getValue()) {
            return -1;
        } else if (o1.getValue().equals(o2.getValue())) {
            if (o2.getKey() < o1.getKey()) {
                return 1;
            } else {
                return -1;
            }

        } else if (o1.getValue() < o2.getValue()) {
            return 1;
        }

        return Integer.MIN_VALUE;
    }
}

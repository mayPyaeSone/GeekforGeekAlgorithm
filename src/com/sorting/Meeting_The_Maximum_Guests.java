/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Meeting_The_Maximum_Guests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrl[] = {1, 2, 10, 5, 5};
        int exit[] = {4, 5, 12, 9, 12};
        int n = arrl.length;
        findMaxGuests(arrl, exit, n);
    }

    static void findMaxGuests(int arrl[], int exit[],
            int n) {
        // Sort arrival and exit arrays
        Arrays.sort(arrl);
        Arrays.sort(exit);

        // guests_in indicates number of guests at a time
        int guests_in = 0, max_guests = 0, time = arrl[0];
        int i = 0, j = 0;

        // Similar to merge in merge sort to process
        // all events in sorted order
        while (i < n && j < n) {
            // If next event in sorted order is arrival,
            // increment count of guests
            if (arrl[i] <= exit[j]) {
                guests_in++;

                // Update max_guests if needed
                if (guests_in > max_guests) {
                    max_guests = guests_in;
                    time = arrl[i];
                }
                i++; //increment index of arrival array
            } else // If event is exit, decrement count
            { // of guests.
                guests_in--;
                j++;
            }
        }

        System.out.println("Maximum Number of Guests = "
                + max_guests + " at time " + time);
    }
}

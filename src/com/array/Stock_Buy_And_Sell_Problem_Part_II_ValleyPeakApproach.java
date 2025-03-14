/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array;

/**
 *
 * @author User
 */
public class Stock_Buy_And_Sell_Problem_Part_II_ValleyPeakApproach {

    static int maxProfit(int price[], int n) {
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (price[i] > price[i - 1]) {
                profit += price[i] - price[i - 1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 8, 12}, n = 5;

        System.out.println(maxProfit(arr, n));
    }

}

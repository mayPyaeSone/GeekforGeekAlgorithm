/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array;

import java.util.ArrayList;

/**
 *
 * @author User
 */
class Stock_Buy_And_Sell_Problem {

    public static void main(String[] args) {
        stockBuySell(new int[]{100, 180, 260, 310, 40, 535, 695});
        stockBuySell(new int[]{4, 2, 2, 2});
    }

    //Function to find the days of buying and selling stock for max profit.
    static ArrayList<ArrayList<Integer>> stockBuySell(int arr[]) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        //Prices must be given for at least two days else return the empty result.
        if (arr.length == 1) {
            return result;
        }

        //Creating solution vector.
        ArrayList<Interval> sol = new ArrayList<>();
        int i = 0, cnt = 0;
        //Traversing through given price array.
        while (i < arr.length - 1) {
            //Finding Local Minima. Note that the limit of loop is (n-2)
            //as we are comparing present element to the next element.
            while ((i < arr.length - 1) && (arr[i + 1] <= arr[i])) {
                i++;
            }
            //If we reach the end, we break loop as no further 
            //solution is possible.
            if (i == arr.length - 1) {
                break;
            }
            
            Interval e = new Interval();
            //Storing the index of minima which gives the day of buying stock.
            e.buy = i++;

            //Finding Local Maxima. Note that the limit of loop is (n-1)
            //as we are comparing present element to previous element.
            while ((i < arr.length) && (arr[i] >= arr[i - 1])) {
                i++;
            }

            //Storing the index of maxima which gives the day of selling stock.
            e.sell = i - 1;
            sol.add(e);
            //Incrementing count of buy/sell pairs.
            cnt++;
        }
        if (cnt == 0) {
            return result;
        } else {
            //Storing the buy/sell pairs in a list.
            for (int j = 0; j < sol.size(); j++) {
                result.add(new ArrayList<Integer>());
                result.get(j).add(0, sol.get(j).buy);
                result.get(j).add(1, sol.get(j).sell);
            }
        }
        System.out.println(result);
        //returning the result.
        return result;
    }
}

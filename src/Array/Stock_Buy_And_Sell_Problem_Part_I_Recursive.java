/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author User
 */


class Stock_Buy_And_Sell_Problem_Part_I_Recursive {

    static int maxProfit(int price[], int start, int end) {
        System.out.println("maxProfit() start: " + start + " end: " + end);
        if (end <= start) {
            return 0;
        }

        int profit = 0;

        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (price[j] > price[i]) {
                    int curr_profit = price[j] - price[i]
                            + maxProfit(price, start, i - 1)
                            + maxProfit(price, j + 1, end);

                    profit = Math.max(profit, curr_profit);
                    //System.out.println("profit: "+profit+ " curr_profit: "+curr_profit);
                }
            }
        }

        return profit;
    }

    public static void main(String args[]) {
//        int arr[] = {1, 5, 3, 8, 12}, n = 5;
//        System.out.println(maxProfit(arr, 0, n - 1));
        int arr[] = {1, 4, 5, 3, 8, 12}, n = 5;

    }
 
}

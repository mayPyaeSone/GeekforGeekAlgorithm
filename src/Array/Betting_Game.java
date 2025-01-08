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
public class Betting_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // System.out.println(betBalance("WL"));
        // System.out.println(betBalance("WLWLLLWWLW"));
        System.out.println(betBalance("WLWLLWW"));
        System.out.println(betBalance_("WLWLLWW"));

    }
 static int betBalance_(String result)
    {
        //variable declaration for iterator and storing balance and bet amount
        int N, i, balance = 4, bet = 1;
        N = result.length();
        
        //loop for calculating the balance
        for(i = 0;i < N;i++ )
        {
            if(result.charAt(i) == 'W')
            {
                balance = balance + bet;
                bet = 1;
            }
            else
            {
                balance = balance - bet;
                bet = bet * 2;
            }
            if(balance < bet && i < N-1)
            {
                balance = -1;
                break;
            }
        }
        return balance;
    }
    static int betBalance(String result) {
        int curr_sum = 4;
        int betAmount = 1;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == 'W') {
                curr_sum = curr_sum + betAmount;
                betAmount = 1;
            }
            else {
                curr_sum = curr_sum -betAmount;
                betAmount = betAmount * 2;
            }
            if (curr_sum < betAmount && i<result.length()-1) {
                return -1;
            }
        }
        return curr_sum;

    }

}

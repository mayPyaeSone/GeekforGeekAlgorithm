/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author User
 */
public class Powers_of_Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println(power(2, 2));
//        System.out.println(power(12, 21));
//        System.out.println(power(4, 4));
//        System.out.println(power(21, 12)); //459895852
//        System.out.println(power(11, 11));//311668616
       // System.out.println(power_dividedAndConquer(12, 21));
        //System.out.println(power_dividedAndConquer(11, 11));//311668616
      //  System.out.println(power(6, 6));
        System.out.println(power_dividedAndConquer(6, 6));
    }
    //User function Template for Java

    public static long modfun(long n, long R) {
        // Base cases 
        if (n == 0) {
            return 0;
        }
        // power zero mean answer is 1
        if (R == 0) {
            return 1;
        }
        // If R is even 
        long y;
        if (R % 2 == 0) {
            // finding r/2 power as power is even then storing answer in y and if power is even like 2^4 we can simply do (2^2)*(2^2)
            System.out.println("modfun(n, R / 2)"+n+" "+R/2);
            y = modfun(n, R / 2);
            y = (y * y) % 1000000007;
        } // If R is odd 
        else {
            
            // reduce the power by 1 to make it even. The reducing power by one can be done if we take one n out. Like 2^3 can be written as 2*(2^2)
             System.out.println("modfun(n, R -12)"+n+" "+(R-1));
            y = ((n % 1000000007) * (modfun(n, R - 1) % 1000000007)) % 1000000007;
        }
        // finally return the answer (y+mod)%mod = (y%mod+mod%mod)%mod = (y%mod)%mod
        System.out.println("modfun(n, R)"+n+" "+(R));
        System.out.println("y:"+y+" return::::"+(y + 1000000007) % 1000000007);
        return ((y + 1000000007) % 1000000007);
    }

    static long power_dividedAndConquer(int N, int R) {
        return modfun(N, R) % 1000000007;

    }

    static long power(int N, int R) {
        int MOD = (int) (1e9 + 7);
        // step 1
        if (R == 0) {
            return 1;
        }
        // step 2
        long ans = power(N, R - 1);
        // step 3 . note we need to do mod as the result may
        // overflow
        ans = (ans % MOD * N % MOD) % MOD;
        return ans;

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geekforgeekalgorithm;

/**
 *
 * @author User
 */
public class AdditionalModulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println(sumUnderModulo(9223372036854775807L, 9223372036854775807L));
//        System.out.println(sumUnderModulo(1000000007L, 1000000007L));
        System.err.println(multiplicationUnderModulo(92233720368547758L,92233720368547758L));
        System.out.println(multiplicationUnderModulo(1000000007L, 1000000007L));
    }

    public static long sumUnderModulo(long a, long b) {
        long m = 1000000007;
        long aTemp = a % m;
        long bTemp = b % m;
        long res = (aTemp + bTemp) % m;
        return res;
    }
    public static long multiplicationUnderModulo(long a, long b) {
        long m = 1000000007;
        long aTemp = a % m;
        long bTemp = b % m;
        long res = (aTemp * bTemp) % m;
        return res;
    }
     public int modInverse(int a, int m)
    {
      return 1;
    }

    int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}

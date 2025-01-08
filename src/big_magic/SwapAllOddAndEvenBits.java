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
public class SwapAllOddAndEvenBits {

    public static boolean isSparse(int n) {
        if(((n | 0x55555555)==0x55555555) ||((n | 0xAAAAAAAA)==0xAAAAAAAA)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSparse(2));//true
        System.out.println(isSparse(3));//false
    }

}

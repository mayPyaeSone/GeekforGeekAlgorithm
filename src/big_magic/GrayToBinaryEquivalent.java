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
public class GrayToBinaryEquivalent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(grayToBinary(4));//6 ==>7
        System.out.println(grayToBinary(5));//7 ==>6
        System.out.println(grayToBinary(6));//5 ==>4
        System.out.println(grayToBinary(7));//4 ==>5
                
    }

    public static int grayToBinary(int n) {
        int b = 0;

        //We use a loop and Right shift n everytime until it becomes 0.
        for (n = n; n > 0; n = n >> 1) //We use XOR operation which stores the result of conversion in b.
        {   System.out.println("n:"+n+" b:"+b);
            b ^= n;
        }

        //returning the Binary equivalent.
        return b;
    }
}

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
public class GPTerm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(termOfGP(1, 2, 5));
    }

    public static double termOfGP(int A, int B, int N) {
        double comR =(double) 1/2;
        System.out.println(comR);
        double nTerm = A * Math.pow(comR, N - 1);
        return nTerm;
    }

}

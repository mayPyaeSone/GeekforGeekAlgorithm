/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.context;

/**
 *
 * @author User
 */
public class Context {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static void print2DArray(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j : mat[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

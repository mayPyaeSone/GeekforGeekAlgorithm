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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //System.out.println(diffRightmost(11, 9));
         //System.out.println(diffRightmost(52, 4));
        // System.out.println(countBitsFlip(10,20));
         System.out.println(countBitsFlip(20,25));
    }
    static int diffRightmost(int m, int n){
        if(m==0 || n==0) return -1;
        int count = 1;
       while(!(m==0&&n==0)){
          int mset = m&1;
          int nset = n&1;
          if(mset!=nset)
              return count;
          m >>=1;
          n >>=1;
          count++;
       } 
       return 0;
    }
    
        static int countBitsFlip(int a, int b){
        if(a==0 || b==0) return -1;
        int count = 0;
       while(!(a==0&&b==0)){
          if((a&1) != (b&1))
              count++;
          a >>=1;
          b >>=1;
       } 
       return count;
    }
}

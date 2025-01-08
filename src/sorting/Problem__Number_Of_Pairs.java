/*
 * Given two positive integer arrays arr and brr, find the number of pairs such that xy > yx (raised to power of) where x is an element from arr and y is an element from brr.

*Examples :(1)
*Input: arr[] = [2, 1, 6], brr[] = [1, 5]
*Output: 3
*Explanation: The pairs which follow xy > yx are: 21 > 12,  25 > 52 and 61 > 16 .

*Examples :(2)
*Input: arr[] = [2 3 4 5], brr[] = [1 2 3]
*Output: 5
*Explanation: The pairs which follow xy > yx are:21 > 12 , 31 > 13 , 32 > 23 , 41 > 14 , 51 > 15 .

*Expected Time Complexity: O((N + M)log(N)).
*Expected Auxiliary Space: O(1).

*Constraints:
*1 ≤ arr.size(), brr.size() ≤ 105
*1 ≤ brr[i], arr[i] ≤ 103
*
 */
package sorting;

import java.util.Arrays;
import static java.util.Arrays.sort;

/**
 *
 * @author User
 */
public class Problem__Number_Of_Pairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {2, 1, 6};
        int brr[] = {1, 5};
        //System.out.println(countPairs_naive(arr, brr));// Output :: 3
        //System.out.println(countPairs(arr, brr, 3, 2));
        System.out.println(countPairs(arr,brr,arr.length,brr.length));
    }

    /**
     * Naïve Approach :: O( n^m )
     *
     * @param x
     * @param y
     * @return
     */
    static long countPairs_naive(int x[], int y[]) {
        int count = 0;
        for (int i : y) {
            for (int j = 0; j < x.length; j++) {
                if (Math.pow(x[j], i) > Math.pow(i, x[j])) {
                    System.out.println(i + " " + x[j]);
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Editorial Approach :: O((N + M)log(N))
     *
     * @param x
     * @param y
     * @return
     */
    static long countPairs(int x[], int y[], int M, int N) {
        // Array to store counts of 0, 1, 2, 3 and 4 present in array y.
        int[] freq = new int[5];
        // Storing the count in array if y[i]<5.
        for (int i = 0; i < N; i++) {
            if (y[i] < 5) {
                freq[y[i]]++;
            }
        }
        // Sorting y[] so that we can do binary search on it later on.
        Arrays.sort(y);
        long ans = 0;
        // Taking every element of x[] and counting pairs with it.
        for (int i = 0; i < x.length; i++) {
            // If x[i] is 0, then there can't be any value in y[]
            // such that x[i]^y[val]>y[val]^x[i].
            if (x[i] == 0) {
                continue;
            }
            // If x[i] is 1, then the number of pair is equal to
            // number of zeroes in y[].
            if (x[i] == 1) {
                ans = ans + (long) freq[0];
                continue;
            }
            // We work with logic that if x<y then x^y is greater than y^x.
            // Finding number of elements in y[] with value greater than x.
            // binary() gets address of first element greater than x[i] in y[].
            int ind = binary(M, N, x[i], y);
            // Updating number of pairs.
            // If we have reached here, then x must be greater than 1.
            // Increasing number of pairs for y=0 and y=1 .
            ans = ans + (long) (N - ind) + (long) freq[0] + (long) freq[1];
            // Decreasing number of pairs for exception where x=2
            // and (y=4 or y=3).
            if (x[i] == 2) {
                ans = ans - (long) freq[3] - (long) freq[4];
            }
            // Increasing number of pairs for exception where x=3 and y=2.
            if (x[i] == 3) {
                ans = ans + (long) freq[2];
            }
        }
        // returning number of pairs.
        return ans;
    }

    // Function to find upper bound using binary search.
    static int binary(int M, int N, int x, int[] y) {
        int high = N - 1, low = 0;
        int ans = high + 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (y[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static long countPairs_(int x[], int y[], int M, int N) {

        int ans = 0, i, j, c0 = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        sort(x);
        sort(y);
        for (i = 0; i < y.length; i++) {
            if(y[i]==0){
                c0++;
            }else if (y[i] == 1){
                c1++;
            }else if (y[i] == 2){
                c2++;
            }else if (y[i] == 3){
                c3++;
            }else if (y[i] == 4){
                c4++;
            }
        }
        j = 0;
        for(i = 0; i < x.length; i++){
            if(x[i]==0){
                ;
            }else if (x[i] == 1){
                ans = ans + 0;
            }else{
                ans = ans + c0 +c1;
                while(j < y.length && y[j]<= x[i]){
                    j++;
                }
                    ans = ans +(y.length- j);
                    if(x[i]==2){
                        ans -= c3;
                        ans -= c4;                        
                    }else if( x[i]==3){
                        ans+=c2;
                    }
            }
        }

        return ans;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author User
 */
public class Print_Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public List<Integer> pattern(int n) {
        f(n, n, 0);
        return arr;
    }
    List<Integer> arr = new ArrayList<>();

    void f(int curr, int n, int type) {
        if (curr <= 0) {
            type = 1;
        }

        arr.add(curr);

        if (curr == n && type == 1) {
            return;
        }

        if (type == 0) {
            f(curr - 5, n, type);
        } else {
            f(curr + 5, n, type);
        }
    }
    static int oriNum;
// worong thiking step
//    public static List<Integer> pattern(int n, boolean flag, List<Integer> list) {
//        list = new ArrayList<>();
//
//        if (n <= 0) {
//            System.out.println(n);
//            list.add(n);
//            flag = true;
//            list = pattern(n + 5, flag, list);
//        }
//        if (n > 0 && !flag) {
//            System.out.println(n);
//            list.add(n);
//            list = pattern(n - 5, flag, list);
//        }
//        if (n > 0 && flag) {
//            if (oriNum == n) {
//                System.out.println(n);
//                list.add(n);
//                return list;
//            }
//            System.out.println(n);
//            list.add(n);
//            list = pattern(n + 5, flag, list);
//        }
//
//        return list;
//    }
}

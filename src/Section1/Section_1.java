/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section1;

import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author Daven
 */
public class Section_1 {

    public static void main(String args[]) {
        System.out.println(mystery(2, 2));
        //System.out.println(1/2);
    }

    public static void fragment10() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - 1;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }

    public static int longFib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return longFib(n - 1) + longFib(n - 2);
    }
    
    public static int mystery(int a, int b){
        // int 1/2 = 0! 
        System.out.println("a: " + a + " b: " + b);
        if(b==0) return 0;
        if(b%2 == 0) return mystery (a+a, b/2);
        return mystery (a+a, b/2) +a;
    }
}

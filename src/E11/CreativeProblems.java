/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E11;

/**
 *
 * @author Daven
 */
public class CreativeProblems {
    public static void main (String[] args){
        System.out.println(binomial(100, 50, .25));
    }
    
    public static double binomial(int N, int K, double p){
        if ((N==0)&& (K==0))return 1.0;
        if((N<0)|| (K<0)) return 0.0;
        return (1-p)*binomial(N-1, K, p) + p*binomial(N-1, K, p);
    }
}

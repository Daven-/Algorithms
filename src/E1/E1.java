package E1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daven
 */
public class E1 {
    static long[] fib = new long[100];
    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            fib[i] = -1;
        }
        //1.1.13
        int[][] a = {{1,2},{3,4}};
        printTansposition(a);
        
        //1.1.14 - logarithm: How many of one number do we multiply to get another number?
        //log2(8)=3 how many times do we need to multiply 2 to get 8: 3 
        //log10(.01)=-1 A negative logarithm means how many times to divide by the number (1/10*1)
        System.out.println(log2(45));
        
        //1.1.16
        exR1(6);
        
        //1.1.18
        System.out.println(mystery(2, 25)); // = 50
        System.out.println(mystery(3, 11)); // = 33
        
        // 1.1.19
         for (int N = 0; N < 100; N++){       
             fib[N] = F(N);
             //System.out.println(N + " " + fib[N]);
         }
         
        // 1.1.20 recursive factorial
         System.out.println(ln(4));
         

               
    }
    
    // 1.1.20 recursive factorial
    public static int ln(int N){
        if(N==0){
            return 1;
        }
        return N*ln(N-1);
    }
    
    // 1.1.19
    public static long F(int N){   
        if(fib[N] != -1){
            return fib[N];
        }
        if (N == 0) return 0;      
        if (N == 1) return 1;
        return F(N-1) + F(N-2);   
    }
    
    public static void printTansposition(int[][] a){
        for (int i = 0; i < a.length; i++) {
            
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[j][i]); // will only work with MxM matrices 
            }
            System.out.println();
        }
    }
    
    // return an integer that is not larger than the logbase 2 of n
    public static int log2(int n){
        int count = 0;
        int j = 2; // logbase 
        int log = 1;
        int ans = 2;
        
        if(n>=2){
        for(int i = 2; i<n; i++){
            j *= 2;
            if(j>n && count == 0){
                count++;
                log =  i-1;
            }
        }
        for (int i = 2; i <= log; i++) {
            ans *=2;
        }
        }
        
        System.out.println("logbase2("+n+")"+" :"+ans);
        return log;
    }
    
    // 1.1.16
    public static String exR1(int n) {   
        if (n <= 0) return "";   
    return exR1(n-3) + n + exR1(n-2) + n; 
    }
    
    // 1.1.18
    public static int mystery(int a, int b) {   
        if (b == 0)     
            return 0;   
        if (b % 2 == 0) 
            return mystery(a+a, b/2);   
        return mystery(a+a, b/2) + a; 
    }
    
    
    
       
}

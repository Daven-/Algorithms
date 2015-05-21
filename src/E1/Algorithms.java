/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Daven
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();

        /* int[] a = new int[10000000];
       

         for (int i = 0; i < a.length; i++) {
         a[i] = r.nextInt(1000000);
         }*/
        //Arrays.sort(a);
        //binarySearch(a, 2907, 0, a.length - 1);
        //dPrint();
        //sum2();
        //System.out.println((char) ('a' + 4)); // adds the numbers together
        //System.out.println('b'+'c'); // adds the numbers together
        //System.out.println(binary(20));
        boolean[][] b = {{true, false, true, false, false, true}, {true, false, true, false, false, true}};
        boolArray(b);

        File file = new File("num.txt");
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            int x = 0;
        int y = 0;
        //int lim = 21;
        String[] array;
            try{
            while ((line = buffer.readLine()) != null) {
                line = line.trim();
                array = line.split(" ");
                x = Integer.parseInt(array[0]);
                y = Integer.parseInt(array[1]);
                //lim = Integer.parseInt(array[2]);
                // Process line of input Here
                for (int i = 1; i <= Integer.parseInt(array[2]); i++) {
                    if(i%x == 0 && i%y == 0){
                        System.out.print("BF ");
                    }else if(i%x == 0){
                        System.out.print("F ");
                    }else if(i%y == 0){
                         System.out.print("B ");
                    }else{
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
            }catch(IOException io){
                System.out.println("io error");
            }
        } catch (FileNotFoundException go) {
            System.out.println("file error");
        }

    }

    public static void boolArray(boolean[][] a) {
        for (int i = 0; i < a.length; i++) { // lengt of array is 2 - there are two arrays inside the array
            for (int j = 0; j < a[i].length; j++) { // get the inside length of the arrays notice i
                if (a[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static String binary(int i) {
        String s = "";
        for (int n = i; n > 0; n /= 2) {
            System.out.println(n);
            s = (n % 2) + s;
        }

        return s;
    }

    public static boolean binarySearch(int[] a, int key, int low, int high) {
        int mid = low + (high - low) / 2;
        System.out.println("low: " + low + "  high: " + high + "   middle: " + mid);
        if (key == a[low] || key == a[high] || low > high || key == a[mid]) {
            System.out.println("key found: " + a[low] + " = " + key);
            System.out.println("key found: " + a[high] + " = " + key);
            System.out.println("key found: " + a[mid] + " = " + key);

            return true;
        } else {
            if (key > a[mid]) {
                return binarySearch(a, key, mid, high);
            } else {
                return binarySearch(a, key, low, mid);
            }
        }

    }

    public static void dPrint() {
        double t = 9.0;

        while (Math.abs(t - 9.0 / t) > .001) {
            System.out.printf("%.5f\n", Math.abs(t - 9.0 / t));
            t = (9.0 / t + t) / 2.0;
            System.out.printf("%.5f\n", t);
        }
    }

    public static void sum() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static void sum2() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }
    
    /*
    File file = new File(args[0]);
        int x = 0;
        int y = 0;
        int lim = 21;
        String[] array;
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
                array = line.split(" ");
                x = Integer.parseInt(array[0]);
                y = Integer.parseInt(array[1]);
                lim = Integer.parseInt(array[2]);
                // Process line of input Here
                for (int i = 1; i <= lim; i++) {
                    if(i%x == 0 && i%y == 0){
                        System.out.print("BF ");
                    }else if(i%x == 0){
                        System.out.print("F ");
                    }else if(i%y == 0){
                         System.out.print("B ");
                    }else{
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
        }*/
    
    public static void reverse() throws FileNotFoundException, IOException{
        File file = new File("args[0]");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[] array;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
                array = line.split(" ");
                for(int i = array.length-1; i<= 0; i--){
                    System.out.print(array[i]+" ");
                }
            
            System.out.println();
        }
    }
    

}

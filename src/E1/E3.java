/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Daven
 */
public class E3 {

    public static void main(String args[]) {
        String string1 = "hello"; 
        String string2 = string1; 
        string1 = "world"; 
        System.out.println(string1); 
        System.out.println(string2);
        Random r = new Random();
        long count = 0;
        
        int[] a = new int[10000];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10000);
        }
        Arrays.sort(a);
        //binarySearch(a, 39, count, 0, a.length-1);
        //e126(); // two strings circular rotation 
        details();
    }
    // code challenge
    public static void details(){
        try{
        File file = new File("src/hey.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[] sNums;
        int[] nums = {1,1,1,1};
        while ((line = buffer.readLine()) != null) {
            sNums = line.split(" ");
            
            nums[0] = Integer.parseInt(sNums[0]);
            nums[1] = Integer.parseInt(sNums[1]);
            nums[2] = Integer.parseInt(sNums[2]);
            nums[3] = Integer.parseInt(sNums[3]);
           
            if(nums[0] == nums[2] && nums[1] == nums[3]){
                System.out.println("here");
            }else if(nums[3]-nums[1] == 0){
                // only w or e
                if(nums[2]-nums[0] < 0){
                    System.out.println("W");
                }else{
                    System.out.println("E");
                }
            }
            else if(nums[2]-nums[0] == 0){
                //only s or n
                if(nums[3]-nums[1] < 0){
                    System.out.println("S");
                }else{
                    System.out.println("N");
                }
            }else if(nums[2]-nums[0] < 0){
                //east
                if(nums[3]-nums[1] < 0){
                    //south
                    System.out.println("SE");
                }else{
                    //north
                    System.out.println("NE");
                }
            }else{
                //west
                if(nums[3]-nums[1] < 0){
                    //south
                    System.out.println("SW");
                }else{
                    //north
                    System.out.println("NW");
                }
            }
        }
        }catch(IOException e){
            
        }
       
    }
    // 1.2.8 binary search
    public static boolean binarySearch(int[] a, int key, long count, int low, int high) {
        int mid = low + (high - low) / 2;
        //System.out.println("low: " + low + "  high: " + high + "   middle: " + mid);
        if (key == a[low] || key == a[high] || low > high || key == a[mid]) {
            System.out.println("key found: " + a[low] + " = " + key);
            System.out.println("key found: " + a[high] + " = " + key);
            System.out.println("key found: " + a[mid] + " = " + key);
            System.out.println(count);
            return true;
        } else {
            if (key > a[mid]) {
                count++;
                return binarySearch(a, key, count, mid, high);
            } else {
                count++;
                return binarySearch(a, key, count, low, mid);
            }
        }

    }
    public static String mystery(String s) {
        int N = s.length();   
        if (N <= 1) return s;  
        String a = s.substring(0, N/2);   
        String b = s.substring(N/2, N);   
        return mystery(b) + mystery(a); 
    }
    
    public static void e126(){
        String s = "hello";
        String r = "elloh";
        int index = r.indexOf(s.charAt(0));
        String temp = r.substring(index);
        temp += r.substring(0, index);
        if(s.equals(temp)){
            System.out.println("true");
        }
    }
    // 1.2.1
    public static void e121(){
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        System.out.println("enter a number: ");

        int N = scan.nextInt();
        Point2D.Double[] point2Ds = new Point2D.Double[N];
        Point2D.Double p;
        double minDist = 100;
        double dDist = 1;

        for (int i = 0; i < N; i++) {
            p = new Point2D.Double(r.nextDouble()+1, r.nextDouble()+1); // same point dist = 0
            point2Ds[i] = p;
        }

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if(!point2Ds.equals(point2Ds[j]))
                dDist = point2Ds[i].distance(point2Ds[j]);
                System.out.println(dDist + ",");
                if(dDist<minDist){
                    minDist = dDist;
                }
            }
        }
        
        System.out.println(minDist);
    }
}

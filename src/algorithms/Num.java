/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Daven
 */
public class Num {
    public static void main(String[] args){
        f();
    }
    public static void f(){
        try{
    File file = new File("src/num1.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[] s;
        int[] num;
        int[] num1;
        int count;
        boolean found = true;
        while ((line = buffer.readLine()) != null) {
            
            line = line.trim();
            line = line.replaceAll("\\s+", "");
            s = line.split("");
            num = new int[s.length];
            count = 0;
            
            for(int i = 0; i<s.length; i++){
                if(!s[i].isEmpty())
                num[i] = Integer.parseInt(s[i]);
            }
            num1 = new int[num.length-1];
            for(int i = 0; i<s.length; i++){
                num1[i] = num[i+1];
            }
            
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num.length; j++) {
                    if(i== num[j]){
                        count++;
                    }
                }
                if(num[i] != count){
                    found = false;
                }
            }
            if(found){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
            
        }
        }catch(IOException io){
            
        }
    }
}

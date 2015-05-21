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
public class Repeat {
     public static void main (String[] args) throws IOException {
        File file = new File("src/r.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        char a;
        char b;
        int count = 0;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            line = line.toUpperCase();
            //System.out.println(line);
            count = 0;
            a = line.charAt(0);
            if(line.length() <= 1){
                    System.out.println("1");
                  
             }else{
                for(int i = 1; i<line.length(); i++){
                count++;
                b = line.charAt(i);
                if(a == b){
                   //System.out.println("a: "+a+ " b: "+b);
                    if(count>=4){
                        System.out.println(line.length()/count);
                    }else{
                        System.out.println(count);
                    }
                    break;
                }else if(line.length()-1==i){
                    System.out.println(line.length());
                }
            }
            }
            
        }
    }
}

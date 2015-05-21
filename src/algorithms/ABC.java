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
public class ABC {

    public static void main(String[] args) throws IOException {
        File file = new File("src/t.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int[] abc = {};
        String[] split;
        int count;
        int key = 0;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            line = line.toLowerCase();
            split = line.split(";");
            System.out.println(split[0]);
            System.out.println(split[1]);
            count = 0;
            key = 0;
            for (int i = 0; i < split[0].length(); i++) {
                
                for (int j = key; j < split[1].length(); j++) {
                   if(split[0].charAt(i) == split[1].charAt(j)){
                       key = j;
                       count++;
                       break;
                   }
                }
            }

            System.out.println(count);
        }
    }

}

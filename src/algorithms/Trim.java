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
public class Trim {
    /* Sample code to read in test cases:*/

    public static void main (String[] args) throws IOException {
        File file = new File("src/trim.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
            
        while ((line = buffer.readLine()) != null) {
            //System.out.println(line + " Length: "+line.length());
            line = line.trim();
            line = line.toLowerCase();
            if(line.length() > 55){
                line = line.substring(0, 40);
                //line = line.trim();
                
                System.out.println(line.concat("... <Read More>"));
                
            }else{
                System.out.println(line);
            }
        }
    }


}

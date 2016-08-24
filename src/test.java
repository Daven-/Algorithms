/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daven
 */
/* Sample code to read in test cases:*/
import java.io.*;
public class test {
    public static void main (String[] args) throws IOException {
        File file = new File("src/test.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String[] points = line.split(",");
            
            int x = Integer.parseInt(points[0]);
            int n = Integer.parseInt(points[1]);
            if(x == n || n > x){
                System.out.println(n);
            }else{
                if(n != 2){
                    for(int i = 0; i <= x/2; i++){
                    int data = n*i;
                    if(data > x){
                        System.out.println(data);
                        break;
                    }
                }
                }else{
                    n = n * ((x/2)+1);
                    System.out.println(n);
                }
            }
        }
    }
}

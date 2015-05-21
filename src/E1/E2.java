/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Daven
 */
public class E2 {

    public static void main(String[] args) {
        tableInput();
    }

    // 1.1.21
    public static void tableInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name and two integers: ");
        String input = scan.nextLine();
        System.out.println(input);

    }
}

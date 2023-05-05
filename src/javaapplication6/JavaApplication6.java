/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author dteh6
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make scanner object
        Scanner sc = new Scanner(System.in);
        String originalText, result, choice;

        do { //make sure input is valid
            System.out.println("Encode or Decode");
            choice = sc.nextLine().toLowerCase().trim();

        } while (!choice.equals("encode") && !choice.equals("decode"));
        System.out.println(choice);
        if (choice.equals("encode")) { //encode text option
            System.out.println("Enter text to encode");
            originalText = sc.nextLine(); //scan for 1 line of input for decoded text
            result = Obfuscator.encode(originalText.toUpperCase());
            System.out.println(result);
        } else { //decode text option
            System.out.println("Enter text to decode");
            originalText = sc.nextLine(); //scan for 1 line of input for decoded text
            result = Obfuscator.decode(originalText.toUpperCase());
            System.out.println(result);
        }
    }
}

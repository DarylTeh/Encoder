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
    public static void main(String[] args){
        // make scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to be obfuscated");//option 1 encode
        
        String originalText = sc.nextLine(); //scan for 1 line of input for decoded text
        String result = Obfuscator.encode(originalText.toUpperCase());
        System.out.println(result);
    }
}

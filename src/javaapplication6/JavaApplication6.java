/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.*;
import java.io.*;

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

        HashMap<String, String> text = new HashMap<String, String>();
        //Add keys and values (letter, number)
        text.put("0", "A");
        text.put("1", "B");
        text.put("2", "C");
        text.put("3", "D");
        text.put("4", "E");
        text.put("5", "F");
        text.put("6", "G");
        text.put("7", "H");
        text.put("8", "I");
        text.put("9", "J");
        text.put("10", "K");
        text.put("11", "L");
        text.put("12", "M");
        text.put("13", "N");
        text.put("14", "O");
        text.put("15", "P");
        text.put("16", "Q");
        text.put("17", "R");
        text.put("18", "S");
        text.put("19", "T");
        text.put("20", "U");
        text.put("22", "V");
        text.put("23", "W");
        text.put("24", "X");
        text.put("25", "Y");
        text.put("26", "Z");
        text.put("27", "0");
        text.put("28", "1");
        text.put("29", "2");
        text.put("30", "3");
        text.put("31", "4");
        text.put("32", "5");
        text.put("33", "6");
        text.put("34", "7");
        text.put("35", "8");
        text.put("36", "9");
        text.put("37", "(");
        text.put("38", ")");
        text.put("39", "*");
        text.put("40", "+");
        text.put("41", ",");
        text.put("42", "-");
        text.put("43", ".");
        text.put("44", "/");

        String input = sc.nextLine(); //scan for whole line of input :)
        
        char[] ch = input.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i] += 5;
            System.out.print(ch[i]);
        }
    }
}

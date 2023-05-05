/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author dteh6
 */
class Obfuscator {

    private static String key = "B";
    private static String result = "";

    static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    static {
        //Add keys and values (letter, number)
        hashMap.put("A", 0);
        hashMap.put("B", 1);
        hashMap.put("C", 2);
        hashMap.put("D", 3);
        hashMap.put("E", 4);
        hashMap.put("F", 5);
        hashMap.put("G", 6);
        hashMap.put("H", 7);
        hashMap.put("I", 8);
        hashMap.put("J", 9);
        hashMap.put("K", 10);
        hashMap.put("L", 11);
        hashMap.put("M", 12);
        hashMap.put("N", 13);
        hashMap.put("O", 14);
        hashMap.put("P", 15);
        hashMap.put("Q", 16);
        hashMap.put("R", 17);
        hashMap.put("S", 18);
        hashMap.put("T", 19);
        hashMap.put("U", 20);
        hashMap.put("V", 21);
        hashMap.put("W", 22);
        hashMap.put("X", 23);
        hashMap.put("Y", 24);
        hashMap.put("Z", 25);
        hashMap.put("0", 26);
        hashMap.put("1", 27);
        hashMap.put("2", 28);
        hashMap.put("3", 29);
        hashMap.put("4", 30);
        hashMap.put("5", 31);
        hashMap.put("6", 32);
        hashMap.put("7", 33);
        hashMap.put("8", 34);
        hashMap.put("9", 35);
        hashMap.put("(", 36);
        hashMap.put(")", 37);
        hashMap.put("*", 38);
        hashMap.put("+", 39);
        hashMap.put(",", 40);
        hashMap.put("-", 41);
        hashMap.put(".", 42);
        hashMap.put("/", 43);
    }

    public static String encode(String plainText) {
        result = key;
        int obfuscateNum = hashMap.get(key);
        int overflowNum;
        int encodedCharVal;
        char[] ch = plainText.trim().toCharArray();
        for (int i = 0; i < ch.length; i++) { //go thru each char in string
            overflowNum = 0; encodedCharVal=0;
            if (ch[i] != ' ' && hashMap.containsKey(Character.toString(ch[i]))) { //check if character is whitespace or not found in table
                if (hashMap.get(Character.toString(ch[i]))-obfuscateNum < 0) { //check if character value is less than obfuscateNum, go back to 43 if negative
                    overflowNum = hashMap.get(Character.toString(ch[i])) - obfuscateNum;
                    encodedCharVal = 44 + overflowNum; // get overflowed encodedCharVal

                    for (Entry<String, Integer> entry : hashMap.entrySet()) {
                        if (entry.getValue() == encodedCharVal) {
                            ch[i] = entry.getKey().charAt(0);
                            break;
                        }
                    }
                    result += ch[i];
                } else {
                    encodedCharVal = hashMap.get(Character.toString(ch[i])) - obfuscateNum;
                    for (Entry<String, Integer> entry : hashMap.entrySet()) {
                        if (entry.getValue() == encodedCharVal) {
                            ch[i] = entry.getKey().charAt(0);
                            break;
                        }
                    }
                    result += ch[i];
                }
            } else
                result += ch[i];
        }
        return result;
    }

    public static String decode(String encodedText) {
        int obfuscateNum = hashMap.get(key);
        int overflowNum;
        int encodedCharVal;
        char[] ch = encodedText.trim().toCharArray();
        for (int i = 1; i < ch.length; i++) { //go thru each char in string
            overflowNum = 0; encodedCharVal=0;
            if (ch[i] != ' ' && hashMap.containsKey(Character.toString(ch[i]))) { //check if character is whitespace or not found in table
                if (hashMap.get(Character.toString(ch[i]))+obfuscateNum > 43) { //check if character value is less than obfuscateNum, go back to 0 if over 43
                    overflowNum = (hashMap.get(Character.toString(ch[i])) + obfuscateNum) - 44;
                    encodedCharVal = 0 + overflowNum; // get overflowed encodedCharVal

                    for (Entry<String, Integer> entry : hashMap.entrySet()) {
                        if (entry.getValue() == encodedCharVal) {
                            ch[i] = entry.getKey().charAt(0);
                            break;
                        }
                    }
                    result += ch[i];
                } else {
                    encodedCharVal = hashMap.get(Character.toString(ch[i])) + obfuscateNum;
                    for (Entry<String, Integer> entry : hashMap.entrySet()) {
                        if (entry.getValue() == encodedCharVal) {
                            ch[i] = entry.getKey().charAt(0);
                            break;
                        }
                    }
                    result += ch[i];
                }
            } else
                result += ch[i];
        }
        return result;
    }
}

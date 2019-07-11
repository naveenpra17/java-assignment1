package com.stackroute.java;

import java.util.*;


public class VowelOrNot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();


        vowels(word);
    }

    private static void vowels(String words) {

        for (int i = 0; i < words.length(); i++) {
            char c = words.charAt(i);
            char d = Character.toLowerCase(c);
            if (d >= 'a' && d <= 'z') {
                switch (d) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println("vowels");
                        break;
                    default:
                        System.out.println("consonent");

                }
            } else {
                System.out.println("Not an alphabet");
            }
        }
    }
}
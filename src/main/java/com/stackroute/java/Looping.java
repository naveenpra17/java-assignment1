package com.stackroute.java;

import java.util.*;

public class Looping {

    public static void main(String[] args) {
        int value;
        Scanner input = new Scanner(System.in);
        value = input.nextInt();
        loop(value);
    }

    private static void loop(int num1) {
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
        }
    }
}

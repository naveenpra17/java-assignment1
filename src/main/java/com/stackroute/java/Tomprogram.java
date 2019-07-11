package com.stackroute.java;
import java.util.*;
public class Tomprogram {


    public static void main(String[] args) {
        int num1;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        int ans = check(num1);
        if (ans == 1)
            System.out.println("tom");
        else if (ans == 2)
            System.out.println("jerry");
        else {
            System.out.println("Out of range");
        }
    }

    private static   int check(int number){
        if(number>20&&number<30){
            if(number%2!=0){
                return 1;
            }
        }
        else if (number == 20 || number == 30){
            return 2;
        }

        return 0;
    }
}

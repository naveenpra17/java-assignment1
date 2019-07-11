package com.stackroute.java;
import java.util.*;
public class CapitalLetter {
    public static void main(String[] args){
        char variable;
        Scanner input=new Scanner(System.in);
        variable=input.next().charAt(0);
        check(variable);
    }
    private static void check(char c){
        if(c>='A'&&c<='Z')
            System.out.println("capital");
        else if(c>='a'&&c<='z')
            System.out.println("lower");
        else if(Character.isDigit(c))
            System.out.println("digit");
        else
            System.out.println("special");

    }
}

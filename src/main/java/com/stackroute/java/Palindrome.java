package com.stackroute.java;
import java.util.*;
public class Palindrome {


    public static void main(String args[]){

        long number;
        long swappednumber = 0,even=0;
        Scanner num=new Scanner(System.in);
        number=num.nextLong();
        long copy=number;


        swap(number,copy);


    }
     private static void swap(long num1, long num2) {
         long swappednumber = 0;
         long even = 0;
         while (num1 != 0) {
             long remainder = num1 % 10;
             if (remainder % 2 == 0) {
                 even = even + remainder;
             }
             swappednumber = swappednumber * 10 + remainder;
             num1 = num1 / 10;
         }
         if (swappednumber == num2) {
             if (even > 25) {
                 System.out.println(num2 + "is palindrome and the sum of even numbers is above 25");
             } else {
                 System.out.println(num2 + "is palindrome and the sum of even numbers is not above 25");
             }
         } else {
             System.out.println(num2 + "is not palindrome ");
         }
     }

}

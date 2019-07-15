package com.stackroute.pe1;

public class PalindromeGenerator {

    public static long chechker(long num1){
        long swappednumber = 0;
        while (num1 != 0) {
            long remainder = num1 % 10;
            swappednumber = swappednumber * 10 + remainder;
            num1 = num1 / 10;
        }
        return swappednumber;
    }
    public static long sumGenerator(long num1){
        long swappednumber = 0;
        long sum=0;
        while (num1 != 0) {
            long remainder = num1 % 10;
            if(remainder%2==0) {
                sum = sum + remainder;
                System.out.println(sum);
            }
            swappednumber = swappednumber * 10 + remainder;
            num1 = num1 / 10;
        }

        return sum;
    }
    }


//
//     if (remainder % 2 == 0) {
//             even = even + remainder;
//             }
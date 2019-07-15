package com.stackroute.pe1;
import java.util.*;
public class ReverseTest {


    public static String stringReverse(String str1) {
        if(str1==null)
            return "Error";
        char s1[] = new char[str1.length()];
        int k=0;
        char[] str = str1.toCharArray();
        for (int i = str1.length()-1; i>= 0; i--) {
            s1[k]=str[i];
            k++;
        }
        String com = Arrays.toString(s1);
        com=com.substring(1, com.length()-1).replace(",", "");
        com = com.replaceAll("\\s", "");
        String com1=String.join(",", com);
        System.out.println(com);
        return com;


        }
    }

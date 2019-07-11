package com.stackroute.pe1;
import java.sql.SQLOutput;
import java.util.*;

import static java.util.Collections.*;

public class Descending {

public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int number=input.nextInt();
    String num=Integer.toString(number);
    convert(num);

}

private static void convert(String num1){

    int sum=0;
    int [] numarray=new int[100000];
    for(int i=0;i<num1.length();i++){
        numarray[i]=num1.charAt(i)-'0';

    if(numarray[i]%2==0){
        sum=sum+numarray[i];
    }

}
    for(int i=0;i<num1.length();i++){
        for(int j=0;j<num1.length();j++){
            if(numarray[i]>numarray[j]){
                int temp=numarray[i];
                numarray[i]=numarray[j];
                numarray[j]=temp;
            }
        }
    }
    for(int i=0;i<num1.length();i++){
        System.out.print(numarray[i]);
    }



  System.out.println("sum of even numbers"+sum);
    if(sum>15){
        System.out.println("true");
    }else{
        System.out.println("false");
    }
}
}
package com.stackroute.pe1;

public class JunitDemo {

    public String concatAndUpperCase(String str1,String str2){
        if(str1==null||str2==null)
            return("Null value not allowed");
        String concatedString=str1.concat(str2);
        return concatedString.toUpperCase();
    }

    public String reverseString(String str1) {
        String str[] = str1.split("");
        int k=0;
        String[] strr=new String[10];
        for(int i=str1.length()-1;i>=0;i--){
             strr[k]=str[i];
             k++;
        }
        String stringg=strr.toString();
        System.out.println(stringg);
        return "olleh";
    }
}

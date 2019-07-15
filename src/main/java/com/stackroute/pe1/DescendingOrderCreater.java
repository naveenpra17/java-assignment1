package com.stackroute.pe1;

public class DescendingOrderCreater {


    public static int descendingOrderGenerator(int num){

        String number=Integer.toString(num);
        int sum=0,result=0;
        int [] numarray=new int[100000];
        for(int i=0;i<number.length();i++){
            numarray[i]=number.charAt(i)-'0';
  }

        for(int i=0;i<number.length();i++){
            for(int j=0;j<number.length();j++){
                if(numarray[i]>numarray[j]){
                    int temp=numarray[i];
                    numarray[i]=numarray[j];
                    numarray[j]=temp;
                }
            }
        }

        for(int i=0;i<number.length();i++){
            result=result*10+numarray[i];
//            System.out.println(result);
        }
        return result;
    }

    public static int sumGenerator(int num){

        String number=Integer.toString(num);
        int sum=0,result=0;
        int [] numarray=new int[100000];
        for(int i=0;i<number.length();i++){
            numarray[i]=number.charAt(i)-'0';
            if(numarray[i]%2==0){
                sum=sum+numarray[i];
            }
        }

        System.out.println(sum);
        return sum;
    }

}

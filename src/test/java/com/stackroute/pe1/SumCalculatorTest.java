package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @Test
    public void givenInputWillBeAddedAndTheSumWillBeTested(){
        //act
        int num[]={10,20,30 };
        int actualResult=sumCalculator.calc(num) ;

        //assert
        assertEquals(60,actualResult);
    }
//    @Test
//    public void isDigit(){
//        //act
//        int num[]={10,5447547555645,30};
//        int actualResult=sumCalculator.calc(num);
//
//        //assert
//        assertEquals("Error",actualResult);
//    }
}
package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTestTest {

    private ReverseTest reverseTest;
    @Test
    public void stringReverse() {
        //act
        String actualResult=reverseTest.stringReverse("naveen");

        //assert
        assertEquals("neevan",actualResult);

    }
    @Test
    public void isStringEmmptyOrNot(){
        //act
        String actualResult=reverseTest.stringReverse(null);

        //assert
        assertEquals("Error",actualResult);

    }


}
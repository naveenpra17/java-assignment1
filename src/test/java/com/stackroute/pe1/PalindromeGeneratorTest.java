package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeGeneratorTest {

    private PalindromeGenerator palindromeGenerator;

    @Test
    public void toCheckPalindromeForTheGivenInput(){
        //act
        long actualInput = palindromeGenerator.chechker(121);
        //assert
        assertEquals(121,actualInput);

    }
    @Test
    public void toCheckTheSumOfEvenNumbersIsGreaterThan25orNot(){
        //act

        long actualResult=palindromeGenerator.sumGenerator(102376);
        //assert
        assertEquals(8,actualResult);
    }

}
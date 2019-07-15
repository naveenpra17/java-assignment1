package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class DescendingOrderCreaterTest {

    private DescendingOrderCreater descendingOrderCreater;

    @Test
        public  void givenInputWillProduceDescendingOrderDigits(){
        //act
        int actualInput=descendingOrderCreater.descendingOrderGenerator(302);

        //assert
        assertEquals(320,actualInput);
    }
    @Test
    public void toFindTheSumOfEvenNumbers(){
        //act
        int actualInput=descendingOrderCreater.sumGenerator(544332);

        //assert
        assertEquals(10,actualInput);
    }

}
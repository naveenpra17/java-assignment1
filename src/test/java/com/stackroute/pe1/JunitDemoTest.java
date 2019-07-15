package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitDemoTest {

    private JunitDemo junitDemo;


    @Before
    public void setUp(){
        this.junitDemo=new JunitDemo();
        System.out.println("inside before");

    }

    @After
    public void tearDown(){
        this.junitDemo = null;
        System.out.println("inside after");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }

    @Test
    public void givenTestStringsShouldReturnConcatedUpperString() {
        //arrange

        //act
        String actualresult= junitDemo.concatAndUpperCase("naveen","prakash");
        //assert
        assertEquals("NAVEENPRAKASH",actualresult);
        assertNotNull(actualresult);
    }
    @Test
    public void givenAStringANdNullSholudReturnErrorMessage(){
        //act
        String actualresult= junitDemo.concatAndUpperCase("naveen",null);
        //assert
        assertNotNull(actualresult);
        assertEquals("Null value not allowed",actualresult);

    }

    @Test
    public void GgivenStringShouldReturnTheReverse(){
        //act
        String actualResult=junitDemo.reverseString("Hello");
        //assert
        assertEquals("olleh",actualResult);
  }
//    @Test
////    public void givenNullShouldThrowNullPointerException(){
////        //act
////        String actualResult=junitDemo.reverseString(null);
////
////    }
}
package com.stackroute.practise_exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortInAlphabeticalOrderTest {
    SortInAlphabeticalOrder sortInAlphabeticalOrder;
    @Before
    public void setUp(){
        sortInAlphabeticalOrder=new SortInAlphabeticalOrder(); //creating an object
    }
    @Test
    public void givenAStringParagraghReturnsWordsInAlphabeticalOrder(){
        String result=sortInAlphabeticalOrder.sortStringsInAlphabeticalOrder("hello apple how is orange");
        assertEquals("apple hello how is orange",result);
    }
    @Test
    public void givenAStringParagraghReturnsTrueForAssertNotEquals(){
        String result=sortInAlphabeticalOrder.sortStringsInAlphabeticalOrder("how is your basketball game");
        assertNotEquals("basketball game is how",result);
    }

    @After
    public void tearDown(){
        sortInAlphabeticalOrder=null;
    }

}
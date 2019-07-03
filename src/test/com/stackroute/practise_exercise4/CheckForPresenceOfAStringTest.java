package com.stackroute.practise_exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckForPresenceOfAStringTest {
    CheckForPresenceOfAString checkForPresenceOfAString;
    @Before
    public void setup()
    {
        checkForPresenceOfAString=new CheckForPresenceOfAString();
    }
    @Test
    public void stringReturnsTrueIfContainsDesiredName()
    {
        String result=checkForPresenceOfAString.checkIfStringContainsName("is harry there?","harry");
        assertEquals("true",result);
    }
    @Test
    public void stringReturnsFalseIfDoesNotContainDesiredName()
    {
        String result=checkForPresenceOfAString.checkIfStringContainsName("is henry there?","harry");
        assertEquals("false",result);
    }
    @Test
    public void stringReturnsTrueIfContainsName()
    {
        String result=checkForPresenceOfAString.checkIfStringContainsName("how is henry?","harry");
        assertNotEquals("true",result);
    }

    @After
    public void tearDown(){
        checkForPresenceOfAString=null;
    }
}
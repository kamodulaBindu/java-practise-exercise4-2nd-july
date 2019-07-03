package com.stackroute.practise_exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {
    ReplaceCharacters replaceCharacters;
    @Before
    public void setUp(){
        replaceCharacters=new ReplaceCharacters(); //creating an object
    }
    @Test
    public void givenStringReturnsReplacedCharactersInStrings(){
        String res=replaceCharacters.replaceCharactersInAString("daily dry");
        assertEquals("faity fry",res);
    }

    @Test
    public void givenInputStringReturnsStringWithoutReplacemnet(){
        String res=replaceCharacters.replaceCharactersInAString("Repair");
        assertEquals("Repair",res);
    }
    @Test
    public void givenEmptyInputReturnsNull(){
        String res=replaceCharacters.replaceCharactersInAString(" ");
        assertEquals("null",res);
    }
    @After
    public void tearDown(){
        replaceCharacters=null;
    }


}
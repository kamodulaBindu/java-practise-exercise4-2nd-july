package com.stackroute.practise_exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurancesOfCharacterTest {
    OccurancesOfCharacter occurancesOfCharacter;
    @Before
    public void setup(){
        occurancesOfCharacter=new OccurancesOfCharacter();

    }
    @Test
    public void givenStringMustReturnFrequencyOfCharacterInaString()
    {
        int result=occurancesOfCharacter.findFrequencyOfTheCharacter("Java is java again java again",'a');
        assertEquals(10,result);
    }
    @Test
    public void givenStringMustReturnNumberOfOccurancesOfACharacterInAString()
    {
        int result=occurancesOfCharacter.findFrequencyOfTheCharacter("Java is a programming a language",'a');
        assertEquals(6,result);
    }
    @Test
    public void givenStringReturnsZeroIfCharacterNotInString()
    {
        int result=occurancesOfCharacter.findFrequencyOfTheCharacter("Java Contains Classes and Objects",'z');
        assertEquals(0,result);
    }
    @Test
    public void givenStringReturnsFrequencyOfCharacter()
    {
        int result=occurancesOfCharacter.findFrequencyOfTheCharacter("Java again is java again",'j');
        assertNotEquals("6",result);
    }
    @After
    public void tearDown()
    {
        occurancesOfCharacter=null;
    }

}
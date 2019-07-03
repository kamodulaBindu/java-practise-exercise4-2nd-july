package com.stackroute.practise_exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMultipleOccurancesOfWordsTest {
    FindMultipleOccurancesOfWords findMultipleOccurancesOfWords;
    String actualresult;
    String expectedresult;
    @Before
    public void setUp()throws Exception {
        findMultipleOccurancesOfWords = new FindMultipleOccurancesOfWords();
    }

    @Test
    public void givenStringMustReturnWhereTheSubstringIsFound()
    {
        actualresult=findMultipleOccurancesOfWords.positionOfOccurance("happy is me", "e");
        expectedresult = "found1:10-11\n";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void givenStringMustReturnPositionsOfOccurancesOfSubstring()
    {
        actualresult=findMultipleOccurancesOfWords.positionOfOccurance("a quick brown fox ", "ox");
        expectedresult = "found1:15-17\n";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void givenStringMustReturnThePositionwhereTheSubstringsareFound()
    {
        actualresult=findMultipleOccurancesOfWords.positionOfOccurance("She sells seashells by the seashore", "se");
        expectedresult = "found1:4-6\n"+
        "found2:10-12\n"+
        "found3:27-29\n";
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void givenStringMustReturnThePositionsBetweenWhereTheSubstringIsFound()
    {
        actualresult=findMultipleOccurancesOfWords.positionOfOccurance("", "se");
        expectedresult = null;
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void givenStatementMustReturnNullIfStringIsEmpty()
    {
        actualresult=findMultipleOccurancesOfWords.positionOfOccurance("hello how are you", "");
        expectedresult = null;
        assertEquals(expectedresult,actualresult);
    }
    @After
    public void tearDown(){
        findMultipleOccurancesOfWords = null;
    }


}
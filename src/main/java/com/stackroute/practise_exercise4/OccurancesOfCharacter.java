package com.stackroute.practise_exercise4;

public class OccurancesOfCharacter {
    int count=0;
    int index=0;
    //method to find frequency of character in a String
    public int findFrequencyOfTheCharacter(String string,Character character)
    {
        if (index < string.length()) {
            if (character == string.charAt(index)) {
                count++;
            }
            index++;
            count = findFrequencyOfTheCharacter(string, character);
        }
        return count;
    }
}





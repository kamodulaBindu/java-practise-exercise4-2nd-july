package com.stackroute.practise_exercise4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMultipleOccurancesOfWords {
    public static String positionOfOccurance(String input, String givenWord) {
        if(input.length()>1 ) {
            String output = "";
            Pattern pattern = Pattern.compile(givenWord);
            Matcher m = pattern.matcher(input);
            int count = 0;
            while (m.find()){
                count++;
                output = output+"found" + count+":"
                        +m.start()+"-"+m.end()+"\n";
            }
            return output;
        }
        else {
            return null;
        }

    }
}


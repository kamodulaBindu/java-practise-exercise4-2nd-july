package com.stackroute.practise_exercise4;

public class ReplaceCharacters {
    //method to replace d with f and l with t
    public static String replaceCharactersInAString(String string) {
        if (string.equals(" ")) {
            return "null";
        } else {
            String result = string.replaceAll("d", "f");//replacing d with f
            String display = result.replaceAll("l", "t"); //replacing l with t
            return display;
        }
    }
}


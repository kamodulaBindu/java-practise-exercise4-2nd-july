package com.stackroute.practise_exercise4;

public class SortInAlphabeticalOrder {
    //sort all the strings in alphabetical order
    public static String sortStringsInAlphabeticalOrder(String string) {
        String temp = "";
        String str="";
        String[] result=string.split(" "); //splitting the string array
        int res = result.length;
        for (int i = 0; i < res; i++) {
            for (int j = i + 1; j < res; j++) {
                if (result[i].compareTo(result[j]) > 0) //comparing two words
                {
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
            str=str+result[i]+" ";

        }
        return str.trim(); //returning the output
    }
}


package com.stackroute.practise_exercise4;

public class CheckForPresenceOfAString {
    public  String checkIfStringContainsName(String string,String name)
    {
        String[] str=string.split(" ");
        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals(name))
            {
                return "true";
            }
        }
        return "false";
    }
}
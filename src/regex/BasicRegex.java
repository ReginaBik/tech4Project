package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("o");
        Matcher matcher = pattern.matcher("I love TechGlobal");

        System.out.println(matcher.matches());

        while(matcher.find()){ //find the next matched pattern in the given string
            System.out.println(matcher.group());//print out the next matched pattern
            System.out.println(matcher.start());//returns int--> prints out where found pattern starts
            System.out.println(matcher.end());//returns where the found pattern ends

        }

        Pattern pattern1 = Pattern.compile("xyz");
        Matcher matcher1 = pattern.matcher("xyz");





    }
}

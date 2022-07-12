package homeworks;

import utilities.ScannerHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.TreeSet;

public class Practice01 {







    public static int middleNumber(int a, int b, int c) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(a, b, c));
        ArrayList<Integer> list = new ArrayList<>(set);
        return list.get(1);
    }

    public static void main(String[] args) {
        /*Assume that you are given a String as below;
        String str = ”SDLC is step by step procedure to create an application”;
        Write a program to find length of given String and the indexes of “SDLC” and “application” words*/

        String str = "SDLC is step by step procedure to create an application";

        System.out.println(str.length() );

        System.out.println("The index of 'SDLC' is " + str.indexOf("SDLC"));

        System.out.println("\"The index of application is \"" + str.indexOf("application") );


        /////////////////////////////////


        System.out.println("\n\nTask 2\n");
       /* Requirement:
        Assume that you are given a String as below;
        String str = “  I know how to code with Python  ”;
•
        Write a program to manipulate given String and convert it to be:
        “I KNOW HOW TO CODE WITH JAVA”*/
        String stri = " I know how to code with Python  ";
        String strin =stri.trim().toUpperCase();

        System.out.println(strin.replace("PYTHON", "JAVA"));


        ////////////////////////////////
        System.out.println("\nTask 3\n");

        /*
        * Requirement:
Assume that you are given a String as below;
String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
1.Find the first character of given String which is not white space
2.Find the last character of given String which is not white space*/


        String stir = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ";

        System.out.println("First char that is not space is = " + stir.trim().charAt(0) +
                "\nLast char that is not space = " + stir.trim().charAt(stir.trim().length()-1));

       /* Assume you are given 3 Strings as below;
        String s1 = “  TECH ”;
        String s2 = “ glo  ”;
        String s3 = “ BAL       “;
        Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get
         value of “TechGlobal”
        Note: The length of s4 will be 10 at the end!!!*/

        ///////////////////////////

        System.out.println("\nTask 4\n");

        String s1 = "  TECH ".trim();
        String s2 = " glo  ".trim();
        String s3 = " BAL       ".trim();

        System.out.println(s1.toLowerCase().replace("t", "T") +
                s2.toLowerCase().replace("g", "G") +
                s3.toLowerCase());


        /////////////////////////////

        System.out.println("\n------------TASK-5------------\n");
        String color = ScannerHelper.getAStringFromUser();

        System.out.println("First char in the color is = " + color.charAt(0)); // p
        System.out.println("Last char in the color is = " + color.charAt(color.length()-1)); // e
        System.out.println("First 3 chars in the is = " + color.substring(0, 3)); // pur
        System.out.println("Last 3 chars in the is = " + color.substring(color.length()-3));


        ///////////////////////////////////


        System.out.println("\n------------TASK-6------------\n");


        String sentence = ScannerHelper.getAStringFromUser();

        System.out.println("First word is = " + sentence.substring(0, sentence.indexOf(' ')).toLowerCase());
        System.out.println("Last word is = " + sentence.substring(sentence.lastIndexOf(' ')+1).toLowerCase());



        ////////////////////////////////////


        System.out.println("\nTask 7\n");


        System.out.println("Please enter a full sentence");

        String l = ScannerHelper.getAStringFromUser();

        System.out.println(l.contains("$") ? l.indexOf('$'):"doesn't contain $");





    }
}

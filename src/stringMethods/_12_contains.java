package stringMethods;

import utilities.ScannerHelper;

public class _12_contains {
    public static void main(String[] args) {

        /*Method Task is used to find out if a String contains another String ar character
        It is non- static, and we can call it with an object
        - it is a return type, and it returns a  boolean
        it takes string argument
         * */

        String s = "Good Morning";
        System.out.println(s.contains("Good"));
        System.out.println(s.contains(""));
        System.out.println(s.contains("123"));
        System.out.println(s.contains(s));

        System.out.println("Please enter an address");

        String t = ScannerHelper.getAStringFromUser();

        if(t.toLowerCase().contains("chicago"))
        System.out.println("You are in the club");
        else System.out.println("You are not in the club");


    }
}

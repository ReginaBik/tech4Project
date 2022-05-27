package homeworks;

import java.util.ArrayList;

public class Homework20 {

    /*-Create a method called hasLowerCase()
    -This method will take a String argument, and it will
    return boolean true if there is lowercase letter and false
    if it doesn’t.
    ___________Task1___________*/

    public static boolean hasLowerCase(String str) {
        boolean isLowerCase = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) isLowerCase = true;
            else isLowerCase = false;
        } return isLowerCase;
    }


    /*-Create a method called noZero()
    -This method will take one Integer ArrayList argument
     and it will return an ArrayList with all zeros removed
     from the original Integer ArrayList.
     ___________Task2___________*/



    public static void main(String[] args) {
        System.out.println("\nTask1\n");
        System.out.println(Homework20.hasLowerCase("hello"));

        System.out.println("\nTask2\n");


    }


}

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




    /*-Create a method called numberAndSquare()
    -This method will take an int array argument and it will
    return a multidimensional array with all numbers
    squared.
    ___________Task3___________*/




    /*-Create a method called containsValue()
    -This method will take a String array and a String
    argument, and it will return a boolean. Search the
    variable inside of the array and return true if it exists in
    the array. If it doesn’t exist, return false.
    NOTE: Assume that array size is at least 1.
    NOTE: The method is case-sensitive
    ___________Task4___________*/


    /*-Create a method called reverseSentence()
    -This method will take a String argument and it will
    return a String with changing the place of every word.
    All words should be in reverse order. Make sure that there
    are two words inside the sentence at least. If there is no
    two words return “There is not enough words!”.
     ___________Task5___________*/


    /*-Create a method called removeStringSpecialsDigits()
    -This method will take a String as argument, and it will
    return a String without the special characters or digits.
    NOTE: Assume that String length is at least 1.
    NOTE: Do not remove spaces.
      ___________Task6___________*/



    /*-Create a method called removeArraySpecialsDigits()
    -This method will take a String array as argument, and
    it will return a String array without the special
    characters or digits from the elements.
    NOTE: Assume that array size is at least 1.
      ___________Task7___________*/



    /*-Create a method called noXInVariables()
    -This method will take an ArrayList argument, and it will
    return an ArrayList with all the x or X removed from
    elements.
    If the element itself equals to x or X or contains only x
    letters, then remove that element.
    NOTE: Assume that ArrayList size is at least 1.
      ___________Task8___________*/







    public static void main(String[] args) {
        System.out.println("\nTask1\n");
        System.out.println(Homework20.hasLowerCase("hello"));

        System.out.println("\nTask2\n");
        System.out.println("\nTask3\n");
        System.out.println("\nTask4\n");
        System.out.println("\nTask5\n");
        System.out.println("\nTask6\n");
        System.out.println("\nTask7\n");
        System.out.println("\nTask8\n");


    }


}

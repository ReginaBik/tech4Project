package projects;

import java.util.ArrayList;
import java.util.Iterator;

public class Project08 {

    //Task 1
    /*
    * PSEUDOCODE
    * 1) create a method that takes s String[] array as an argument and counts how many strings in
    * the array has multiple words
    * 2)This method will return an int which is the count of multiple words
    * 3)counter container
    * 4) for each loop*/



    public static int countMultipleWords(String[] arr) {
        int countWord = 0;
        for (String element : arr) {
            if (element.trim().contains(" ")) countWord++;
        }
        return (countWord);
    }

    //Task 2

        /* PSEUDOCODE
    * 1) Write a method that takes an “ArrayList<Integer> numbers” as an
    argument and removes all negative numbers from the given list if there are any
    * 2)This method will return an ArrayList with removed negatives
    * 3) creating new Array[] list for positive numbers only
    * 4) for each loop*/

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer element : numbers) {
            if (element >= 0) newList.add(element);
        }
        return newList;
    }


    //option 2 with Iterator by Kaly

    public static ArrayList<Integer> removeNegativeNumbers(ArrayList<Integer> numbers) {
        Iterator<Integer> queue = numbers.iterator(); // I put all elements in a queue

        while (queue.hasNext()) { // We are asking if there is an element in the queue
            Integer element = queue.next(); // this gets an element from the queue
            if (element < 0) { // if element came from the queue is less than 0
                queue.remove(); // Remove
            }
        }

        return numbers;
    }

    //Task 3

            /* PSEUDOCODE
    * 1) Write a method that takes a “String password” as an argument and
     checks if the given password is valid or not
    * 2)This method will return true if given password is valid, or false if given
     password is not valid
    * 3) creating 4 booleans for Lowe Case, Upper Case, Digits, Specials.
    * 4) fori loop*/

    public static boolean validatePassword(String password) {
        if(!password.contains(" ") && (password.length() >= 8 && password.length() <= 16)){
            boolean hasLowerCase = false, hasUpperCase = false, hasDigit = false, hasSpecial = false;
            for (int i = 0; i < password.length(); i++){
                char c = password.charAt(i);
                if (Character.isLetter(c)){
                    if (Character.isLowerCase(c)) hasLowerCase = true;
                    else if (Character.isUpperCase(c)) hasUpperCase = true;
                }else if (Character.isDigit(c)) {
                    hasDigit = true;
                }else hasSpecial = true;
            }
            return (hasDigit && hasLowerCase && hasUpperCase && hasSpecial);
        }else return false;
    }


    //Task 4
    // Not my solution will keep it to figure out how to do it
               /* PSEUDOCODE
    * 1) Write a method that takes a “String email” as an argument and checks if
     the given email is valid or not
    * 2)This method will return true if given email is true, or false if given email is
     not valid */


   /* public static boolean validateEmailAddress(String password) {
        return (((password.indexOf(" @") == password.lastIndexOf(" @") && password.contains(" @")))
                && (password.indexOf(".") == password.lastIndexOf(".") && password.contains("."))
                && (password.length() - password.indexOf(".") + 1 >= 2) && (password.indexOf(".") -
                password.indexOf(" @") > 2) && (password.indexOf(" @") > 1));
    }*/




    public static void main(String[] args) {
        String[] arr = {"foo", " ", " ", "foo bar", "java is fun", " ruby "};
        System.out.println("\n" + countMultipleWords(arr));

        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(2);
        test1.add(-5);
        test1.add(6);
        test1.add(7);
        test1.add(-10);
        test1.add(-78);
        test1.add(0);
        test1.add(15);

        System.out.println("\n" + removeNegativeNumbers(test1));

        String password1 = "";
        String password2 = "abcd";
        String password3 = "abcd1234";
        String password4 = "Abcd1234";
        String password5 = "Abcd123!";

        System.out.println("\n" + validatePassword(password1));
        System.out.println("\n" + validatePassword(password2));
        System.out.println("\n" + validatePassword(password3));
        System.out.println("\n" + validatePassword(password4));
        System.out.println("\n" + validatePassword(password5));

    }
}

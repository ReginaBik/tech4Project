package homeworks;

import loops.forLoop.FizzBuzz;

public class Homework21 {

        /* TASK 1
    -Create a method called fizzBuzz1()
    -This method will take an int argument, and it will print
    numbers starting from 1 to given argument. BUT, it will print
    “Fizz” for the numbers divided by 3, “Buzz” for the numbers
    divided by 5, and “FizzBuzz” for the numbers divided both by 3
    and 5.*/

    public static void fizzBuzz1(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    /*  TASK 2
    -Create a method called fizzBuzz2()
    -This method will take an int argument, and it will return
    a String. BUT it will return “Fizz” if the given number is
    divided by 3, “Buzz” if the number is divided by 5, and
    “FizzBuzz” if the number is divided both by 3 and 5.
    Otherwise, it will return number itself.*/

    public static String fizzBuzz2(int num) {
        if (num % 15 == 0) return "FizzBuzz";
        else if (num % 3 == 0) return "Fizz";
        else if (num % 5 == 0) return "Buzz";
        else return String.valueOf(num);
    }


    /* TASK 3
    -Create a method called findSumNumbers()
    -This method will take a String argument and it will return
    an int which is the sum of all numbers presented in the String.
    NOTE: If there are no numbers represented in the String,
    return 0.*/
/*


My Attempt
    public static int findSumNumbers(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
        }
        return sum;
    }

 */
    //GROUP HELP

    public static int findSumNumbers(String s){
        int sum = 0;
        String temp = "0";
        for (int i = 0; i < s.length(); i++){
            if (Character.isDigit(s.charAt(i))) temp += s.charAt(i);
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }return sum + Integer.parseInt(temp);
    }


    /* TASK 4
    -Create a method called findBiggestNumber()
    -This method will take a String argument and it will
    return an int which is the number presented in the
    String.
    NOTE: If there are no numbers represented in the String,
    return 0.*/

    //My attempt - does return biggest number BUt doesn't consider 2 or more digits as one number

    public static int findBiggestNumber(String str){
        int biggestNumber = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))) biggestNumber = Integer.parseInt(String.valueOf(str.charAt(i)));
            for(int j = 1; j < str.length() - 1; j++){
                if(Character.isDigit(str.charAt(j)) && ((int) str.charAt(j) > (int) str.charAt(i))) {
                    biggestNumber = Integer.parseInt(String.valueOf(str.charAt(j)));
                }
            }
        }

        return biggestNumber;
    }

    /*TASK 5
    -Create a method called
    countSequenceOfCharacters()
    -This method will take a String argument and it will
    return a String which is the count of repeated
    characters in a sequence in the String.
    NOTE: If given String is empty, then return empty String.
    NOTE: It is case sensitive!!! */




    public static void main(String[] args) {

        System.out.println("Task 1 = " + findSumNumbers("a1b4cll6"));

        System.out.println("Task 2 = " + fizzBuzz2(20));

        System.out.println("Task 3 = " + findSumNumbers("b34n1mh2"));

        System.out.println("Task 4 = " + findBiggestNumber("“a11b4c  6#”"));







    }
}
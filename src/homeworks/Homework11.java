package homeworks;

import utilities.CharacterHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {


        System.out.println("Task 1 ");

        //Pseudocode
        //1) we have numbers from 1 to 0 (both included)
        //2) print only numbers dividable by 7
        //3) the order is ascending

        String s = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) s += i + " - ";
        }
        System.out.println(s.substring(0, s.length() - 3));



        ////////////////////////////////

        System.out.println("\n\n Task 2\n");

        //Pseudocode
        //1) we have numbers from 1 to 50 (both included)
        //2) print only numbers dividable by 2 and 3 (6)
        //3) the order is ascending

        String vit = "";

        for (int k = 1; k <= 50; k++) {
            if (k % 6 == 0) vit += k + " - ";
        }

        System.out.println(vit.substring(0, vit.length() - 3));



        ////////////////////////////////

        System.out.println("\n\n Task 3\n");

        //Pseudocode
        //1) we have numbers from 100 to 50 (both included)
        //2) print only numbers dividable by 5
        //3) the order is descending

        String ok = "";

        for (int p = 100; p >= 50; p--) {
            if (p % 5 == 0) ok += p + " - ";
        }
        System.out.println(ok.substring(0, ok.length() - 3));



        ////////////////////////////////

        System.out.println("\n\n Task 4\n");

        //Pseudocode
        //1) we have numbers from 1 to 7 (both included)
        //2) print the square root of each number
        //3) the order is ascending

        int t = 0;

        while (t <= 7) {
            System.out.println("The square of " + t + " is =  " + t * t);
            t++;
        }


        ////////////////////////////////

        System.out.println("\n\n Task 5\n");

        //Pseudocode
        //1)we are given numbers from 1 to 10 (both included)
        //2) find the sum of ALL the number

        int five = 0;


        for (int kot = 1; kot <= 10; kot++) {
            five += kot;
        }
        System.out.println(five);



        ////////////////////////////////

        System.out.println("\n\n Task 6\n");

        //Pseudocode
        //1) ask user for 1 random number
        //2) get a factorial of that number


        int number = ScannerHelper.getNumberFromUser();
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println(fact);



        ////////////////////////////////

        //Pseudocode
        //1)Ask user for his full name
        //2)Find out if name consist any vowels
        //3)Print out the amount of the vowels

        System.out.println("\n\n Task 7\n");

        String str = ScannerHelper.getANameFromUser();

        int vowel = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            if (CharacterHelper.isVowel(str.charAt(i)))
                vowel++;
        }
        System.out.println(vowel);




        ////////////////////////////////

        System.out.println("\n\n Task 8\n");

        /*
        //Pseudocode
        //1) ask user to enter a number
        //2) if n1 < 100 ask for next number
        //3) ask until the sum of all number >= 100;
        //4) use do / while loop
        //5) ascending

        so we need the number of tries ; users number (scanner);
        and sum of numbers

         */



        ////////////////////////////////

        System.out.println("\n\n Task 9\n");

         //Pseudocode
         // You are given a number
         // find series of Fibonacci numbers (closest to given number? less than? more than?)
         // Fibonacci always starts with 0 and 1
         // 0, 1, 1, 2, 3, 5, 8, 13, 21
         // ascending



        ////////////////////////////////

        System.out.println("\n\n Task 10\n");


        //Pseudocode
        //1) user enters a name
        //2)If name starts with j or J, then finish the program
        //3)But, if the name does not start with j or J, then keep
        //ask until user gives a name that starts with j or J.

    }
}

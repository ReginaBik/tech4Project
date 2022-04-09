package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("\n Task 1 \n");

        /*Pseudocode
        * 1) we have 2 string number
        * 2) convert to int
        * 3) get the correct output in int */

        String s1 = "5", s2 = "10";

        int s1Int = Integer.parseInt(s1);
        int s2Int = Integer.parseInt(s2);

        System.out.println("Sum of " + s1Int + " and " + s2Int + " is = " + (s1Int + s2Int)); // The right way
        System.out.println("Product of " + s1Int + " and " + s2Int + " is = " + (s1Int + s2Int)); // The right way
        System.out.println("Division of " + s1Int + " and " + s2Int + " is = " + (s1Int + s2Int)); // The right way
        System.out.println("Subtraction of " + s1Int + " and " + s2Int + " is = " + (s1Int + s2Int)); // The right way
        System.out.println("Remainder of " + s1Int + " and " + s2Int + " is = " + (s1Int + s2Int)); // The right way

        //////////////////////

        System.out.println("\n Task 2 \n");

        /*Pseudocode
        * 1) convert 2 given numbers into int
        * 2) find and print out the output as requested */

        String string1 = "200";
        String string2 = "-50";

        int string1Int = Integer.parseInt(string1);
        int string2Int = Integer.parseInt(string2);

        System.out.println("The greatest value is = " + (Math.max(string1Int, string2Int)));
        System.out.println("The smallest value is = " + (Math.min(string1Int, string2Int)));
        System.out.println("The average is = " + ((string1Int + string2Int)/2));
        System.out.println("The absolute difference is = " + (string1Int - string2Int));



        //////////////////////

        System.out.println("\n Task 3 \n");

        /* Pseudocode
        1)Get the right data type for money you have
        2) figure out 3 different outcomes using the right data Types
        * */

        double quarters3 = 0.75;
        double dime = 0.10;
        double nickels2 = 0.10;
        double penny1 = 0.01;

        double savingADay = (quarters3 + dime + nickels2 + penny1);



        double daysTill24 = (24 / savingADay);
        System.out.println((int) daysTill24 + " days");

        double daysTill168 = (168 / savingADay);
        System.out.println((int) daysTill168 + " days");

        double savesIn30Days = (savingADay * 30) * 5;
        System.out.println("$" + savesIn30Days);



        //////////////////////

        System.out.println("\n Task 4 \n");

        /* Pseudocode
        1) create an object using correct data type
        2) get the right output using correct data type
         */

        double finalSaving = 1250.00;
        double dailySaving = 62.5;

        System.out.println((int)(finalSaving/dailySaving));



        //////////////////////

        System.out.println("\n Task 5 \n");

        /* Pseudocode
        * 1) Get the right Data Type for given amounts of money
        * 2) Find the correct output for both options
        * */

        double dreamCar = 14_265;
        double option1 = (dreamCar / 475.50);
        double option2 = (dreamCar / 951);

        System.out.println("Option 1 will take " + (int) option1 + " months");
        System.out.println("Option 2 will take " + (int) option2 + " months");



        //////////////////////

        System.out.println("\n Task 6 \n");

        /* Pseudocode
         * 1) ask customer to enter 2 numbers in int data type
         * 2)convert int into double
         * 3)Get the result in double
         * */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers.");


        int number1 = input.nextInt();
        int number2 = input.nextInt();

        double numberOne = number1;
        double numberTwo = number2;

        double result = numberOne / numberTwo;

        System.out.println(result);

    }
}

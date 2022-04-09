package homeworks;
import javafx.animation.Interpolator;

import java.util.Scanner;
public class Homework04 {
    public static void main(String[] args) {
        System.out.println("Task 1");

        /* Pseudocode
        * 1) create an object and import it
        * 2) ask user to put 2 random numbers
        * 3) get the right output (the average of 2 numbers
        * */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers.");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println("The average of the given 2 numbers is: " + ((number1 + number2)/2));

        /////////////////////////////



        System.out.println("\n Task 2 \n");

        /* Pseudocode
        1)ask user to enter 2 random numbers
        2)get the product of numbers (multiplication)
        *  */

        System.out.println("Please enter 2 numbers");
        int variable1 = input.nextInt();
        int variable2 = input.nextInt();

        System.out.println("The product of given 2 numbers is: " + variable1 * variable2);

        /////////////////////////////



        System.out.println("\n Task 3 \n");

        /*Pseudocode
        * 1) ask user to put 3 numbers
        * 2) find square of each number and run the program
        *  */

        System.out.println("Please enter 3 numbers");
        int nomer1 = input.nextInt();
        int nomer2 = input.nextInt();
        int nomer3 = input.nextInt();

        System.out.println("the " + nomer1 + " multiplied with " + nomer1 + " is = " +
                + (nomer1 * nomer1) + "\nthe " + nomer2 + " multiplied with " + nomer2 + " is = " +
                + (nomer2 * nomer2) + "\nthe " + nomer3 + " multiplied with " + nomer3 + " is = " +
                + (nomer3 * nomer3));

        /////////////////////////////



        System.out.println("\n Task 4 \n");

        /*Pseudocode
        * 1) ask user to put 2 random numbers
        * 2) get the remainder of first number by second one
        *  */

        System.out.println("Please enter 2 numbers.");
        int firstOne = input.nextInt();
        int secondOne = input.nextInt();

        int remainder = firstOne % secondOne;

        System.out.println("The remainder of " + firstOne + " % " + secondOne + " = " + remainder);

        /////////////////////////////



        System.out.println("\n Task 5 \n");
        /* Pseudocode
        * 1)ask user to enter 5 random number
        * 2)get the average of these 5 numbers
        *  */

        System.out.println("Please enter 5 numbers");

        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int fourth = input.nextInt();
        int fifth = input.nextInt();

        System.out.println("The average of the given 5 numbers is : " +
                + ((first + second + third + fourth + fifth)/5));

        /////////////////////////////



        System.out.println("\n Task 6 \n");

        /* Pseudocode
        * 1)Ask user to enter a number
        * 2)print out the result by multiplying user's number from 1 to 10
        * */

        System.out.println("Please enter a number.");

        int number = input.nextInt();

        System.out.println(number +  " * 1 = " + (number * 1) + "\n" + number + " * 2" +
                " = " + (number * 2) + "\n" + number + " * 3 = " + (number * 3) + "\n" + number + " * 4"
                + " = " + (number * 4) + "\n" + number + " * 5 = " + (number * 5) + "\n" + number + " * 6"
                + " = " + (number * 6) + "\n" + number + " * 7 = " + (number * 7) + "\n" + number + " * 8" +
                " = " + (number * 8) + "\n" + number + " * 9 = " + (number * 9) + "\n" + number + " * 10 = " +
                (number * 10));


//        String alex = String.format("%s * 10 = %s \n%s * 100 = %s", number, number *10, number, number * 100);

     //   System.out.println(alex);

        /////////////////////////////



        System.out.println("\n Task 7 \n");

        /* Pseudocode
        * 1) ask user to enter a number
        * 2) find perimeter and area of the square using that number
        * */

        System.out.println("Please enter the side of the square.");

        int side = input.nextInt();

        System.out.println("Perimeter of the square = " + (side * side));
        System.out.println("Area od the square = " + (4 * side));

    }
}

package homeworks;
import java.util.Scanner;

public class Homework03 {

    public static void main(String[] args){

        Scanner numberInput = new Scanner(System.in);

        System.out.println("\nTask 1\n");

        /* Pseudocode
        1) create an object
        2) ask customer for 2 numbers
        3) print out the sum of 2 numbers */

        System.out.println("Please enter first number.");

        int number1 = numberInput.nextInt();

        System.out.println("Please enter second number");

        int number2 = numberInput.nextInt();

        System.out.println("The number 1 entered by user is = " + number1 + "\nThe " +
                "number 2 entered by user is = " + number2 + "\nThe sum of number 1 " +
                "and 2 entered by user is = " + (number1 + number2));

        ///////////////////////

        System.out.println("\nTask 2\n");

        /* Pseudocode
        1) ask user to put 2 floating numbers
        2) store it in double variables
        3) print the division of given numbers */

        System.out.println("Please enter first floating number.");

        double firstNmb = numberInput.nextDouble();

        System.out.println("Please enter second floating number.");

        double secondNmb = numberInput.nextDouble();

        System.out.println("The number 1 entered by user is = " + firstNmb + "\nThe " +
                "number 2 entered by user is = " + secondNmb + "\nThe division of " +
                "number 1 and 2 entered by user is \n= " + (firstNmb / secondNmb));

        ///////////////////////

        System.out.println("\n Task 3 \n");

        /* Pseudocode
        1)to write the java code for multiple operations
        2)print out the results according to requirements
        * */

        int a = -10;
        int b = 7;
        int c = 5;

        int d = a + b*c;

        System.out.println("1. " + d);


        int n1 = 72;
        int n2 = 24;

        int n3 = (n1 + n2) % n2;

        System.out.println("2. " + n3);


        int k = 10;
        int l = -3;
        int m = 9;

        int n = k + l * m / m;
        System.out.println("3. " + n);


        int o = 5;
        int p = 18;
        int q = 3;
        int r = 6;

        int s = o + p / q * q - (r % q);
        System.out.println("4. " + s);

        ///////////////////////

        System.out.println("\n Task 4 \n");

        /*Pseudocode
        1) ask customer for 2 variables
        2) store it in doubles
        3)print out hte expected output from operations
        */

        System.out.println("Please enter floating number 1");

        double variable1 = numberInput.nextDouble();

        System.out.println("Please enter floating number 2");

        double variable2 = numberInput.nextDouble();

        System.out.println("The sum of the given numbers is = " + (variable1 + variable2));
        System.out.println("The product of the given numbers is = " + (variable1 * variable2));
        System.out.println("The subtraction of the given numbers is = " +(variable1 - variable2));
        System.out.println("The division of the given numbers is = " +(variable1 / variable2));
        System.out.println("The remainder of the given numbers is = " +(variable1 % variable2));

        ///////////////////////

        System.out.println("\nTask 5\n");

        double width = 7.5;
        double height = 10.5;

        double area = width * height;
        double perimeter = (width + height) * 2;

        System.out.println("The area of rectangle = " + area);
        System.out.println("The perimeter of rectangle = " + perimeter);

        ///////////////////////

        System.out.println("\nTask 6\n");

        double annualSalary = 90000.0;

        System.out.println("A Software Engineer in Test can earn " + (annualSalary * 3) + " in 3 years.");

    }
}

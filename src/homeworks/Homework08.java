package homeworks;
import utilities.MyMethods;
import utilities.RandomNumberGenerator;

import java.util.Scanner;
public class Homework08 {
    public static void main(String[] args) {

        System.out.println("\nTask 1\n");

        int task1number = (int) ((Math.random() * 51) + 1);
        System.out.println(task1number);

        if (task1number >= 10 && task1number <= 25) System.out.println("true");
        else System.out.println("false");

        MyMethods.isNumberBetween10And25(task1number);

        // it is BETTER to do this task in 1 sentence
        // System.out.println(task1number >= 10 && task1number <= 25);


        // System.out.println((task1number >= 10 && task1number <= 25)
        //    ? "r is in between 10 and 25"
        //    : "r is not in between 10 and 25" );


        ///////////////////////////

        System.out.println("\nTask 2\n");

        int task2Number = (int) ((Math.random() * 100) + 1);
        System.out.println(task2Number);

        int r2 = RandomNumberGenerator.getRandomNumber(1, 100);
        System.out.println(r2);  // new way using created method

        if ((task2Number >= 1 && task2Number <= 50)) {
            System.out.println(task2Number + " is in the first half");
        } else {
            System.out.println(task2Number + " is in the second half");
        }

        if ((task2Number >= 1) && (task2Number <= 25))
            System.out.println(task2Number + " is in the 1st quarter");
        else if ((task2Number >= 26) && (task2Number <= 50))
            System.out.println(task2Number + " is in the 2nd quarter");
        else if ((task2Number >= 51) && (task2Number <= 75))
            System.out.println(task2Number + " is in the 3rd quarter");
        else if ((task2Number >= 76) && (task2Number <= 100))
            System.out.println(task2Number + " is in the 4th quarter");

        ///////////////////////////

        System.out.println("\nTask 3\n");

        Scanner numberInput = new Scanner(System.in);
        System.out.println("Please enter 5 numbers between 5 and 10 (5 and 10 are included)");

        int number1 = numberInput.nextInt();
        int number2 = numberInput.nextInt();
        int number3 = numberInput.nextInt();
        int number4 = numberInput.nextInt();
        int number5 = numberInput.nextInt();

        int points = 0;

        if (number1 >=1 && number1 <= 10){
            points += number1 * 5;
        }
        if (number2 >=1 && number2 <= 10){
            points += number2 * 4;
        }
        if (number3 >=1 && number3 <= 10){
            points += number3 * 3;
        }
        if (number4 >=1 && number4 <= 10){
            points += number4 * 2;
        }
        if (number5 >=1 && number5 <= 10){
            points += number5 * 1;
        }
        System.out.println("Points = " + points );

       /* I tried to put the post decrement operator here but got lost
        int pointSystem = 5;
        */

       /* if (number1 <= 10 && number1 >= 1){
            System.out.println(number1 * pointSystem--);
        if(number2 <= 10 && number2 >= 1) {
            System.out.println((number1 * pointSystem--) + (number2 * pointSystem--));
            if(number3 <= 10 && number3 >= 1) {
                System.out.println(((number1 * pointSystem--) + (number2 * pointSystem--)) + (number3 * pointSystem--));
                if(number4 <= 10 && number4 >= 1) {
                    System.out.println(((number1 * pointSystem--) + (number2 * pointSystem--)
                            + (number3 * pointSystem--)) + (number4 * pointSystem--));
                    if(number5 <= 10 && number5 >= 1) {
                        System.out.println((((number1 * pointSystem--) + (number2 * pointSystem--)
                                + (number3 * pointSystem--)) + (number4 * pointSystem--)) + (number5 * pointSystem--));
        }}}}}



       /* int totalPoints = (number1 * 5) + (number2 * 4) + (number3 * 3) + (number4 * 2) + (number5 * 1);

        System.out.println(totalPoints);*/


        ///////////////////////////

    }
}

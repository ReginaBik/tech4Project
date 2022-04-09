package homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);



        System.out.println("Task 1 \n");

        /* Pseudocode
        1) create an object
        2) ask person to enter 3 numbers
        3) get min and max in output
        * */

        System.out.println("Please enter 3 numbers.");

        int number1 = userInput.nextInt();
        int number2 = userInput.nextInt();
        int number3 = userInput.nextInt();

        int maxValue1And2 = Math.max(number1, number2);
        int maxValue = Math.max(maxValue1And2, number3);

        int minValue1And2 = Math.min(number1, number2);
        int minValue = Math.min(minValue1And2, number3);

        System.out.println("Max Value = " + maxValue);
        System.out.println("Min Value = " + minValue);


        /////////////////////

        System.out.println("\nTask 2\n");

        /*Pseudocode
        1)ask customer to insert 5 numbers
        2)find max and min and get the required result
        * */

        System.out.println("Please enter 5 numbers.");

        int numberA = userInput.nextInt();
        int numberB = userInput.nextInt();
        int numberC = userInput.nextInt();
        int numberD = userInput.nextInt();
        int numberE = userInput.nextInt();

        int maxAAndB = Math.max(numberA, numberB);
        int maxABAndC = Math.max(maxAAndB, numberC);
        int maxABCAndD = Math.max(maxABAndC, numberD);
        int maxNewValue = Math.max(maxABCAndD, numberE);

        System.out.println("\nMax value = " + maxNewValue);

        int minAAndB = Math.min(numberA, numberB);
        int minABAndC = Math.min(minAAndB, numberC);
        int minABCAndD = Math.min(minABAndC, numberD);
        int minNewValue = Math.min(minABCAndD, numberE);

        System.out.println("Min value = " + minNewValue);


        /////////////////////

        System.out.println("\nTask 3\n");

        /*Pseudocode
        1) ask user to enter 2 numbers
        2) find the absolute difference between these numbers
         * */

        System.out.println("Please enter 2 numbers.");

        int firstOne = userInput.nextInt();
        int secondOne = userInput.nextInt();

        int absolute = Math.abs(firstOne - secondOne);

        System.out.println("\nThe difference between numbers is = " + absolute);



        /////////////////////
        System.out.println("\nTask 4\n");

        /*Pseudocode
        1)generate 3 numbers between 50 and 100
        2)find the sum of these numbers
        * */

        int randomBetween50And1001 = (int) (Math.random() * 51) + 50;
        int randomBetween50And1002 = (int) (Math.random() * 51) + 50;
        int randomBetween50and1003 = (int) (Math.random() * 51) + 50;

        System.out.println("Number 1 = " + randomBetween50And1001);
        System.out.println("Number 2 = " + randomBetween50And1002);
        System.out.println("Number 3 = " + randomBetween50and1003);

        System.out.println("\nThe sum of numbers is = " +
                (randomBetween50And1001 + randomBetween50And1002 + randomBetween50and1003));





        /////////////////////

        System.out.println("\nTask 5\n");

        /*Pseudocode
        1) two numbers
        2) find the results of both after some operations
        * */

        double balanceAlex = 125;
        double balanceMike = 220;
        double givenMoney = 25.5;

        balanceAlex -= givenMoney;
        balanceMike += givenMoney;

        System.out.println("Alex's money: $" + balanceAlex);
        System.out.println("Mike's money: " + balanceMike);




        /////////////////////

        System.out.println("\nTask 6\n");

        /*Pseudocode
        1) We have a final sum for a bicycle
        2)Split it with daily amount of money
        * */

        double dreamSum = 390;
        double daily = 15.60;

        double daysTillTheDream = (int) (dreamSum / daily);
        System.out.println((int) daysTillTheDream);

    }
}

package Casting;
import java.util.Scanner;
public class ExerciseRecap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 numbers.");

        String one = input.next();
        String two = input.next();
        String three = input.next();
        String four = input.next();
        String five = input.next();

        int first = Integer.parseInt(one);
        int second = Integer.parseInt(two);
        int third = Integer.parseInt(three);
        int fourth = Integer.parseInt(four);
        int fifth = Integer.parseInt(five);

        System.out.println("The average of these 5 numbers is = " + ((first + second + third + fourth + fifth)/5));

        /////////////////////

        System.out.println("What is your balance ?");

        String balance = input.next();

        System.out.println("What is your next 3 transactions?");

        String trans1 = input.next();
        String trans2 = input.next();
        String trans3 = input.next();

        System.out.println((Double.parseDouble(balance) -
                Double.parseDouble(trans1) -
                Double.parseDouble(trans2) -
                Double.parseDouble(trans3)));

        /*
Write a program ASK user for full name, age, phone number then
enter their 3 kids age as string then print out everything plus
the oldest kid, youngest and the age difference between oldest
and youngest.

Program: "Please enter your name"
User: John Doe
Program: "Please enter your age:
User: 45
Program: "Please enter your phone number:
User: (123) 123 1234
Program: "Enter the ages of your kids"
User:
12
22
17
Program:
Your name is John Doe, your phone number is (123) 123 1234,
You are 45 years old, Your oldest kid is 22 years old, your
youngest is 12, difference between oldest and youngest is 10
years.

 */

        System.out.println("Please enter your full name");

        input.nextLine();

        String fullName = input.nextLine();


        System.out.println("Please enter your age");

        String age = input.next();


        System.out.println("Please enter your phone number");

        input.nextLine();

        String phoneNumber = input.nextLine();


        System.out.println("Enter your first child's age");

        String ageKid1 = input.next();

        String ageKid2 = input.next();

        String ageKid3 = input.next();

        int ageKid1Int = Integer.parseInt(ageKid1);
        int ageKid2Int = Integer.parseInt(ageKid2);
        int ageKid3Int = Integer.parseInt(ageKid3);

        Math.max(ageKid1Int, ageKid2Int);
        Math.max(Math.max(ageKid1Int, ageKid2Int), ageKid3Int);

        Math.min(ageKid1Int, ageKid2Int);
        Math.min(Math.min(ageKid1Int, ageKid2Int), ageKid3Int);

        Math.abs((Math.max(Math.max(ageKid1Int, ageKid2Int), ageKid3Int)) -
                (Math.min(Math.min(ageKid1Int, ageKid2Int), ageKid3Int)) );



        System.out.println("Your name is = " + fullName + ", your phone number is = " + phoneNumber +
                " , \nYou are " + age + " years old, Your eldest kid is " +
                (Math.max(Math.max(ageKid1Int, ageKid2Int), ageKid3Int)) + " years old. " +
                "Your \nyoungest kid is " + (Math.min(Math.min(ageKid1Int, ageKid2Int), ageKid3Int)) + " years old." +
                " The difference between oldest kid and youngest kid is " +
                (Math.abs((Math.max(Math.max(ageKid1Int, ageKid2Int), ageKid3Int)) -
                        (Math.min(Math.min(ageKid1Int, ageKid2Int), ageKid3Int)))) + " years.");





    }
}

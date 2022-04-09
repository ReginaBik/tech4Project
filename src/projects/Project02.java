package projects;
import java.util.Scanner;

public class Project02 {

    public static void main(String[] args) {

        System.out.println("\n Task 1 \n");
        /* Pseudocode
        1) ask user to enter 3 numbers
        2) user puts 3 random numbers
        3) multiply all 3 numbers and get the output
        * */

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 3 numbers.");

        int firstNumber = userInput.nextInt();
        int secondNumber = userInput.nextInt();
        int thirdNumber = userInput.nextInt();

        System.out.println("The product of the numbers entered is " +
                "= " + firstNumber * secondNumber * thirdNumber);


        ////////////////////

        System.out.println("\n Task 2 \n");

        /* Pseudocode
        * 1)Ask user for first name, last name and year of birth separately
        * 2)User puts the correct info
        * 3)output is  age (current year - year of birth)
        * */

        System.out.println("What is your first name?");
        String firstName = userInput.next();

        System.out.println("What is your last name?");
        String lastName = userInput.next();

        System.out.println("What is your year of birth?");
        int yearOfBirth = userInput.nextInt();

        System.out.println(firstName + " " + lastName + "'s age is = " + (2022 - yearOfBirth) + ".");


        ////////////////////

        System.out.println("\n Task 3 \n");

        /* Pseudocode
        * 1) Ask user for full name and weight in kg separately
        * 2) Get the correct output (weight in lbs) according to requirements
        * */

        System.out.println("What is your full name.");
        userInput.nextLine();
        String fullName = userInput.nextLine();

        System.out.println("What is your weight in kg.");
        double kgWeight = userInput.nextDouble();

        System.out.println(fullName + "'s weight is = " + (kgWeight * 2205) / 1000 + " lbs.");


        ////////////////////

        System.out.println("\n Task 4 \n");

        /* Pseudocode
        * 1) Ask 3 users for full name and age separately
        * 2) find output for the average age
        * 3) find the output for max and min ages
        * */

        System.out.println("What is your full name?");
        userInput.nextLine();
        String student1FullName = userInput.nextLine();
        System.out.println("What is your age?");
        int student1Age = userInput.nextInt();


        System.out.println("What is your full name?");
        userInput.nextLine();
        String student2FullName = userInput.nextLine();
        System.out.println("What is your age?");
        int student2Age = userInput.nextInt();


        System.out.println("What is your full name?");
        userInput.nextLine();
        String student3FullName = userInput.nextLine();
        System.out.println("What is your age?");
        int student3Age = userInput.nextInt();


        System.out.println(student1FullName + "'s age is " + student1Age + ".");
        System.out.println(student2FullName + "'s age is " + student2Age + ".");
        System.out.println(student3FullName + "'s age is " + student3Age + ".");


        System.out.println("The average age is " + ((student1Age + student2Age + student3Age)/3) +".");


        int max1And2studentsAge = Math.max(student1Age, student2Age);
        int maxAge = Math.max(max1And2studentsAge, student3Age);

        System.out.println("The eldest age is " + maxAge + ".");


        int min1And2StudentsAge = Math.min(student1Age, student2Age);
        int minAge = Math.min(min1And2StudentsAge, student3Age);

        System.out.println("The youngest age is " + minAge + ".");

    }
}

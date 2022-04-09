package homeworks;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args){
        System.out.println("\nTask 1\n");

        /*Pseudo code:
          -Writing a program that asks user to enter their first name, last name, age, email address,
          phone number, and address in separate statements.
          -Storing these data given from user in proper data types.
          -Printing the data provided by user as below example.
        */
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your first name");

        String firstName = userInput.next();

        System.out.println("Enter your last Name");

        String lastName = userInput.next();

        System.out.println("Enter your age");

        int customersAge = userInput.nextInt();

        System.out.println("Enter your email address");

        String emailAddress  = userInput.next();

        System.out.println("Enter your first 3 digits of phone number");

        int firstThree = userInput.nextInt();

        System.out.println("Enter your next 3 digits of phone number");

        int nextThree = userInput.nextInt();

        System.out.println("Enter your last 4 digits of phone number");

        int lastFour = userInput.nextInt();

        System.out.println("Enter your address");

        userInput.nextLine();

        String address = userInput.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + " " + lastName
                + ". " + firstName + "\'s age" +
                " is " + customersAge + ".\n " + firstName + "\'s email " +
                "address is " + emailAddress + ", phone number " + "(" + firstThree + ")"
                + " "+ nextThree + "\n "+ lastFour +
                ", and address is " + address + ".");

        System.out.println("\nTask 2");

        System.out.println("What is your favorite book?");

        String favoriteBook = userInput.nextLine();

        System.out.println("What is your favorite color?");

        String favoriteColor = userInput.next();

        System.out.println("What is your favorite number?");

        int favoriteNumber = userInput.nextInt();

        System.out.println("\nUser\'s favorite book is:  "  + favoriteBook + "\nUser\'s favorite color " +
                "is: " + favoriteColor + "\nUser\'s favorite number is: " + favoriteNumber);


    }
}

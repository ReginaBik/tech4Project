package scanner;
import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args) {
        //ask First Name
        //print first name
        //ask last name
        //print last name
        // print the first and last name in the same sentence

        Scanner input = new Scanner(System.in);

        System.out.println("Put your first name");

        String firstName = input.next();

        System.out.println("Put your last name");

        String lastName = input.next();

        System.out.println("Your name is " + firstName + " " + lastName);

        System.out.println("What is your address?");
        input.nextLine();

        String myAddress = input.nextLine();

        System.out.println("Your address is " + "\"" + myAddress + "\"");








    }
}

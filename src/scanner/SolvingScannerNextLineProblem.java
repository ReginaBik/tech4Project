package scanner;

import java.util.Scanner;

public class SolvingScannerNextLineProblem {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Put your name below");

        String userName =  userInput.next();

        System.out.println("Put your age");

        int age =userInput.nextInt();

        System.out.println("Is your brain fried?");
        boolean myBrainOk = userInput.nextBoolean();

         System.out.println("Your address?");
         userInput.nextLine();

         String address = userInput.nextLine();

    }
}

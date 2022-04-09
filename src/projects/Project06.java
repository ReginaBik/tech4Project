package projects;

import java.util.Scanner;

import utilities.ScannerHelper;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("\nTask 1");

        /*
        * PSEUDOCODE
        * 1) ask user to enter a string
        * 2) If the string has multiple word count how many\
        * 3) we use Scanner and increment i in loop
        * 4) we create counter container to count spaces*/

        int countWords = 0;
        String fromUser = ScannerHelper.getAStringFromUser();

        if (fromUser.contains(" ")) {
            for (int i = 0; i < fromUser.length(); i++) {
                if (fromUser.charAt(i) == ' ') {
                    countWords++;

                }
            }
            System.out.println("This sentence has " + (countWords + 1) + " words");
        } else System.out.println("This sentence does not have multiple words.");


        ////////////////////////


        System.out.println("\n\n Task 2 ");

        /*
        * PSEUDOCODE
        * 1) Get a word from user
        * 2) If given word reads the same in reverse return "This word is palindrome"
        * 3) palindrome has to be case sencitive
        * 4) we use decrement for i to reverse the given String*/

        System.out.println("Please enter a word");
        Scanner userInput = new Scanner(System.in);

        String sentenceTask2 = userInput.nextLine();

        String reverse = "";

        if (sentenceTask2.length() > 0) {
            for (int i = sentenceTask2.length() - 1; i > 0; i--) {
                reverse += sentenceTask2.charAt(i);
            }
            if (sentenceTask2.contains(reverse))
                System.out.println("This word is palindrome");
            else
                System.out.println("This word is not palindrome");
        } else
            System.out.println("This word does not have 1 or more characters");


        ////////////////////////


        System.out.println("\n\n Task 3 ");

        /*
         * PSEUDOCODE
         * 1) Get a sentence from user
         * 2) figure out how many 'A' or 'a' given sentence has;
         * 3) print out the message "This sentence has 3 a or A letters."
         * 4) if sentence doesn't have required characters print out
         * “This sentence does not have any characters”.
         * 5) i in loop is increment; 6) we create int counter for required characters
         */


        System.out.println("Please enter a sentence: ");
        String usersSentence = userInput.nextLine().toLowerCase();
        int count = 0;

        if (usersSentence.length() >= 1) {
            for (int i = 0; i < usersSentence.length(); i++) {
                if (usersSentence.charAt(i) == 'a')
                    count++;

            }
            System.out.println("This sentence has " + count + " a or A letters.");

        } else System.out.println("This sentence does not have any characters");


        ////////////////////////


        System.out.println("\n\n Task 4 ");

        /*
        * PSEUDOCODE
        * 1) user enters positive number
        * 2) in increment order we need to print out number from 1 to given number
        * 3) IMPORTANT: print out Foo for all numbers divided by 2;
        * 4) print out Bar instead for number divided by 3
        * 5) print out FooBar for numbers divided by 6 (2 and 3)
        * */

        System.out.println("Please enter a positive number ");
        int num = userInput.nextInt();


        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i % 3 == 0) System.out.println("FooBar");

            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");

            else System.out.println(i);
        }


    }
}

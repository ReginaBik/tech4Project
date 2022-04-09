package homeworks;
import utilities.CharacterHelper;

import java.util.Scanner;
public class Homework11Recap {
    public static void main(String[] args) {

        System.out.println("Task 7 RECAP");

//        Pseucode
//         1) ask user a full name
//         2) Create a counter outside from the loop
//         3) Create a fori loop and check every single char if they are vowel count it
//           4) Print out "There are 3 vowel letters in this full name"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = scanner.nextLine();

        int counter = 0;

        for(int i = 0; i < fullName.length(); i++){
            if(CharacterHelper.isVowel(fullName.charAt(i))){
                counter++;
            }
        }
        System.out.println("There are " + counter + " vowel letters in this full name");

        ///////////////////////////////////////
        System.out.println("\n\nTask 8 RECAP");

        /*
        * PSEUDOCODE
        * 1)Create a do-while loop
        * 2)GET NUMBER FROM USER using scanner and sum it up
        * 3)If the sum is >= 100 break it or print out the message "The numbers are >= 100!"
        * 4) Create a container for counter, sum, users number
        * */
        int num = 0;  // for getting a number from user
        int sum = 0;  // sum of given numbers
        int attempt = 1;  // how many times the loop had run


        do {
            System.out.println("Please enter a number");
            num = scanner.nextInt();

            if(attempt == 1 && num >= 100){
                System.out.println("This number is more or equal to a 100");
                break;
            } else {
                sum += num;
                if (sum  >= 100){
                    System.out.println( "These numbers are more or equal to a 100"); // the sum >= 100
                }
            }
            attempt++;  // for updating the attempt (how many TIMES we run the loop)
        }while(sum < 100);

        ///////////////////////////////////////
        System.out.println("\n\nTask 9 RECAP");

        /*
        * 1) 2 containers for 0 and 1 and another one for the sum
        * 2) create a fori loop runs 'n' times
        * 3)print out the series
        */




        int n1 = 0;
        int n2 = 1;
        int total1 = 0;
        String message = "";

        for (int i = 0; i < 7; i++){
            message += n1 + " - ";
            total1 = n1 + n2;
            n1 = n2;
            n2 = total1;


        }













    }
}

package ifElseStatemnets.ifElseStatements;
import java.util.Scanner;
public class FiandASmallestOfTwoNumbers {
    public static void main(String[] args) {

        Scanner inputN = new Scanner(System.in);

        System.out.println("Please enter 2 numbers.");

        int number1 = inputN.nextInt();
        int number2 = inputN.nextInt();

        // System.out.println(Math.min(number1, number2));

        if(number1 < number2) System.out.println(number1);
         else System.out.println(number2);
        System.out.println("End of the program!"); // less code is best code

        // or we can use ternary operator instead of if-else statement
        //it is used a lot in Jaa programming
        // it can be used only for simple if-else statements
        // variable variableName = condition ? expression1 : expression2;

        int smallestNumber = number1 < number2 ? number1 : number2;

        System.out.println(smallestNumber);

        int greatest = 5 < 23 ? 23 : 5;

        //////////////////////////////////////////

        String name1 = "Kaycee";
        String name2 = "Kaly";

        int ageKaly = 19;
        int ageKaycee = 20;


        // Kali 19 ageKaly
        // Kaycee 20 ageKaycee

        String oldest =  ageKaly < ageKaycee ? "Kaycee" : "Kaly";

        System.out.println(oldest);

        //SWITCH STATEMENTS



    }
}

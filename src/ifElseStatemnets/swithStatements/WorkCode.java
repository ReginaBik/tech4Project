package ifElseStatemnets.swithStatements;
import java.util.Scanner;
public class WorkCode {
    public static void main(String[] args) {

        /* write a program that asks user to ask which day is it.
         Based on the answer print what color will be outfit
        1 - Monday- black
        2 - Tuesday - red
        3 - Wednesday - purple
        4 - Thursday - yellow
        5 - Friday - orange
        * */

        Scanner number = new Scanner(System.in);

        System.out.println("What day is it today?");

        int day = number.nextInt();

        if(day == 1)System.out.println("Black"); else if(day == 2) System.out.println("red");
        else if (day == 3) System.out.println("purple");
        else if(day == 4) System.out.println("yellow");
        else if(day == 5) System.out.println("orange");
        else if(day == 6 || day == 7) System.out.println("It is weekend!");
        else System.out.println("It is not the week day!");

        System.out.println("End of program!");

        //
        switch (day) {
            case 1 :
                System.out.println("Blue");
                break;
            case 2 :
                System.out.println("red");
                break;
            case 3 :
                System.out.println("purple");
                break;
            case 4 :
                System.out.println("Yellow");
                break;
            case 5 :
                System.out.println("orange");
                break;
            case 6 :
            case 7 :
                System.out.println("It is weekend");
                break;

            default :
                System.out.println("It is not the weekDay");


        }

    }
}

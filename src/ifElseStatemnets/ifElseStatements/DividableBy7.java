package ifElseStatemnets.ifElseStatements;
import java.util.Scanner;

public class DividableBy7 {
    public static void main(String[] args) {

        Scanner hi = new Scanner(System.in);
        System.out.println("Please enter a number?");

        double number = hi.nextDouble();

        boolean numberDevidable = number % 7 == 0;

        if(numberDevidable){
            System.out.println("The number you entered is dividable by 7!");
        } else {
            System.out.println("The number you entered is not dividable by 7!");
        }

    }
}

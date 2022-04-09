package ifElseStatemnets.ifElseStatements;
import java.util.Scanner;
public class MathGradeEx {
    public static void main(String[] args) {

        Scanner score = new Scanner(System.in);

        System.out.println("What's your name?");

        String name = score.next();

        System.out.println( name + " what's your balance?");

        double balance = score.nextDouble(); // Double.parseDouble(score.nextDouble())
        boolean balance600 = balance >= 600.0;

        if(balance600){
            System.out.println("Awesome! You have enough money!");
        } else {
            System.out.println("Sorry! You are poor!");
        }


    }
}

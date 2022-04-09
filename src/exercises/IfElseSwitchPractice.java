package exercises;
import java.util.Scanner;
public class IfElseSwitchPractice {
    public static void main(String[] args) {

        System.out.println("Please enter your age");

        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        if (age >= 16){
            System.out.println("You can drive");
            if (age >= 18){
                System.out.println("You can work");
                if (age >= 21){
                    System.out.println("You can drink");
                   if (age >= 25){
                       System.out.println("You can rent a car");
                   }
                }
            }
        }

        // next ternary
       /* System.out.println("Enter your height");

        int height = input.nextInt();

        String printout = (input.nextInt() > 5) ? "You are tall" : "You can't go to roller coaster";

        /*height >= 5 ? System.out.println("You can't go on roller coaster") : System.out.println("You are tall");

        System.out.println((input.nextInt() > 5) ? "You are tall" : "You can't go to roller coaster");*/

        System.out.println("What's you balance ");

        double balance = input.nextDouble();

        String situation = (balance < 50.0) ? "You are poor" : "You are not poor";

        System.out.println(situation);






    }

}

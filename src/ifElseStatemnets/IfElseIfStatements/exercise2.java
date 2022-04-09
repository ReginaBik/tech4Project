package ifElseStatemnets.IfElseIfStatements;
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");

        int age = input.nextInt();

        System.out.println("What is your weight in pounds?");
        double weight = input.nextDouble();
        System.out.println("\n" + age + "\n" + weight);

        if(age >= 18) {

            System.out.println("You are old enough to drive");
        } else{
            System.out.println("You are not old enough to drive");}

        if(weight >= 150.0){
            System.out.println("You are heavier than 150 pounds!");
        } else{
            System.out.println("You are lighter than 150 pounds!");
        }
    }
}

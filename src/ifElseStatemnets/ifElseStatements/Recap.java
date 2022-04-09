package ifElseStatemnets.ifElseStatements;
import java.util.Scanner;
public class Recap {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please tell what time is it?");

        int hour = inputReader.nextInt();

        if(hour > 6 && hour < 12){
            System.out.println("Good morning");
        }
        else if(hour > 17 && hour < 20){
            System.out.println("Good evening");
        }
        else if(hour > 20 && hour < 24){
            System.out.println("Good night");
        } else {
            System.out.println("Goodbye");
        }
        System.out.println("End of program!");

    }
}

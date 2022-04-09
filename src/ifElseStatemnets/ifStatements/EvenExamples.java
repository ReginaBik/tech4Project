package ifElseStatemnets.ifStatements;
import java.util.Scanner;
public class EvenExamples {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = number.nextInt();

        boolean isEven = num % 2 == 0;
        //if(in.nextInt() % 2==0){system.out.println(""); } else { system.out.println("");}

        if(isEven){
            System.out.println("The number you entered is even!");
        } else {
            System.out.println("The number you entered is not even!");
        }



    }
}

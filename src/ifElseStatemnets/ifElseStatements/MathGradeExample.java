package ifElseStatemnets.ifElseStatements;
import java.util.Scanner;
public class MathGradeExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hey David! Please enter your math grade?");

        int grade = input.nextInt();

        boolean lessThan60 = grade >= 60;

        if(lessThan60){
            System.out.println("Awesome! You have passed the math class!");


        } else {
            System.out.println("Go back to school!");
        }

    }
}

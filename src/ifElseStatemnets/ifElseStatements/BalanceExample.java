package ifElseStatemnets.ifElseStatements;
import java.util.Scanner;

public class BalanceExample {
    public static void main(String[] args) {

        double balance = 150;

        // if(statement, expression, boolean){
            // action to be executed }
        // you can use relational and logical operators

        boolean  isBalanceLessThan0 = balance < 0; // false
        boolean isBalanceEquals100 = balance == 100; // false
        boolean isBalanceBiggerOrEqualThan1000 = balance >= 1000; // false

        boolean titos = balance == 150;

        //create an expression for checking if balance is not equal to -1

        boolean isBalanceNotEqualToMinus1 = balance != -1;
        // another way to do is boolean blaBlaBla = !(Balance == -1); // nut it is not necessary

        if(isBalanceBiggerOrEqualThan1000){ //if it's true execute, otherwise skip
            System.out.println("Your balance is 150");
        }

        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");

        int age = input.nextInt();

        boolean retiringAge = age >= 55;

        if(retiringAge){
            System.out.println("It is your time to get retired!");
        } else {
            System.out.println("You are not gonna retire!");
        }




    }
}

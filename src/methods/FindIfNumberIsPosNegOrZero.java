package methods;
import utilities.CharacterHelper;
import utilities.MathHelper;

import java.util.Scanner;
public class FindIfNumberIsPosNegOrZero {
    public static void main(String[] args) {
        System.out.println("Please enter any number");

        Scanner user = new Scanner(System.in);

        int num1 = user.nextInt();
        if (MathHelper.isPositive(num1)) {
            System.out.println("The number is positive");
        } else if (MathHelper.isNegative(num1)) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        System.out.println("The end of the program!");


        char n = 'G';
        if (CharacterHelper.isUppercase(n)) {
            System.out.println("True");

        } else {
            System.out.println("false");
        }
    }
}

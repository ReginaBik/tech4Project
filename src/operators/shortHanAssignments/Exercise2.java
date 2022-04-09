package operators.shortHanAssignments;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner transactionInput = new Scanner(System.in);
        System.out.println("Please put your balance");
        double balance = transactionInput.nextDouble();

        System.out.println("Your 1st transaction");
        double balance1 = transactionInput.nextDouble();
        balance -= balance1;
        System.out.println("Balance after your first transaction is $" + balance);


        System.out.println("Enter your second transaction");
        double balance2 = transactionInput.nextDouble();
        balance -= balance2;
        System.out.println("Balance after second transaction $" + balance);

        System.out.println("Enter your third transaction");
        double balance3 = transactionInput.nextDouble();
        balance -= balance3;
        System.out.println("Balance after third transaction is $" + balance);






    }
}

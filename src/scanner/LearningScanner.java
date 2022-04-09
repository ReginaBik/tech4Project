package scanner;
import java.util.Scanner;
public class LearningScanner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);// creating a scanner object for using the methods
        System.out.println("Please put your first name");
        String firstName = scanner.next(); //salih (Storing the first name from user)

        System.out.println("Please put your second name");
      String lastName = scanner.next();

       System.out.println("The name user put = " + firstName); // printing my object variable
        System.out.println("The name user put = " + lastName);





    }

}

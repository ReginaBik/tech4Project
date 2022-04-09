package stringMethods;
import utilities.ScannerHelper;

import java.util.Scanner;
public class PracticeLength {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("What is your favorite book and quote in it?");

       String book1 = ScannerHelper.getAStringFromUser();
       String quote1 = ScannerHelper.getAStringFromUser();
       String book2 = ScannerHelper.getAStringFromUser();
       String quote2 = ScannerHelper.getAStringFromUser();

        System.out.println("The length of the favorite book and quote is = " + (book1.length() + quote1.length()) );
        System.out.println("The length of the favorite book2 and quote2 is = " + (book2.length() + quote2.length()) );
    }
}

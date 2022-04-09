package loops;

import utilities.ScannerHelper;

public class AskForNumberDividedBy5 {
    public static void main(String[] args) {


        int n;

        do {
            System.out.println("Please enter a number");
            n = ScannerHelper.getNumberFromUser();
            if (n % 5 != 0) System.out.println("This number is not dividable by 5");
        } while (n % 5 != 0);

        System.out.println("This number is dividable by 5");









    }
}

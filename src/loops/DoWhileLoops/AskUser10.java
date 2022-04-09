package loops.DoWhileLoops;

import utilities.ScannerHelper;
public class AskUser10 {
    public static void main(String[] args){



    int ok = ScannerHelper.getNumberFromUser();


    while(ok < 10) {
        System.out.println("This number is not more or equal 10");
        System.out.println("Please enter a new number");
        ok = ScannerHelper.getNumberFromUser();
    }
        System.out.println("This number is more or than 10");

       /* int number;
        int attempt = 1;

        do{
            if(attempt == 1) System.out.println("Please enter a number");
            else{
                System.out.println("This number is not more than or equal to 10");
                System.out.println("Please enter a new number");
            }
            number = input.nextInt();
            attempt++;
        } while(number < 10);

        System.out.println("This number is more than or equal to 10");*/





    }
}

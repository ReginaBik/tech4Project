package loops.forLoop;

import utilities.MathHelper;
import utilities.ScannerHelper;

public class PrintOddNumbersUsingScanner {
    public static void main(String[] args) {

        int kode = ScannerHelper.getNumberFromUser();

       for (int i = 0; i <= kode; i++) {
           if (i % 2 == 1)
               System.out.println(i);}


       String l = "Kitty";
       String k = l.substring(l.length()-2); //5-2
        System.out.println(k);






    }
}


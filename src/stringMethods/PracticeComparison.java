package stringMethods;
import utilities.ScannerHelper;

import java.util.Scanner;
public class PracticeComparison {
    public static void main(String[] args) {

        System.out.println("Please enter 2 same words");

        Scanner info = new Scanner(System.in);

        String word1 = info.nextLine();
        String word2 = info.nextLine();

        boolean a =word1.equals(word2);

        if (a){
            System.out.println("These Strings are equal");
        }else System.out.println("These Strings are not equal");

       String s1 = ScannerHelper.getAStringFromUser();
       String s2 = ScannerHelper.getAStringFromUser();

       String resultMessage = a ? "These Strings are equal" : "These Strings are not equal";
        System.out.println(resultMessage);
    }
}

package stringMethods;
import utilities.ScannerHelper;

import java.util.Scanner;
public class PracticeSubString {
    public static void main(String[] args) {


        Scanner t = new Scanner(System.in);

        System.out.println("Please write a sentence");

        String sentence = t.nextLine();

        System.out.println("The first word is " + sentence.substring(0));
        //System.out.println("The last " + (sentence.substring('.') - sentence.lastIndexOf(' ')));

        String k = ScannerHelper.getAStringFromUser();

        String first = k.substring(0, k.indexOf(' '));
        String last = k.substring(k.lastIndexOf(' ')+1);
        System.out.println(first);
        System.out.println(last);



    }
}

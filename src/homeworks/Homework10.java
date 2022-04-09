package homeworks;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import utilities.ScannerHelper;
import utilities.StringHelper;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("\n Task 1");

        String s = ScannerHelper.getAStringFromUser();

        if (s.length() <= 0) System.out.println("Length is zero");

        else System.out.println("\nThe length of the String is = " + s.length() + "\nFirst char is = " + s.charAt(0) +
                "\nLast char is = " + s.charAt(s.length() - 1));

        if (s.toLowerCase().contains("a") || s.toLowerCase().contains("e") || s.toLowerCase().contains("i") ||
                s.toLowerCase().contains("o") || s.toLowerCase().contains("u"))
            System.out.println("The String has vowel");
        else System.out.println("The String doesn't have vowel");



        /////////////////////////////

        System.out.println("\n Task 2\n");

        String p = ScannerHelper.getAStringFromUser();

        if (p.length() >= 3) {
            if (p.length() % 2 == 0) {

                System.out.println("" + p.charAt(p.length() / 2 - 1) + p.charAt(p.length() / 2));

            } else System.out.println(p.charAt(p.length() / 2));

        } else {
            System.out.println("Length is less than 3");
        }


        /////////////////////////////

        System.out.println("\n Task 3\n");

        String task3String = "   ";

        if (task3String.length() < 4)
            System.out.println("INVALID INPUT");

        if (task3String.length() >= 4) {

            String first2 = task3String.substring(0, 2);
            String last2 = task3String.substring(task3String.length() - 2);

            System.out.println("First 2 characters are = " + first2 +
                    "\nLast 2 characters are = " + last2 +
                    "\nThe other characters are = " + task3String.substring(2, task3String.length() - 2));
        }


        /////////////////////////////

        System.out.println("\n Task 4\n");

        String task4String = "padpa";

        if (task4String.length() >= 2 && task4String.substring(0, 2)
                .equalsIgnoreCase(task4String.substring(task4String.length() - 2)))

            System.out.println("true");
         else System.out.println("false");

        if (task4String.length() < 2) {
            System.out.println("Length is less than 2");
        }

        /////////////////////////////

        System.out.println("\n Task 5\n");

        String task51 = "orange";
        String task52 = "kefir";


        if (task51.length() < 2 && task52.length() < 2) {
            if (task51.length() < 2 || task52.length() < 2) {

                System.out.println("Invalid input!");

            } else System.out.println("Invalid input!");

        } else {
            System.out.println(task51.substring(1, task51.length() - 1).concat(task52.substring(1, task52.length() - 1)));
        }


        /////////////////////////////

        System.out.println("\n Task 6\n");

        String givenString = "     ";

        if (givenString.length() < 4) {
            System.out.println("Invalid input!");
        } else if (givenString.startsWith("xx") && givenString.endsWith("xx")) {
            System.out.println("true");
        } else
            System.out.println("false");


 }
}

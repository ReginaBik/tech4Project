package stringMethods;

import utilities.ScannerHelper;

public class PracticeStartsWithAndEndsWith {
    public static void main(String[] args) {

        System.out.println("Put your name");

      String t = ScannerHelper.getANameFromUser();

      if (t.startsWith("A") || t.startsWith("a"))
          System.out.println("You are in the club A");
      else System.out.println("You are not in the club A");

        System.out.println(t.toLowerCase().startsWith("a") ? "You are in the club A" : "You are not in the club A");

    }
}

package homeworks;

import utilities.ScannerHelper;

import java.util.Locale;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("\nTask 1\n");

        String name = ScannerHelper.getANameFromUser();

        System.out.println("The length of the name is = " + (int) name.length());

        System.out.println("The first character in the name is = " + name.charAt(0) +
                "\nThe last character in the name is = " + name.charAt(name.length() - 1) +
                "\nThe first 3 characters in the name are = " + name.substring(0, 3));

        System.out.println("The last 3 characters in the name are = " +
                name.substring(name.lastIndexOf("") - 3));

        if(name.toLowerCase().startsWith("a"))
            System.out.println("You are in the club!");
        else System.out.println("Sorry, you are not in the club!");



        ////////////////////////////////

        System.out.println("\n Task 2 \n");

        System.out.println("Please enter your address");

        String address = ScannerHelper.getAStringFromUser();

        if (address.toLowerCase().contains("chicago"))
            System.out.println("You are in the club");
        else if (address.toLowerCase().contains("des plaines"))
            System.out.println("You are welcome to join to the club");
        else System.out.println("Sorry, you will never be in the club");




        ////////////////////////////////

        System.out.println("\n Task 3 \n");

        String colors = ScannerHelper.getAStringFromUser();

        if (colors.toLowerCase().contains("green") && colors.toLowerCase().contains("red"))
            System.out.println("Green and red are in the list");
        else if (colors.toLowerCase().contains("green"))
            System.out.println("Green is in the list");
        else if (colors.toLowerCase().contains("red"))
            System.out.println("Red is in the list");
        else System.out.println("Green and red are not the list");



        ////////////////////////////////

        System.out.println("\n Task 4 \n");

        String str = "   Java is FUN   ";

        System.out.println("The first word in the str is = " + (str.trim().toLowerCase().substring(0, 4)) +
                "\nThe second word in the str is = " + str.trim().toLowerCase().substring(5, 7) +
                "\nThe third word in the str is = " + str.trim().toLowerCase().substring(8));



    }
}

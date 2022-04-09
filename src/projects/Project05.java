package projects;

import utilities.MathHelper;
import utilities.ScannerHelper;
import utilities.StringHelper;

public class Project05 {
    public static void main(String[] args) {
       System.out.println("Task 1\n");

        String task1 = ScannerHelper.getAStringFromUser();
        if (task1.length() < 8 )

            System.out.println("This String does not have 8 characters");

        else {
            String firstfour = task1.substring(0, 4); //Tech
            String lastfour = task1.substring(task1.length() - 4); //obal

            String middleFirst = task1.substring(4, (task1.length() - 4));


            System.out.println(lastfour + middleFirst + firstfour);
        }



        //////////////////////////////////

        System.out.println("\n Task 2\n");

        String task2 = ScannerHelper.getAStringFromUser();
        String firstWord = task2.substring(0, task2.indexOf(' '));
        String middle = task2.substring(task2.indexOf(' '), task2.lastIndexOf(' '));
        String last = task2.substring(task2.lastIndexOf(" ") +1);


        if(!task2.trim().contains(" ")) System.out.println("This sentence does not have 2 or more words to swap");
        else System.out.println(last + middle + " " + firstWord);


        //////////////////////////////////

        System.out.println("\n Task 3 \n");

        String str1 = ScannerHelper.getAStringFromUser();
        String str2 = ScannerHelper.getAStringFromUser();
        String str3 = ScannerHelper.getAStringFromUser();

        if (str1.length() <= 4)
            System.out.println("This sentence doesn't contain any bad words");
        else if (str2.length() <= 4)
            System.out.println("This sentence doesn't contain any bad words");
        if (str3.length() <= 4)
            System.out.println("This sentence doesn't contain any bad words");
            //checked if any of the String <= 4 for program to be valuable
            ///////////

        else if (str1.toLowerCase().contains("stupid") || str1.toLowerCase().contains("idiot"))
            System.out.println(str1.replace("stupid", "nice").replace("idiot", "nice"));
        else System.out.println(str1);
        // checked String1
        ////////////

        if (str2.toLowerCase().contains("stupid") || str2.toLowerCase().contains("idiot"))
            System.out.println(str2.replace("stupid", "nice").replace("idiot", "nice"));
        else System.out.println(str2);
        //Checked String 2
        ////////////

        if (str3.toLowerCase().contains("stupid") || str3.toLowerCase().contains("idiot"))
            System.out.println(str3.replace("stupid", "nice").replace("idiot", "nice"));
        else System.out.println(str3);
        //Checked String 3



        //////////////////////////////////

        System.out.println("\n Task 4\n");

        String name = ScannerHelper.getANameFromUser();

        if (name.length() < 2) System.out.println("invalid input");

        if (name.length() % 2 == 0) System.out.println("" +
                name.charAt(name.length() / 2 - 1) + name.charAt(name.length() / 2));
        else System.out.println(name.charAt(name.length() / 2));



        //////////////////////////////////

        System.out.println("\n Task 5\n");


        String country = ScannerHelper.getANameFromUser();

        String begin = country.substring(0, 2); //Tech
        String end = country.substring(country.length() - 2);
        int endL = end.length() - 2;

        if (country.length() <= 5) System.out.println("invalid input");
        else System.out.println(country.substring(2, country.length() - 2));



        //////////////////////////////////

       System.out.println("\n Task 6\n");

        String address = ScannerHelper.getAStringFromUser();

        if (address.contains("a") || address.contains("A") ||
                address.contains("e") || address.contains("E") || address.contains("i") || address.contains("I") ||
                address.contains("u") || address.contains("U") || address.contains("o") || address.contains("O"))

            System.out.println(address.replace("a", "*").replace("A", "*").
                    replace("e", "#").replace("E", "#").
                    replace("i", "+").replace("I", "+").
                    replace("u", "$").replace("U", "$").
                    replace("o", "@").replace("O", "@"));

        //////////////////////////////////

        System.out.println("\n Task 7");

        int a = MathHelper.getRandomNumber(0, 25);
        int b = MathHelper.getRandomNumber(0, 25);
        System.out.println("int randomNumber1 = " + a +
                "\nint randomNumber2 = " + b);
        System.out.println();

        if (a < b) {
            for (int i = a; i < b; i++) {
                if (i % 5 != 0) {
                    System.out.println(i);
                }
            }
        } else
            for (int i = b; i < a; i++) {
                if (i % 5 != 0) {
                    System.out.println(i);
                }
            }

/*      ?// I TRIED THIS WAY BUT IT DIDN'T WORK
        for(int i = 0; i <= 25; i++) {
            if (a % 5 != 0 && b % 5 != 0 && a > b)
                System.out.println(b++);
            else if (b % 5 != 0 && a % 5 != 0 && b > a)
                System.out.println(a++);
            else if (a % 5 != 0 || b % 5 != 0 && a > b)
                System.out.println(b++);
            else if (b % 5 != 0 || a % 5 != 0 && b > a)
                System.out.println(a++);

 */
        }

    }



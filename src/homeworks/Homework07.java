package homeworks;
import java.util.Scanner;
public class Homework07 {
    public static void main(String[] args){

        System.out.println(" Task 1 \n");

        int random1 =(int) (Math.random() * 11), random2 =(int) (Math.random() * 11),
                random3 =(int) (Math.random() * 11), random4 =(int) (Math.random() * 11);

        System.out.println("\nNumber 1 = " + random1 + "\nNumber 2 = " + random2 +
                "\nNumber 3 = " + random3 + "\nNumber 4 = " + random4 +
                "\nAbsolute difference of " + random1 + " with 5 is = " +
                (Math.abs(random1 - 5)) + "\nAbsolute difference of " + random2 + " with 5 is = " +
                (Math.abs(random2 - 5)) + "\nAbsolute difference of " + random3 + " with 5 is = " +
                (Math.abs(random3 - 5)) + "\nAbsolute difference of " + random4 + " with 5 is = " +
                (Math.abs(random4 - 5)) +
                "\nGreatest number is = " + (Math.max((Math.max(random1, random2)), (Math.max(random3, random4)))) +
                "\nSmallest number is = " + (Math.min((Math.min(random1, random2)), (Math.min(random3, random4)))));


        /////////////////////////////////

        System.out.println("\n Task 2 \n");

        int ran1 = (int) ((Math.random() * 101) - 50), ran2 = (int) ((Math.random() * 101) - 50),
                ran3 = (int) ((Math.random() * 101) - 50), ran4 = (int) ((Math.random() * 101) - 50),
                ran5 = (int) ((Math.random() * 101) - 50), ran6 = (int) ((Math.random() * 101) - 50),
                ran7 = (int) ((Math.random() * 101) - 50), ran8 = (int) ((Math.random() * 101) - 50);

        int max =  Math.max((Math.max((Math.max(ran1, ran2)), (Math.max(ran3, ran4)))),
                (Math.max((Math.max(ran5, ran6)), (Math.max(ran7, ran8)))));
        int min =  Math.min((Math.min((Math.min(ran1, ran2)), (Math.min(ran3, ran4)))),
                (Math.min((Math.min(ran5, ran6)), (Math.min(ran7, ran8)))));

        System.out.println("\nNumber 1 = " + ran1 + "\nNumber 2 = " + ran2 + "\nNumber 3 = " + ran3 +
                "\nNumber 4 = " + ran4 + "\nNumber 5 = " + ran5 + "\nNumber 6 = " + ran6 +
                "\nNumber 7 = " + ran7 + "\nNumber 8 = " + ran8 + "\nGreatest number is = " + max +
        "\nSmallest number is " + min + "\nAverage of 8 numbers is = " + ((ran1 + ran2 + ran3 + ran4 +
                ran5 + ran6 + ran7 + ran8) / 8) + "\nAbsolute difference between smallest and greatest is = " +
                (Math.abs(max - min)));

        if(ran3 > 0) System.out.println("3rd number is positive = true");
         else System.out.println("3rd number is negative = false");

         if(ran5 < 0) System.out.println("5th number is negative = true");
         else System.out.println("5th number is negative = false");

         if(ran1 == 0 || ran2 ==0){
             System.out.println("There is at least one zero among those numbers is = true");
         } else if (ran3 == 0 || ran4 == 0){
             System.out.println("There is at least one zero among those numbers is = true");
         }else if (ran5 == 0 || ran6 == 0){
             System.out.println("There is at least one zero among those numbers is = true");
         }else if (ran7 == 0 || ran8 == 0){
             System.out.println("There is at least one zero among those numbers is = true");
         }else {
             System.out.println("There is at least one zero among those numbers is = false");
         }



         /////////////////////////////////

        System.out.println("\n Task 3 \n");

        Scanner number = new Scanner(System.in);
        System.out.println("Please print out 7 numbers between 0 and 50 (both numbers included).");

        int first = number.nextInt(), second = number.nextInt(), third = number.nextInt(),
                fourth = number.nextInt(), fifth = number.nextInt(), sixth = number.nextInt(),
                seventh = number.nextInt();

        int minNumber = Math.min((Math.min((Math.min(first, second)), (Math.min(third, fourth)))),
                (Math.min((Math.min(fifth, sixth)), seventh)));
        int maxNumber = Math.max((Math.max((Math.max(first, second)), (Math.max(third, fourth)))),
                (Math.max((Math.max(fifth, sixth)), seventh)));

        System.out.println("\nNumber 1 = " + first + "\nNumber 2 = " + second + "\nNumber 3 = " + third +
                "\nNumber 4 = " + fourth + "\nNumber 5 = " + fifth + "\nNumber 6 = " + sixth + "\nNumber 7 = " +
                seventh + "\nGreatest number is = " + maxNumber + "\nSmallest number is = " + minNumber +
                "\nAverage of 7 numbers is = " + ((first + second + third + fourth + fifth + sixth + seventh)/7) );

        if(first >= 10) System.out.println("First number is greater than or equal to 10 = true");
            else System.out.println("First number is greater than or equal to 10 = false");


        if(seventh <= 40) System.out.println("Last number is less than or equal to 40 = true");
        else System.out.println("Last number is less than or equal to 40 = false");


        if(first > 25 && seventh > 25) System.out.println("Both first and last numbers are greater than 25 = True");
        else System.out.println("Both first and last numbers are greater than 25 = False");


        if(first == 0 || first == 50) System.out.println("At least one of those numbers is 0 or 50  = true");
        else if (second == 0 || second == 50) System.out.println("At least one of those numbers is 0 or 50  = true");
        else if (third == 0 || third == 50) System.out.println("At least one of those numbers is 0 or 50  = true");
        else if (fourth == 0 || fourth == 50) System.out.println("At least one of those numbers is 0 or 50  = true");
        else if (fifth == 0 || fifth == 50) System.out.println("At least one of those numbers is 0 or 50  = true");
        else if (sixth == 0 || sixth == 50) System.out.println("At least one of those numbers is 0 or 50  = true");
        else if (seventh == 0 || seventh == 50) System.out.println("At least one of those numbers is 0 or 50  = true");
        else System.out.println("At least one of those numbers is 0 or 50  = false");

        if(first >= 40 && first <= 50) System.out.println("There is no number between 40 and 50 = false");
        else if(second >= 40 && second <= 50) System.out.println("There is no number between 40 and 50 = false");
        else if(third >= 40 && third <= 50) System.out.println("There is no number between 40 and 50 = false");
        else if(fourth >= 40 && fourth <= 50) System.out.println("There is no number between 40 and 50 = false");
        else if(fifth >= 40 && fifth <= 50) System.out.println("There is no number between 40 and 50 = false");
        else if(sixth >= 40 && sixth <= 50) System.out.println("There is no number between 40 and 50 = false");
        else if(seventh >= 40 && seventh <= 50) System.out.println("There is no number between 40 and 50 = false");
        else System.out.println("There is no number between 40 and 50 = True");



        /////////////////////////////////

        System.out.println("\n Task 4 \n");

        int random0To1001 = (int) (Math.random() * 101), random0To1002 = (int) (Math.random() * 101),
                random0To1003 = (int) (Math.random() * 101);


        System.out.println(random0To1001 + "\n" + random0To1002 + "\n" + random0To1003);
        // printed out random numbers to make sure the code works

        if((random0To1001 > 25 && random0To1002 > 25) && (random0To1003 > 25))
        System.out.println("true");

        if(random0To1001 <= 25) { System.out.println("false");}
        else if(random0To1002 <= 25) { System.out.println("false");}
        else if(random0To1003 <= 25) {System.out.println("false");}


        /////////////////////////////////

        System.out.println("\n Task 5 \n");

        System.out.println("Please enter a number between 1 and 7 (both numbers included)");

        int day = number.nextInt();
        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
            case 7:
                System.out.println("SUNDAY");
                break;
        }

        /////////////////////////////////

        System.out.println("\n Task 6 \n");

        System.out.println("Please enter a number between -10 and 10 (both numbers included)");

        int enteredNumber = number.nextInt();
        if(enteredNumber > 0)
            System.out.println("\n\"Number entered is \nPOSITIVE\"");
        else if(enteredNumber == 0)
            System.out.println("\n\"Number entered is \nZERO\"");
         else  System.out.println("\n\"Number entered is \nNEGATIVE\"");

         if(enteredNumber % 2 == 0) System.out.println("\n\"Number entered is \nEVEN\"");
         else System.out.println("\n\"Number entered is \nODD\"");



        /////////////////////////////////

        System.out.println("\n Task 7 \n");


        System.out.println("Tell me your exam results?");

        int resul1 = number.nextInt(), resul2 = number.nextInt(), resul3 = number.nextInt();

        if(((resul1 + resul2 + resul3) / 3) >= 70) System.out.println("YOU PASSED!");
        else System.out.println("YOU FAILED!");


        /////////////////////////////////

        System.out.println("\n Task 8 \n");

        System.out.println("Please enter 3 numbers.");

        int input1 = number.nextInt(), input2 = number.nextInt(), input3 = number.nextInt();

        if(input1 == input2 && input1 == input3) System.out.println("TRIPLE MATCH");
        else if(input1 == input2 || input1 == input3) System.out.println("DOUBLE MATCH");
        else System.out.println("NO MATCH");
    }
}

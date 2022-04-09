package homeworks;

import utilities.RandomNumberGenerator;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("_______Task1_______");
        /*
         * PSEUDOCODE
         * 1)print out numbers from 1 to 10 (both included)
         * 2)if number is dividable by 10 print "FooBar"
         * 3) "foo" for numbers dividable by 2
         * 4) "Bar" dividable by 5
         * 5) decrement; 6) fori loop
         * */

        for (int i = 1; i < 11; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }


        /////////////////////////////////////////////

        System.out.println("\n\n_______Task2_______");

        /*
         * PSEUDOCODE
         * 1) we are given an int Array
         * 2) find first positive number
         * 3) find first negative number
         * 4) increment 5)create 2 booleans
         */

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        boolean isNegative = false;
        boolean isPositive = false;

        for (int number : numbers) {
            if (number > 0 && !isPositive) {
                isPositive = true;
                System.out.println("first positive number is = " + number);

            } else if (number < 0 && !isNegative) {
                isNegative = true;
                System.out.println("first negative number is = " + number);
            }
            if (isPositive && isNegative) break;
        }
        if (!isPositive) System.out.println("There is no positive numbers in this Array");
        if (!isNegative) System.out.println("There is no negative numbers in this Array");


        /////////////////////////////////////////////

        System.out.println("\n\n_______Task3_______");

        /*
        * PSEUDOCODE
        * 1)generate 5 random numbers between 1 and 10 (both included)
        * 2)Create an int[] array and store random numbers int it
        * 3)if array contains 2 or 3 return true
        * 4) return false if it doesn't
        * 5) increment  6) boolean*/

        int[] numbers3 = new int[5];
       // for(int i = 0; i < numbers.length; i++){
       //     numbers3[i] = RandomNumberGenerator.getRandomNumber(1, 10);
       // }

        numbers3[0] = RandomNumberGenerator.getRandomNumber(1, 10);
        numbers3[1] = RandomNumberGenerator.getRandomNumber(1, 10);
        numbers3[2] = RandomNumberGenerator.getRandomNumber(1, 10);
        numbers3[3] = RandomNumberGenerator.getRandomNumber(1, 10);
        numbers3[4] = RandomNumberGenerator.getRandomNumber(1, 10);

        System.out.println(Arrays.toString(numbers3));

        boolean has2or3 = false;

        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] == 2 || numbers3[i] == 3) has2or3 = true;

        }
        System.out.println("The Array contains 2 or 3 is = " + has2or3);


        /////////////////////////////////////////////

        System.out.println("\n\n_______Task4_______");

        /*
         * PSEUDOCODE
         * 1)we are given any String[] array
         * 2) check if it contains "apple" as an element(ignoreCase)
         * 3) increment 4)boolean 5) forEach loop*/

        String[] str = {"  ", "  ", "  ", "  "};
        System.out.println(Arrays.toString(str));
        boolean isApple = false;

        for (String s : str) {
            if (s.equalsIgnoreCase("apple")) isApple = true;
        }
        System.out.println(isApple);



        /////////////////////////////////////////////

        System.out.println("\n\n_______Task5_______");

        /*
         * PSEUDOCODE
         * 1)we are given 2 int[] arrays
         * 2) find all matching element between 2 arrays
         * 3) increment 4)boolean 5) nested forEach loop*/

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};


        for (int n : numbers1) {
            for (int nu : numbers2) {
                if (n == nu)
                    System.out.println(n);
                //else if(n != nu) System.out.println("There is no matching elements");
            }
        }

        // it prints out the matching numbers, but I'm not sure where to put the condition
        // where it doesn't have any match


        /////////////////////////////////////////////

        System.out.println("\n\n_______Task6_______");

        /*
        * Pseudocode
        * 1) we are given any String
        * 2) print out duplicated characters in a string
        * 3) nested loops? 4) increment*/

        String str1 = "baNanA";
        char[] chars = str1.toCharArray();

        for(int i = 0; i < chars.length; i++){
            for(int p = 1; p < str1.length() - 1 ; i++){
                if(chars[i] == chars[p]) System.out.println(chars[i]);
            }
        } //??

        






 }
}

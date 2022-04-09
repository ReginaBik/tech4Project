package homeworks;

import java.util.Arrays;
import java.util.Locale;

public class Homework12 {
    public static void main(String[] args) {

        System.out.println("Task 1");

        /*Pseudocode
         *1)Create an int array having size of 10
         *2) Assign values to certain elements
         * 3)print out certain elements and then a whole Array
         * */


        int[] numbers = new int[10];

        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);

        System.out.println(Arrays.toString(numbers));


        System.out.println("\n\nTask 2");

        /*Pseudocode
         *1)Create a String array having size of 5
         *2) Assign values to certain elements
         * 3)print out certain elements and then a whole Array
         * */


        String[] task2 = new String[5];

        task2[1] = "abc";
        task2[4] = "xyz";

        System.out.println(task2[3]);
        System.out.println(task2[0]);
        System.out.println(task2[4]);

        System.out.println(Arrays.toString(task2));


        System.out.println("\n\nTask 3");

        /*Pseudocode
         *1)Create an int array with given elements
         *2) Print Array
         *3)sort and print the Array in ascending order
         * */


        int[] task3 = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(task3));

        Arrays.sort(task3);
        System.out.println(Arrays.toString(task3));


        System.out.println("\n\nTask 4");

        /*
         * Pseudocode
         * 1)Create String Array with given countries
         * 2)Print out the Array
         * 3) sort and print out the Array in lexicographical order */


        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


        System.out.println("\n\nTask 5 ____ForEachLoop");

        /*
         * PSEUDOCODE
         * 1) create String Array with cartoon dogs
         * 2) Print given Array
         * 3)Check if the Array contains "Pluto" and print out True or false*/


        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparkly"};

        System.out.println(Arrays.toString(cartoonDogs));

        boolean isPluto = false;

        for (String dog : cartoonDogs) {
            if (dog.equalsIgnoreCase("Pluto"))
                isPluto = true;
        }
        System.out.println(isPluto);

        System.out.println("\n\nTask 5 ____binarySearch()");

        Arrays.sort(cartoonDogs);

        System.out.println(Arrays.binarySearch(cartoonDogs, "Pluto") >= 0);


        System.out.println("\n\nTask 6____ForEachLoop");

        /*
         * PSEUDOCODE
         * 1) create String Array with cartoon cats
         * 2) Sort Array and print it out
         * 3)Check if the Array contains "Garfield" and "Felix"  and print out True or false*/


        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));

        boolean containsGarfield = false;
        boolean containsFelix = false;

        for (String cat : cartoonCats) {
            if (cat.equalsIgnoreCase("Garfield")) containsGarfield = true;
           else if (cat.equalsIgnoreCase("Felix")) containsFelix = true;
        }
        System.out.println(containsGarfield && containsFelix);

        System.out.println("\n\nTask 6____binarySearch()");

        //Array is already sorted

        System.out.println(Arrays.binarySearch(cartoonCats, "Garfield") >= 0 &&
                Arrays.binarySearch(cartoonCats, "Felix") >= 0);


        System.out.println("\n\nTask 7");

        /*
         * PSEUDOCODE
         * 1)Create double Array with given numbers
         * 2)Print the Array
         * 3) Print each element separately*/

        double[] doubles = {10.5, 20.75, 70, 80, 15.75};

        System.out.println(Arrays.toString(doubles));

        for (double doub : doubles) {
            System.out.println(doub);
        }


        System.out.println("\n\nTask 8");

        /*
         * PSEUDOCODE
         * 1) create char Array
         * 2) -Print the entire array
         * 3)total count of the letters,lowercase letters, uppercase letters, count of digits, special characters
         * 4) incremental 5) we create 5 containers for loop*/

        char[] chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        System.out.println(Arrays.toString(chars));

        int countLetters = 0;
        int countLower = 0;
        int countUpper = 0;
        int countDigits = 0;
        int countSpecials = 0;

        for (char cha : chars) {
            if (Character.isLetter(cha)) {
                countLetters++;
                if (Character.isUpperCase(cha))
                    countUpper++;
                else if (Character.isLowerCase(cha))
                    countLower++;
            } else if (Character.isDigit(cha)) {
                countDigits++;
            } else countSpecials++;

        }
        System.out.println("Letters = " + countLetters);
        System.out.println("Uppercase letters = " + countUpper);
        System.out.println("Lowercase letters = " + countLower);
        System.out.println("Digits = " + countDigits);
        System.out.println("Special characters = " + countSpecials);


        System.out.println("\n\nTask 9");

        /*
         * PSEUDOCODE
         * 1) create String Array
         * 2)total count of the lowercase letters, uppercase letters
         * 3) Check if elements start with certain characters
         * 4)check if elements has "book" or "pen" (ignore cases)
         * 5) incremental 6) we create 4 containers for loop*/

        String[] items = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        System.out.println(Arrays.toString(items));

        int upperC = 0;
        int lowerC = 0;
        int startWith = 0;
        int includes = 0;

        for (String item : items) {
            if (Character.isUpperCase(item.charAt(0))) {
                upperC++;
            } else lowerC++;
            if (item.startsWith("b") || item.startsWith("p") || item.startsWith("B") || item.startsWith("P"))
                startWith++;
            if (item.toLowerCase().contains("book") || item.toLowerCase().contains("pen"))
                includes++;
        }

        System.out.println("Elements starts with Uppercase = " + upperC);
        System.out.println("Elements starts with Lowercase = " + lowerC);
        System.out.println("Elements starting with B or P = " + startWith);
        System.out.println("Elements having ”book” or “pen”= " + includes);


        System.out.println("\n\nTask 10");


        /*
         * PSEUDOCODE
         * 1) create int Array
         * 2)print out the entire Array
         * 3) Check how many elements are more than 10, less than 10 and 0
         * 4) incremental 5) we create 2 containers for loop*/

        int[] numbersTask10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        System.out.println(Arrays.toString(numbersTask10));

        int countMoreThan = 0;
        int countLessThan = 0;


        for (int numberX : numbersTask10) {
            if (numberX > 10) countMoreThan++;
            else if (numberX < 10) countLessThan++;
        }

        System.out.println("Elements that are more than 10 = " + countMoreThan);
        System.out.println("Elements that are less than 10 = " + countLessThan);
        System.out.println("Elements that are 10 = " + (numbersTask10.length - countMoreThan - countLessThan));


        System.out.println("\n\nTask 11");


        /*
         * PSEUDOCODE
         * 1) create 2 int Arrays with given numbers
         * 2) Print both arrays
         * 3)create a new array called that will take greatest of same index from first 2 arrays
         * 4)Print third array as well
         * 5) incremental */

        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0};

        System.out.println("First Array is = " + Arrays.toString(first));
        System.out.println("Second Array is = " + Arrays.toString(second));

        int[] third = new int[5];

        for (int i = 0; i < 5; i++) {
            third[i] = Math.max(first[i], second[i]);
        }
        System.out.println("Third array is = " + Arrays.toString(third));

    }

}

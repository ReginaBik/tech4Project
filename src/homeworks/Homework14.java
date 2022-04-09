package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("______________________Task 1______________________");

        /*
        * PSEUDOCODE
        * 1) check given int array
        * 2) return first duplicate from the array
        * 3) if there is no duplicate print out the message "There is no duplicate
        * 4) nested fori loops 5)  both loops are increment 6) container for boolean*/


        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        boolean isFirstDuplicate = false;


        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    isFirstDuplicate = true;
                    break;
                }
            }
            if (isFirstDuplicate) break;
        }
        if (!isFirstDuplicate) System.out.println("There is no duplicates");



        System.out.println("\n\n______________________Task 2______________________");

        /*
        * PSEUDOCODE
        ** 1) check given String array
         * 2) return first duplicate from the array
         * 3) if there is no duplicate print out the message "There is no duplicate"
         * 4) nested fori loops 5)  both loops are increment 6) container for boolean */

        String[] words = {"Z", "abc", "z", "123", "#" };
        boolean isDuplicate1 = false;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[i]);
                    isDuplicate1 = true;
                    break;
                }
            }
            if (isDuplicate1) break;
        }
        if (!isDuplicate1) System.out.println("There is no duplicates");



        System.out.println("\n\n______________________Task 3______________________");

        /*
         * PSEUDOCODE
         ** 1) check given int array
         * 2) return all duplicates from the array
         * 3) if there is no duplicate print out the message "There is no duplicate"
         * 4) nested fori loops 5)  both loops are increment 6) container for duplicates */

        int[] numbersTask3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        String duplicates = "";

        for (int i = 0; i < numbersTask3.length - 1; i++) {
            for (int j = i + 1; j < numbersTask3.length; j++) {
                if (numbersTask3[i] == numbersTask3[j] && !duplicates.contains(numbersTask3[i] + ""))
                    duplicates += numbersTask3[j] + "\n";
            }
        }
        if (duplicates.isEmpty()) System.out.println("There is no duplicates");
        else System.out.println(duplicates);



        System.out.println("\n\n______________________Task 4______________________");
        /*
         * PSEUDOCODE
         ** 1) check given String array
         * 2) return all duplicates from the array
         * 3) if there is no duplicate print out the message "There is no duplicate"
         * 4) nested fori loops 5)  both loops are increment 6) container for duplicates */

        String[] wordsTask4 = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
        String dupes = "";

        for (int i = 0; i < wordsTask4.length - 1; i++) {
            for (int j = i + 1; j < wordsTask4.length; j++) {
                if (wordsTask4[i].equalsIgnoreCase(wordsTask4[j]) &&
                        !dupes.equalsIgnoreCase(wordsTask4[i] + ""))
                    dupes += wordsTask4[j] + "\n";
            }
        }

        if (dupes.isEmpty()) System.out.println("There is no duplicates");
        else System.out.println(dupes);

        //This program prints out more than expected output



        System.out.println("\n\n______________________Task 5______________________");

        /*
        * Pseudocode
        * 1) write a dynamic program to reverse elements in an array
        * 2) the code should be dynamic
        * 3) Used collections.reverse()
        **/

        String[] wordsTask5 = {"abc", "foo", "bar"};

        List<String> converted = Arrays.asList(wordsTask5);

        Collections.reverse(converted);
        System.out.println(converted);


        System.out.println("\n\n______________________Task 6______________________");

        /*
        * Pseudocode
        * 1) reverse each word in a given String
        * 2) make code Dynamic
        * 3) create String container for reverse
        * 4) Create String array using split() method
        * 5) decrement  */

        // I need more practice with Arrays and Arraylists, this task was difficult for me.
        // //Will watch lessons with it again.

        String str = "Today is a fun day";
        String[] wordsTask6 = str.split(" ");
        String reversedString = "";

        for (String word : wordsTask6) {
            String reverseWord = "";
            for (int i = word.length()-1; i >= 0; i--) {
                reverseWord += word.charAt(i);
            }
            reversedString += reverseWord + " ";
        }
        System.out.println(reversedString);





  }
}

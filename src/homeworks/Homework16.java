package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Homework16 {

    //Task 1
    /*
    * Pseudocode
    * 1)Write a method countWords()
    * 2) Takes String as an argument
    * 3) Returns int (How many words in a String)
    * 4) Counter container for words
    * 5) forI loop
    * 6)increment*/

    public static int countWords(String str){
        int words = 0;
        String newStr = str.trim();
        for(int i = 0; i < newStr.length(); i++){
            if(Character.isWhitespace(newStr.charAt(i))) words++;
        }

        return words + 1;
    }


    //Task 2
    /*
     * Pseudocode
     * 1) write a method countA
     * 2) takes a String as an argument
     * 3) returns an int (so we create an int container)
     * 4) forI loop
     * 5) increment*/

    public static int countA(String str){
        int aIntStr = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.toLowerCase().charAt(i) == 'a') aIntStr++;
        }
        return aIntStr;
    }



    //Task 3
    /*
     * Pseudocode
     * 1) write a method countPos()
     * 2) takes ArrayList of Integer as an argument
     * 3) returns int (so we need to create a container to count Pos)
     * 4) forEach loop */

    public static int countPos(ArrayList<Integer> numbers){
        int howManyPos = 0;
        for(Integer num : numbers){
            if(num > 0) howManyPos++;
        }
        return howManyPos;
    }

    //Task 4
    /*
     * Pseudocode
     * 1) create a method removeDuplicateNumbers()
     * 2) takes an ArrayList as an argument
     * 3) returns ArrayList without duplicates (so container will be a new ArrayList)
     * 4) forEach loop
     * */

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> noDupes = new ArrayList<>();
        for (Integer element : numbers) {
            if (!(noDupes.contains(element))) noDupes.add(element);
        }
        return noDupes;
    }

    //Task 5
    /*
     * Pseudocode
     * 1) Write a method removeDuplicateElements()
     * 2) Takes an ArrayList of String
     * 3) Returns an ArrayList of String without duplicated elements (so we create a container for it)
     * 4) For each loop to check if the elements are duplicated */

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> objects){
        ArrayList<String> noDupesArray = new ArrayList<>();
        for(String object : objects){
            if(!noDupesArray.contains(object)) noDupesArray.add(object);
        }
        return noDupesArray;
    }

    //Task 6
    /*
     * Pseudocode
     * 1) write a method removeExtraSpaces()
     * 2) Takes a String as an argument
     * 3) Returns a new String with removed extra spaces
     */

    //Task 7
    /*
     * Pseudocode
     * 1) write a method add()
     * 2) takes 2 int Arrays as an argument
     * 3) returns a sum of given arrays elements
     * 4) 2 forEach loops
     * 5) container for a new int Array*/

   /* public static int[] add(int[] array1, int[] array2){
        int[] arrayAdd = new
    }*/

    //Task 8
    /*
     * Pseudocode*/

    public static void main(String[] args) {

        //Task1
        String str1 ="Selenium is the most common UI automation tool.    ";
        System.out.println(Homework16.countWords(str1));

        //Task2
        String str2 = "QA stands for Quality Assurance";
        System.out.println(Homework16.countA(str2));

        //Task3
        Integer[] numbersTask3 = {-23, -4, 0, 2, 5, 90, 123};
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(numbersTask3));

        System.out.println(Homework16.countPos(numbers3));

        //Task4
        Integer[] numTask4 = {10, 20, 35, 20, 35, 60, 70, 60};
        ArrayList<Integer> numbersTask4 = new ArrayList<>(Arrays.asList(numTask4));

        System.out.println(Homework16.removeDuplicateNumbers(numbersTask4));

        //Task5
        String[] task5 = {"Java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"};
        ArrayList<String> arrayTask5 = new ArrayList<>(Arrays.asList(task5));

        System.out.println(Homework16.removeDuplicateElements(arrayTask5));


    }


}


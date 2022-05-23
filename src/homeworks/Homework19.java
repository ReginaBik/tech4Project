package homeworks;

import java.util.Arrays;

public class Homework19 {

        /*Requirement:
    -Create a method called noDigit()
    -This method will take one String argument and it will
    return a new String with all digits removed from the
    ”        _______Task 1________*/

    public static String noDigit(String str){

        return str.replaceAll("[0-9]", "");
    }
    /*_______Task 1.1________ */
/*
    public static String withoutDigits(String str) {
        String noDigString = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= 48) && !(str.charAt(i) <= 57)) noDigString = noDigString + str.charAt(i);
        }
        return noDigString;
    }*/

       /* -Create a method called noVowel()
    -This method will take one String argument and it will
    return a new String with all vowels removed from the
        original String
        _______Task 2________ */

    public static String noVowel(String str){
        return str.toLowerCase().replaceAll("[aeouiy]", "");
    }

        /* -Create a method called sumOfDigits()
        -This method will take one String argument and it will return an int sum
        of all digits from the original String.
          _______Task 3________ */

    public static int sumOfDigits(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))) sum += Integer.parseInt("" + str.charAt(i));
        }
        return sum;
    }

        /*-Create a method called hasUpperCase()
    -This method will take one String argument and it will return boolean
    true if there is an uppercase letter and false otherwise.
    _______Task 4________ */

    public static boolean hasUpperCase(String str){
        boolean hasUpper = false;
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))) hasUpper = true;
        }
        return hasUpper;
    }

   /*-Create a method called middleInt()
     -This method will take three int arguments and it will return the middle
     int.
     _______Task 5________ */

    public static int middleInt(int a, int b, int c){
        int middle;
        if (a == b && b == c) return a;
        else if (a == b || a == c) return a;
        else if (b == c) return b;
        else {
            if (a != Math.max(Math.max(a, b),c) && a != Math.min(Math.min(a, b), c)) middle = a;
            else if (b != Math.max(Math.max(a, b),c) && b != Math.min(Math.min(a, b), c)) middle = b;
            else middle = c;
        }
        return middle;
    }

   /* -Create a method called no13()
    -This method will take an int array as argument and it will return a new
    array with all 13 replaced with 0.
     _______Task 6________ */

    public static int[] no13(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }

    /*-Create a method called arrFactorial()
    -This method will take an int array as argument and it will return the
    array with every number replaced with their factorials.
    _______Task 7________  */

    public static int[] arrFactorial(int[] numbers){
        int[] arr = new int[numbers.length];
        int factorial = 1;
        for (int i = 0; i < arr.length; i++) {
            if (numbers[i] == 0 || numbers[i] == 1) arr[i] = 1;
            else{
                for (int j = 1; j <= numbers[i]; j++) {
                    factorial *= j;
                }
                arr[i] = factorial;
                factorial = 1;
            }
        }
        return arr;
    }

   /* -Create a method called categorizeCharacters()
    -This method will take String as an argument and return a String array as
    letters at index of 0, digits at index of 1 and specials at index of 2.
     _______Task 8________  */

    public static String[] categorizeCharacters(String str){
        char[] chars = str.toCharArray();
        String letters = "";
        String digits = "";
        String specials = "";
        for (char c : chars) {
            if (Character.isLetter(c)) letters += c;
            else if (Character.isDigit(c)) digits += c;
            else if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) specials += c;
        }
        String[] categorizedChars = {letters, digits, specials};
        return categorizedChars;
    }




    public static void main(String[] args) {
        System.out.println("Task1\n");
        System.out.println(Homework19.noDigit("hdhhd222"));

        System.out.println("\nTask2\n");
        System.out.println(Homework19.noVowel("afaniusetayusn"));

        System.out.println("\nTask3\n");
        System.out.println(Homework19.sumOfDigits("h2mk2m4"));

        System.out.println("\nTask4\n");
        System.out.println(Homework19.hasUpperCase("kiLot"));

        System.out.println("\nTask5\n");
        System.out.println(Homework19.middleInt(5, 2, 45));

        System.out.println("\nTask6\n");
        System.out.println(Arrays.toString(Homework19.no13(new int[] {13, 13, 13, 13, 13})));

        System.out.println("\nTask7\n");
        System.out.println(Arrays.toString(Homework19.arrFactorial(new int[] {0, 2, 4 , 1})));

        System.out.println("\nTask8\n");
        System.out.println(Arrays.toString(Homework19.categorizeCharacters("“12ab$%3c%”")));



    }

}

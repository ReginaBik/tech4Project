package arrays;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args) {

        System.out.println("\n______________Task 1______________");

        char[] chars = {'#', '$', '5', 'A', 'b', 'H'};

        System.out.println(Arrays.toString(chars));



        System.out.println("\n\n______________Task 2______________");

        System.out.println("The size of the array is = " + chars.length);




        System.out.println("\n\n______________Task 3______________");

        for(int i = 0; i< chars.length; i++){
            System.out.println(chars[i]);
        }



        System.out.println("\n\n______________Task 4______________");

        for(char character: chars){
            System.out.println(character);
        }



        System.out.println("\n\n______________Task 5FORI______________");

     for(int i = 0; i < chars.length; i++){
         if(Character.isLetter(chars[i]))
             System.out.println(chars[i]);
     }


     System.out.println("\n\n______________Task 5 FOREACH______________");
    /* for(char character : chars){
         if(Character.isLetter(character))
     }*/


     System.out.println("\n\n______________Task 6______________");

     int countUpper = 0;

     for(int i = 0; i < chars.length; i++){
         if(Character.isUpperCase(chars[i])){
             countUpper++;
         }

     } System.out.println("There are = " + countUpper + " uppercase letters in this Array");


        System.out.println("\n\n______________Task 6  forEachLoop______________");
        for(char character : chars){
            if(Character.isUpperCase(character))
                countUpper++;
        }
        System.out.println(countUpper);

        System.out.println("\n\n______________Task 7______________");
       /* EXTRA PRACTICES
        Count lowercase letters
        Count digits
        Count spaces
        Count specials*/

        int countLower = 0;
        int countDigits = 0;
        int countSpaces = 0;
        int countSpecials = 0;

        for (char character : chars){
            if(character >= 'a' && character <= 'z')
                countLower++;
            else if ( character >= 48 && character <= 57 )
                countDigits++;
            else if( Character.isSpaceChar(character))
                countSpaces++;
            else if(character >= 33 && character <= 47)
                countSpecials++;
        }

        System.out.println("Lowercase = " + countLower);
        System.out.println("Digits = " + countDigits);
        System.out.println("Spaces = " + countSpaces);
        System.out.println("Specials = " + countSpecials);





    }
}

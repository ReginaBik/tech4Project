package characterClass;

import utilities.CharacterHelper;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {

        char c = 'c';

        boolean b = Character.isDigit(c);
        System.out.println(b);

        System.out.println(Character.isDigit('9'));  //true

        System.out.println(Character.isUpperCase('B'));  //true
        System.out.println(Character.isUpperCase('b'));  //false


        System.out.println(Character.isLowerCase('b'));  //true
        System.out.println(Character.isLowerCase('L'));  //false

        char c2 = '$';
        System.out.println(!Character.isLetterOrDigit(c2) && !Character.isSpaceChar(c2));

        char c3 = 'A';
        System.out.println(CharacterHelper.isVowel(c3));



        ////////////BE CREATIVE///////////////

        String s4 = "AEOUIaeoui";

        System.out.println(s4.contains(c3 + ""));



        char c4 = 'a';
        boolean isc4Vowel = false;

        for (int i = 0; i < s4.length(); i++) {
            if(c4 == s4.charAt(i)){
                isc4Vowel = true;
                break;
            }

        }











    }
}

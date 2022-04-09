package utilities;

public class CharacterHelper {

    //TASK 1

    public static boolean isSpace(char n) {
        return n == ' ';
    }
    //  or return n == 32;

    //TASK 2

    public static boolean isDigit(char t) {
        return t >= 48 && t <= 57;
    }
    // or return: t >= '0' && t <= '9';

    //TASK 3

    public static boolean isUppercase(char t) {
        return t >= 'A' && t <= 'Z' ;
    }
    // or t >= '65' && t <= '90';

    //TASK 4

    public static boolean isLowercase(char t) {
        return t >= 97 && t <= 122;
    }
    // or return t >= 'z' && t <= 'a';


    //TASK 5

    public static boolean isLetter(char t) {
        return isLowercase(t) || isUppercase(t);
    }
    // or return (t >= 'A' && t <= 'Z') || (t >= 'a' && t <= 'z');

    //TASK 6

    public static boolean isVowel(char t) {
        return t == 'A' || t == 'E' || t == 'O' || t == 'U' || t == 'I' ||
                t == 'a' || t == 'e' || t == 'o' || t == 'u' || t == 'i';
    }
    //or  public static boolean isVowel(char t){
    //        return  t == 65 || t == 69 || t == 79 || t == 85 || t == 73 ||
    //                t == 97 || t == 101 || t == 111 || t == 117 || t == 105;
    //    }

    //TASK 7

    public static boolean isConsonant(char t) {
        return isLowercase(t) || isUppercase(t) || !(isVowel(t));
    }

       // return (t <= 'z' && t >= 'a') || (t <= 'Z' && t >= 'A') && (t != 'A' || t != 'E' || t != 'O' || t != 'U' ||
               // t != 'I' || t != 'a' || t != 'e' || t != 'o' || t != 'u' || t != 'i');
}
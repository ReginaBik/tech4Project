package stringMethods;

public class _05_toLowercase_toUppercase {
    public static void main(String[] args) {

        /*
       These methods are used to covert letters of the string to upper case or lower case
       They are non - static methods because we called it with an object of String
       They are return type methods, and they return the modified String object back
       They don't take any argument
        * */


        String s1 = "HELLO world";
        System.out.println(s1);
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        System.out.println("MHTFyhf, hyfYTF  KYUTFFT H<Gjg".toLowerCase());
        System.out.println("MHTFyhf, hyfYTF  KYUTFFT H<Gjg".toUpperCase());

        String sentence = "I paid $100.99 to buy airpods";

        String s2 = sentence.toLowerCase();
        String s3 = sentence.toUpperCase();

    }
}

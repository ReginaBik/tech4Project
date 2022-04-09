package stringMethods;

public class _04_IgnoreCase {
    public static void main(String[] args) {
     /*
        Method Task: It compares 2 strings with each other and tells if they are equal or not
        NOTE: This comparison is case-insensitive
        -It is non-static, and we call it with another String object (we didn't call it with class name)
        -It is a return type and returns a boolean
        -It takes a String as an argument
         */

        ////////////////////////////

        String s1 = "Hello";
        String s2 = "hello";

        System.out.println(s1.equals(s2));                // false
        System.out.println(s1.equalsIgnoreCase(s2));      // true

        String st1 = "Good";
        String st2 = "GOOD";

        boolean b = st1.equalsIgnoreCase(st2); //true
        System.out.println(b);





    }
}

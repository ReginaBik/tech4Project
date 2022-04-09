package stringMethods;

public class _03_Equals {
    public static void main(String[] args) {
        /*
        -Compares 2 Strings and tell if the Strings are equal
        - This comparison is case-sensitive (matters if it is upper or lowercase)
        - It is non- static, and we call it with another String object
        - It is a return type and returns a boolean
        - It takes a String as an argument
          */


        System.out.println("Melda".equals("Melda")); //true
        System.out.println("Melda".equals("melda")); //false

        String name1 = "John";
        String name2 = "James";
        String name3 = "James";
        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));

        String str1 = "Hello";
        String str2 = str1;
        boolean b = !(str1.equals(str2)); //false

        System.out.println(b);



    }
}

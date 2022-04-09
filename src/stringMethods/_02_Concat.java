package stringMethods;

public class _02_Concat {
    public static void main(String[] args) {

        //MAIN METHOD - doesn't belong to any class but JVM itself
        //source code - javac (byte code) - java (binary code)
        //JVM is where our code is actually executed
        //JVM first looks where the main method is
        //after we ind the main method it starts to execute the code from top to bottom and
        //from left to right
        //public: you can call it everywhere
        //static: easy access
        //void: it doesn't return anything
        //It takes a String[] (String array) as an argument

      ////////////////////////////////////////////////////////////

        /*
        Method task: it is used to combine multiple strings to create and form a new one
        - It is non - static, and we can call it with an object
        - It is a return type method, and it returns a new string that is the combination of others
        - It takes a String as an argument
        */

        String s1 = "Tech";  // String object
        String s2 = "Global";  // String object
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s1.concat(s2) + " School");

        System.out.println("Hello".concat(" World!")); // concat method with string
        System.out.println("Hello".concat(" World!".concat(" Hello World!")));
        System.out.println("Hello".concat(" ") + "World");



    }
}

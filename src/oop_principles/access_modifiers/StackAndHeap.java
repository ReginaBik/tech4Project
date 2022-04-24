package oop_principles.access_modifiers;

public class StackAndHeap {
    public static void main(String[] args) {
        String s1 = "Data";
        String s2 = "Data";

        System.out.println(s1 == s2); // that doesn't check the values it is checking the LOCATION
        System.out.println(s1.equals(s2)); // that checks the values (THE CORRECT ONE)

        String s3 = new String("Data");//true
        String s4 = new String("Data");//true

        System.out.println(s3 == s4); // FALSE //BECAUSE IT HAS DIFFERENT LOCATION
        System.out.println(s3.equals(s4)); //true



    }
}

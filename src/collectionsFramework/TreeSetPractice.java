package collectionsFramework;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        TreeSet<String> words = new TreeSet<>();

        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);

        System.out.println(numbers); // IT'S AUTOMATICALLY SORTED

        words.add("John");
        words.add("John");//  this will not be added bacause set don't allow duplications
        words.add("Joe");
        words.add("Alex");
        words.add("ali");

        System.out.println(words);









    }
}

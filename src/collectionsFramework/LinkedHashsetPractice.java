package collectionsFramework;

import java.util.LinkedHashSet;

public class LinkedHashsetPractice {
    public static void main(String[] args) {
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Foo");
        words.add("Bar");
        words.add("foo");
        words.add("bar");
        words.add(null);
        words.add("John");

        System.out.println(words);




    }
}

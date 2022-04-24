package collectionsFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise_02 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);

        TreeSet<Integer> tok = new TreeSet<>(numbers);
        System.out.println((new ArrayList<>(tok)).get(1));
        System.out.println(tok.size()-2);









    }
}

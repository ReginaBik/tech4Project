package collections.linkedLists;

import java.util.LinkedList;

public class ArrayListVersusLinkedList {
    public static void main(String[] args) {
        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);

        System.out.println(numbers);

        for(double d : numbers){
            System.out.println(d);
        }

        System.out.println(numbers.get(0));
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }


        // additional methods
        System.out.println(numbers.peek()); // peek gets the first element (10.5)

        System.out.println(numbers.peekFirst());
        System.out.println(numbers.peekLast()); // 17.7
        System.out.println(numbers);

        System.out.println("____________________________________________");
        System.out.println(numbers.poll()); // poll retrieves(gets) the 1st element and removes it
        System.out.println(numbers.pollFirst());
        System.out.println(numbers.pollLast());
        System.out.println(numbers);

        System.out.println("____________________________________________");

        numbers.push(5.7);
        System.out.println(numbers);

        numbers.push(8.9);
        System.out.println(numbers);

        System.out.println(numbers.pop()); // removes the object from the 0 index
        System.out.println(numbers);













  }
}

package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _01_PracticeCountingArrayListElements {
    public static void main(String[] args) {
        System.out.println("\n________Task1_________");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);
        System.out.println(numbers);

        System.out.println("\n________Task2_________");

        int countOdds = 0;

        for(Integer num : numbers){
            if(num % 2 != 0) countOdds++;
        }
        System.out.println("\nOdds = " + countOdds);

        System.out.println("\n________Task2____FORI_LOOP____");

        countOdds = 0;


        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 != 0) countOdds++;
        }
        System.out.println("\nOdds = " + countOdds);


        System.out.println("________Task3_____extraTask____");

        int evens = 0;
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        int moreThan10 = 0;
        int dividedBy5 = 0;


        System.out.println("\n________Task3_________");

        List<String> colors = new ArrayList<>();

        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");

        System.out.println(colors);

        System.out.println("\n________Task4_________");

        int startWithUpper = 0;

        for(String color : colors){
          if ( Character.isUpperCase(color.charAt(0)) ) startWithUpper++;

        }
        System.out.println("Start with Upper =" + startWithUpper);

        System.out.println("\n________Task_________");






















    }
}

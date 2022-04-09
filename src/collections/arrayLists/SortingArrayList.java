package collections.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingArrayList {

    public static void main(String[] args) {
        int[] numbersArray = {3, 7, 0, 4};

        System.out.println("My Arrays before sort " + numbersArray );

        Arrays.sort(numbersArray);
        System.out.println("My Arrays after sort " + numbersArray );

        //HOW TO SORT AN ARRAY LIST
        System.out.println("________Sorting an array_________");

        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(3);
        numbersList.add(7);
        numbersList.add(0);
        numbersList.add(4);

        System.out.println("My List before sort " + numbersArray);
        Collections.sort(numbersList);
        System.out.println("My List before sort " + numbersArray);



    }
}

package collections;

import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {
      /*  List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Brasilia");
        countries.add("Argentina");
        countries.add("France");
        countries.add("Belgium");
        countries.add("Germany");
        countries.add("Portugal");
        System.out.println(countries);*/

        String[] countries = {"Usa" ,"Brasilia", "Argentina", "France", "Belgium", "Germany", "Portugal"};
        List<String> countries1 = new ArrayList<>( Arrays.asList(countries));
        List<String> countries2 = new LinkedList<>( Arrays.asList(countries));
        System.out.println(countries1);
        System.out.println(countries2);

        List<String> countries3 = new ArrayList<>();
        List<String> countries4 = new LinkedList<>();

        Collections.addAll(countries3, countries);
        Collections.addAll(countries4, countries);


        int[] numbers = {1, 2, 3, 4, 5};

        List<Integer> numbersList = new ArrayList<>(); // it will only not work with int// but if it is Integer it works

        for(int i : numbers){
            numbersList.add(i);
        }
        System.out.println(numbersList);








    }
}

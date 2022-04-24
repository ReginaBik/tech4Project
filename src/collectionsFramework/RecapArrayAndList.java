package collectionsFramework;

import java.util.*;

public class RecapArrayAndList {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 7, 9, 10};
        System.out.println(Arrays.toString(numbers));


        String[] city =  {"Tokyo", "Berlin", "Oslo", "Denver", null, null};

        System.out.println(Arrays.toString(city));

        ArrayList<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, city);
        cities2.add("Tokyo");
        System.out.println(cities2);
        System.out.println(cities2.get(3));
        List<String> names2 = new ArrayList<>();
        Collection<String> names3 = new ArrayList<>();
        Iterable<String> names4 = new ArrayList<>();
        Object names5 = new ArrayList<>();
        Cloneable names6 = new ArrayList<>();

        Vector<String> names = new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");

        System.out.println(names.size());
        names.forEach(System.out::println);
        System.out.println("Name at index of 5 = " + names.get(5));

        LinkedList<String> objects1 = new LinkedList<>();
        List<String> objects2 = new LinkedList<>();
        objects1.add("Phone");
        objects1.add("Computer");
        objects1.add("Airpods");
        objects1.add("Screen");
        objects1.add("Screen");
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);

        System.out.println(objects1.getClass());
        System.out.println(objects1);
        System.out.println(objects1.get(2));
        System.out.println(objects1.stream().filter(Objects::isNull).count());








    }
}

package collectionsFramework;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Ukraine", "Kiev");
        capitals.put("Spain", "Madrid");
        capitals.put("Portugal", "Lisbon");
        capitals.put("Italy", "Roma");
        capitals.put("US", "DC");
        capitals.put("Canada", "Ottawa");

        System.out.println(capitals);
        System.out.println(capitals.get("Spain")); //we called key and got the value (Madrid)
        System.out.println(capitals.get("Madrid"));//we called the value and got the null



        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Alona");
        students.put(2, "Abdullah");
        students.put(3, "Abdullah");
        students.put(4, "Data");
        students.put(5, "null");
        students.put(6, "null");




        System.out.println(students.size());
        System.out.println(students);
        System.out.println(students.get("Abdullah")); //null
        System.out.println(students.get(3)); //Abdullah







    }
}

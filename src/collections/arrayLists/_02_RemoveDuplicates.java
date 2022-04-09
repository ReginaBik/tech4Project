package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _02_RemoveDuplicates {
    public static void main(String[] args) {

        List<String> objects = new ArrayList<>();
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pen");
        objects.add("Cup");
        objects.add("Book");
        objects.add("Book");
        objects.add("Pencil");


        List<String> uniques = new ArrayList<>();
        for(String ob : objects){
            if(!uniques.contains(ob)){
                uniques.add(ob);
            }
        }
        System.out.println(uniques);

        System.out.println("_________nextTask___________");








        }
    }


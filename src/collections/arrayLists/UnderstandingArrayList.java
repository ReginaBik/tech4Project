package collections.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class UnderstandingArrayList {
    public static void main(String[] args) {
        //Declaring an array versus arrayList

        String[] names = new String[5];

        ArrayList<String> namesList = new ArrayList<>(); //or new ArrayList<String>();

        //How to print the size of Array versus ArrayList

        System.out.println("Size of the Array = " + names.length);
        System.out.println("Size of the ArrayList = " + namesList.size());

        //SYNTAX
        //ArrayList<dataType> variableName = new ArrayList<>();

        //SIZE OF ARRAY
        //int sizeOfTheArrayList = variableName.size();

        //How to add elements in Array versus ArrayList
        names[0] = "Abe";
        names[1] = "Data";
        // names[7] = "John"; //outofboundexception

        namesList.add("Abe");
        namesList.add(1, "Data"); // add abject to a specific index
        namesList.add(1, "John");
        namesList.add("Alona"); //(abe, john, data, alona) alona goes at the back of arrayList
        namesList.add("Max"); //(abe, john, data, alona, Max)
        namesList.add(0, "James"); // (James, abe, john, data, alona, Max) // goes on 0

        /*!!!!!*/
        namesList.set(2, "Lionel"); // "data" index 2 was REPLACED by lionel
        /*!!!!!*/

        // how to print Array vs ArrayList

        System.out.println(Arrays.toString(names));

        System.out.println(namesList);

        namesList.add("Andrei");
        System.out.println(namesList);

        namesList.add(5, "Taylor"); //(James, abe, john, Lionel, alona, Taylor,  Max, Andrei)
        namesList.set(3, "Daria");
        System.out.println(namesList); //(James, abe, john, Daria, alona, Taylor,  Max, Andrei)

        namesList.add("Regina");
        namesList.add("Regina");
        namesList.add(null);

        System.out.println(namesList);
        System.out.println(namesList.size());

        //namesList.remove(7); this will remove element at index of 7
        //namesList.remove("James") this will remove Jam

        namesList.remove(0); //James
        System.out.println(namesList);

        namesList.remove(2);
        System.out.println(namesList);

        namesList.remove("max"); // false bacause it is case sensitive but not indexOutOfBound

        namesList.get(3); //returns String;

        namesList.indexOf("Regina"); // 0
        namesList.lastIndexOf("Regina"); // 0

        namesList.contains("Max");//true
        namesList.contains("max");//false

        namesList.removeAll(namesList);
        System.out.println(namesList);
        namesList.clear();


 }
}

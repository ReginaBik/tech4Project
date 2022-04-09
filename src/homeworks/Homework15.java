package homeworks;

import java.util.*;

public class Homework15 {
    public static void main(String[] args) {

        System.out.println("____________Task1_____________");

        /*
         * Pseudocode
         * 1) create int ArrayList
         * 2)print out element of given indexes
         * 3)print out arrayList*/


        List<Integer> numbers1 = new ArrayList<>();

        numbers1.add(10);
        numbers1.add(23);
        numbers1.add(67);
        numbers1.add(23);
        numbers1.add(78);

        System.out.println(numbers1.get(3));
        System.out.println(numbers1.get(0));
        System.out.println(numbers1.get(2));
        System.out.println(numbers1);


        System.out.println("\n\n____________Task2_____________");

        /*
         * Pseudocode
         * 1) create String ArrayList
         * 2)print out element of given indexes
         * 3)print out arrayList*/


        String[] colors2 = {"Blue", "Brown", "Red", "White", "Black", "Puple"};

        List<String> colorsTask2 = new ArrayList<>(Arrays.asList(colors2));


        System.out.println(colorsTask2.get(1));
        System.out.println(colorsTask2.get(3));
        System.out.println(colorsTask2.get(5));
        System.out.println(colorsTask2);


        System.out.println("\n\n____________Task3_____________");

        /*
         * Pseudocode
         * 1) create int ArrayList
         * 2)print out arrayList
         * 3)print out sorted arrayList*/


        Integer[] numbersTask3 = {23, -34, -56, 10, 0, 89, 100};
        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(numbersTask3));

        System.out.println(numbers3);

        Collections.sort(numbers3);
        System.out.println(numbers3);


        System.out.println("\n\n____________Task4_____________");

        /*
         * Pseudocode
         * 1) create String ArrayList
         * 2)print out arrayList
         * 3)print out sorted arrayList*/


        String[] citiesTask4 = {"Istanbul", "Berlin", "Madrid", "Paris"};

        List<String> cities4 = new ArrayList<>(Arrays.asList(citiesTask4));

        System.out.println(cities4);

        Collections.sort(cities4);
        System.out.println(cities4);


        System.out.println("\n\n____________Task5_____________");

        /*
         * Pseudocode
         * 1) create String ArrayList
         * 2)print out arrayList
         * 3)find out if there is "Wolverine" in arrayList
         * 4)forEach loop*/


        String[] marvelTask5 = {"Spider Man", "Iron Man", "Black Panther", "Deadpool", "Captain America"};

        List<String> marvel = new ArrayList<>(Arrays.asList(marvelTask5));
        System.out.println(marvel);
        boolean isWolverine = false;

        for (String mar : marvel) {
            if (mar.equals("Wolverine")) isWolverine = true;
        }
        System.out.println(isWolverine);


        System.out.println("\n\n____________Task6_____________");

        /*
         * Pseudocode
         * 1) create String ArrayList
         * 2)print out sorted arrayList
         * 3)find out if there is "Hulk" and "Iron Man" in arrayList
         */


        String[] avengersTask6 = {"Hulk", "Black Widow", "Captain America", "Iron Man",};


        List<String> avengers = new ArrayList<>(Arrays.asList(avengersTask6));
        Collections.sort(avengers);
        System.out.println(avengers);
        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));


        System.out.println("\n\n____________Task7_____________");

        /*
         * Pseudocode
         * 1) create Character ArrayList
         * 2)print out arrayList
         * 3)print out every element of ArrayList line by line
         * 4)forEach loop*/

        Character[] characters = {'A', 'x', '$', '%', '9', '*', '+', 'F', 'G'};
        List<Character> chars = new ArrayList<>(Arrays.asList(characters));

        System.out.println(chars);

        for (Character aChar : chars) {
            System.out.println(aChar);
        }


        System.out.println("\n\n____________Task8_____________");

        /*
         * Pseudocode
         * 1) create String ArrayList
         * 2)print out sorted arrayList
         * 3)Count objects that starts with M or m
         * 4)Count objects that does not have A or a or E or e
         * 5) fori loop*/

        String[] objectsTask8 = {"Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"};

        List<String> objects = new ArrayList<>(Arrays.asList(objectsTask8));
        System.out.println(objects);

        Collections.sort(objects);
        System.out.println(objects);

        int countM = 0;
        int countAe = 0;

        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i).startsWith("M") || objects.get(i).startsWith("m")) countM++;
            if (!(objects.get(i).toLowerCase().contains("a")) || !(objects.get(i).toLowerCase().contains("e")))
                countAe++;
        }

        System.out.println(countM);
        System.out.println(countAe);


        System.out.println("\n\n____________Task9_____________");

        /*
         * Pseudocode
         * 1) create String ArrayList
         * 2)print out arrayList
         * 3)Count objects that starts ends with P or p
         * 4)Count elements that contain P or p
         * 5) Count objects that starts ends with upperCase and lowerCase
         * 6) forEach loop*/

        String[] kitchenTAsk9 = {"Plate", "spoon", "fork", "Knife", "cup", "Mixer"};
        List<String> kitObjects = new ArrayList<>(Arrays.asList(kitchenTAsk9));
        System.out.println(kitObjects);

        int countUpper = 0;
        int countLower = 0;
        int hasPp = 0;
        int startEndP = 0;

        for (String kit : kitObjects) {
            if (Character.isUpperCase(kit.charAt(0))) countUpper++;
            else countLower++;
            if (kit.toLowerCase().charAt(0) == 'p' || kit.toLowerCase().charAt(kit.length() - 1) == 'p') startEndP++;
            if (kit.contains("p") || kit.contains("P")) hasPp++;
        }

        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements having P or p = " + hasPp);
        System.out.println("Elements starting or ending with P or p = " + startEndP);


        System.out.println("\n\n____________Task10_____________");

        /*
         * Pseudocode
         * 1) create int ArrayList
         * 2)print out arrayList
         * 3)Count objects that are dividable by 10
         * 4)Elements that are even and greater than 15
         * 5)Elements that are odd and less than 20
         * 6)Elements that are less than 15 or greater than 50
         * 7) fori loop*/

        Integer[] numbersTask10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        List<Integer> numbers10 = new ArrayList<>(Arrays.asList(numbersTask10));

        int byTen = 0;
        int greaterFifteen = 0;
        int oddLess20 = 0;
        int inFifties = 0;

        for (int i = 0; i < numbers10.size(); i++) {
            if (numbers10.get(i) % 10 == 0) byTen++;
            if ((numbers10.get(i) % 2 == 0) && (numbers10.get(i) > 15)) greaterFifteen++;
            if ((numbers10.get(i) % 2 == 1) && (numbers10.get(i) < 20)) oddLess20++;
            if (numbers10.get(i) < 15 || numbers10.get(i) > 50) inFifties++;
        }

        System.out.println(numbers10);

        System.out.println("Elements that can be divided by 10 = " + byTen);
        System.out.println("Elements that are even and greater than 15 = " + greaterFifteen);
        System.out.println("Elements that are odd and less than 20 = " + oddLess20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + inFifties);


    }
}

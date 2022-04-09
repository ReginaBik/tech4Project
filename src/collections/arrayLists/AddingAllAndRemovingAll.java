package collections.arrayLists;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {



        System.out.println("_________Task1_________");

        ArrayList<String> germanCars = new ArrayList<>();

        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");
        System.out.println("German cars = " + germanCars);

        System.out.println("_________Task2_________");

        ArrayList<String> japaneseCars = new ArrayList<>();

        japaneseCars.add("Honda");
        japaneseCars.add("Toyota");
        japaneseCars.add("Lexus");

        System.out.println("Japanese cars = " + japaneseCars);

        System.out.println("_________Task3_________");

        ArrayList<String> luxuryCars = new ArrayList<>();

        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Lexus");

        System.out.println("Luxury cars = " + luxuryCars);

        System.out.println("_________PUT_ALL_TOGETHER___________");

        ArrayList<String> inventory = new ArrayList<>();
        System.out.println("\nInventory at the beginning = " + inventory);

        inventory.addAll(germanCars); // adding all german cars to the inventory collection
        System.out.println("\nInventory after adding german cars = " + inventory);

        //ADDING ALL LUXURY CARS TO THE INVENTORY

        inventory.addAll(luxuryCars);
        System.out.println("\nInventory after adding luxury cars = " + inventory);


        // adding japanese cars after german cars
        inventory.addAll(germanCars.size(), japaneseCars);
        System.out.println("\nInventory after adding japanese cars = " + inventory);

        //REMOVING ALL JAPANESE CARS

        inventory.removeAll(japaneseCars);
        System.out.println("\nInventory after removing japanese cars = " + inventory);

        inventory.remove("Audi");
        inventory.remove("BMW");
        inventory.remove("Tesla");
        System.out.println("\nInventory after removing some certain cars = " + inventory);

      /*  ArrayList<String> carsToBeRemoved = new ArrayList<>();
        carsToBeRemoved.add("Audi");
        carsToBeRemoved.add("BMW");
        carsToBeRemoved.add("Tesla");
        inventory.removeAll(carsToBeRemoved);
       */










 }
}

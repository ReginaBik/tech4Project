package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {

    /*Task 1
    * Requirement:
    Write a method called as parseData() which takes a
    String has some keys in {} and values after between }{
    and returns a collection that has all the keys and values
    as entries.
    NOTE: The keys should be sorted*/

    public static TreeMap<Integer, String> parseData(String str){
        TreeMap<Integer, String> sortedData = new TreeMap<>();
        String[] split = str.replaceAll("[{}]", " ").split(" ");
        for (int i = 1; i < split.length; i += 2) {
            sortedData.put(Integer.valueOf(split[i]), split[i + 1]);
        }
        return sortedData;
    }

    /*Task 2
    * Requirement:
    Write a method called as calculateTotalPrice1() which takes
    a Map of some shopping items with their amounts and
    calculates the total prices as double. Item prices are given
    below
    Apple = $2.00
    Orange = $3.29
    Mango = $4.99
    Pineapple = $5.25*/

    public static double calculateTotalPrice1(Map<String, Integer> listOfItems){
        double totalPrice = 0.0;
        HashMap<String, Double> map1 = new HashMap<>();
        map1.put("Apple", 2.00);
        map1.put("Mango", 4.99);
        map1.put("Orange", 3.29);
        map1.put("Pineapple", 5.25);

        for (String s : listOfItems.keySet()) {
            totalPrice += listOfItems.get(s) * map1.get(s);
        }
        return totalPrice;

    }

    /*Task 3
    Requirement:
    Write a method calculateTotalPrice2() which takes a Map of some
    shopping items with their amounts and calculates the total prices as
    double. Item prices are given below
    Apple = $2.00
    Orange = $3.29
    Mango = $4.99
    BUT there will be some discounts as below
    There will be %50 discount for every second Apple
    There will be 1 free Mango if customer gets 3. So, fourth one is free*/

    public static double calculateTotalPrice2(Map<String, Integer> listOfItems){
        double totalPrice2 = 0.0;
        Map<String, Double> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 2.00);
        fruitPrices.put("Orange", 3.29);
        fruitPrices.put("Mango", 4.99);

        if (listOfItems.get("Mango") >= 3) listOfItems.put("Mango", listOfItems.get("Mango") - (listOfItems.get("Mango") / 3));
        for (String s : listOfItems.keySet()) {
            if (s.equals("Apple")){
                if (listOfItems.get("Apple") % 2 == 1) totalPrice2 += (listOfItems.get("Apple") - 1) * 1.5 + 2;
                else totalPrice2 += listOfItems.get("Apple") * 1.5;
            }
            else totalPrice2 += fruitPrices.get(s) * listOfItems.get(s);
        }

        return totalPrice2;

    }

    public static void main(String[] args) {


        System.out.println("Task 1 = " + parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        //Task2
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Mango", 1);
        System.out.println("Task 2 = " + calculateTotalPrice1(map));

        //task3
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Apple", 4);
        map2.put("Mango", 8);
        map2.put("Orange", 3);
        System.out.println("Task 3 = " + calculateTotalPrice2(map2));
    }
}

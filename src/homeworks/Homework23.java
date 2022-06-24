package homeworks;

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

    public static Double calculateTotalPrice1(Map<String, Integer> listOfItems){
        Double totalPrice = 0.0;
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

    public static Double calculateTotalPrice2(Map<String, Integer> listOfItems){
        Double totalPrice2 = 0.0;
        return totalPrice2;

    }
}

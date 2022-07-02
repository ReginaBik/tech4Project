package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class Practice {

    //Reverse String different ways

    //StringBuilder (mutable)

    public static void reverseString(String str){
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--){
            reversed.append(str.charAt(i));
        }
        System.out.println(reversed);
    }

    //Regular String (immutable)
    public static String reverseString2(String str){
        String reversed = "";
        for(int i = str.length()-1; i >=0; i--){
            reversed += str.charAt(i) + "";
        }
        return reversed;
    }

    /*
    Write a method calculateTotalPrice2() which takes a Map of some
    shopping items with their amounts and calculates the total prices as
    double. Item prices are given below
    Apple = $2.00
    Orange = $3.29
    Mango = $4.99
    BUT there will be some discounts as below
    There will be %50 discount for every second Apple
    There will be 1 free Mango if customer gets 3. So, fourth one is free.*/

    public static double calculateTotalPrice3(Map<String, Integer> gross) {
        double totalPrice = 0;
        Map<String, String> prices = new HashMap<>();
        prices.put("Apple", "$2.00");
        prices.put("Orange", "$3.29");
        prices.put("Mango", "$4.99");
        for (String product : gross.keySet()) {
            for (int i = 0; i < gross.get(product); i++) {
                if (product.equals("Apple") && i % 2 != 0)
                    totalPrice += Double.parseDouble(prices.get(product).substring(1)) * 0.50;
                else if (product.equals("Mango") && i % 4 == 3) continue;
                else totalPrice += Double.parseDouble(prices.get(product).substring(1));
            }
        }
        return (double) Math.round(totalPrice * 100) / 100;

    }

    public static void main(String[] args) {
        reverseString("Marzipan");
        System.out.println(reverseString2("Switzerland is gorgeous"));

    }


}

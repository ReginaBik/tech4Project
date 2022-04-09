package arrays;
import java.util.Arrays;
public class FruitsCollection {
    public static void main(String[] args) {


        String[] fruits = new String[4];
        System.out.println(Arrays.toString(fruits));

        fruits[0] = "grapefruit";
        fruits[3] = "pineapple";

        System.out.println(Arrays.toString(fruits));

        fruits[0] = "grapefruit";
        fruits[3] = "pineapple";

        System.out.println(Arrays.toString(fruits));

        /*Task3
        * find the size of your array and print it*/

        System.out.println(fruits.length);

        System.out.println(fruits[0] + " " + fruits[3]);// grapefruit , pineapple

        System.out.println(fruits[1]); // null
        System.out.println(fruits[0].toUpperCase()); //GRAPEFRUIT
        System.out.println(fruits[0].charAt(0)); //g
        System.out.println(fruits[0].length()); // 10
        System.out.println(fruits[0].startsWith("g")); // 10

        //System.out.println(fruits[1].length());// NULLPOINTEREXCEPTION!!! no data was give in element 1





    }
}

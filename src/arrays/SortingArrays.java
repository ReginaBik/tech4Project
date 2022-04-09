package arrays;

import java.util.Arrays;
import java.util.Locale;

public class SortingArrays {
    public static void main(String[] args) {

        //learning how to assort  in ASCENDING AND DESCENDING orders
        System.out.println("______sorting numbers______");

        int[] numbers = {10, -5, 0, 0, 3, 0, 7, 9};

        System.out.println("My array is = " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("My array sorted is = " + Arrays.toString(numbers));

        System.out.println("\n\n_________Sorting characters___________");

        char[] characters = {'A', 'b', 'z', 'H'};
        System.out.println(Arrays.toString(characters));

        Arrays.sort(characters);

        System.out.println("My characters array sorted = " + Arrays.toString(characters));


        System.out.println("\n\n_________Sorting words___________");

        String[] names = {"Adam","Adame", "Alex", "tom", "ally", "Adele", "terry"} ;
        System.out.println(Arrays.toString(names));

        Arrays.sort(names);

        System.out.println("My names array assorted " + Arrays.toString(names));

        int[] nums = {1, 3, 88, 97, -5, 14, 2};

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int num : nums){
            if(num > max) max = num;
            if(num < min) min = num;
            if(num > min && num != max) max2 = num;
            if(num < max && num != min) min2 = num;
        }
        System.out.println("Maximum = " + max);
        System.out.println("Maximum 2 = " + max2);
        System.out.println("Minimum = " + min);
        System.out.println("minimum 2 = " + min2);


 }
}

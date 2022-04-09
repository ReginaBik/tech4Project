package arrays;

import java.util.Arrays;

public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {

        System.out.println("__________Task1___________");

        int[] numbers = {5, 3, 0, -5};

        Arrays.sort(numbers);
        int lastNumber = numbers.length - 1;
        System.out.println(numbers[lastNumber]);

        System.out.println("__________Task1WITHOUTSORT___________");

        int max = numbers[0];
        for (int number : numbers){
            max = Math.max(max, number);
        }

       double[] numbers2 = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};
        double minimum = numbers2[0];

        for(double number1 : numbers2){
            minimum = Math.min(minimum, number1);

        }
        System.out.println(minimum);

       /* double minValue = Double.MAX_VALUE;

        for (double number : array) {
            //if(number < minValue) minValue = number;
            minValue = Math.min(minValue, number);
        }*/



        /*System.out.println("__________Task3___________");

        double minimum1 = numbers2[0];

        for(double number1 : numbers2){
            if(number1 != minimum && number1 < minimum1)*/



















    }
}

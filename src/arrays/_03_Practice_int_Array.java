package arrays;

import java.util.Arrays;

public class _03_Practice_int_Array {
    public static void main(String[] args) {

        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};

        System.out.println("Array not sorted = " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Array not sorted = " + Arrays.toString(numbers));



        System.out.println("______Task2_______");

        int countPos = 0;
        int countNeg = 0;
        int countZeros = 0;

        for(int number : numbers){
            if(number == 0) countZeros++;
            else if(number <  0) countNeg++;
            else countPos++;
        }
        System.out.println("Positives = " + countPos);
        System.out.println("Negatives = " + countNeg);
        System.out.println("Zeros = " + countZeros);



        System.out.println("______Task3_______");

        int odd = 0;
        int even = 0;

        for(int number : numbers){
            if(number % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);


    }
}

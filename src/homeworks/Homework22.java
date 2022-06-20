package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Homework22 {
    /*Task 1
    * -Create a method called fibonacciSeries1()
    -This method will take an int argument as n, and it will
    return n series of Fibonacci numbers as an int
    array.
    REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13*/

    public static int[] fibonacciSeries1(int n) {
        int[] fiboArray = new int[n];
        int fibo1 = 0;
        int fibo2 = 1;
        int fibo3;
        for (int i = 0; i < fiboArray.length; i++) {
            fiboArray[i] += fibo1;
            fibo3 = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo3;
        }
        return fiboArray;

    }



    /*Task 2
    * -Create a method called fibonacciSeries2()
    -This method will take an int argument as n, and it will
    return the nth series of Fibonacci number as an
    int.
    REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13*/

    public static int fibonacciSeries2(int n) {
        int[] fiboArray = new int[n];
        fiboArray[0] = 0;
        fiboArray[1] = 1;

        for (int i = 2; i < n; i++) {
            fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
        }
        return fiboArray[n-1];

    } 



    /*Task 3
    * -Create a method called findUniques()
    -This method will take 2 int array argument, and it will return
    an int array which has only the unique values from both given
    arrays.
    NOTE: If both arrays are empty, then return an empty array.
    NOTE: if one of the array is empty, then return unique values
    from the other array.*/
    //NOT MY SOLUTION
    public static int[] findUniques(int[] array1, int[] array2) {
        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).distinct().toArray();
    }

    /*Task 4
    * -Create a method called isPowerOf3()
    -This method will take an int argument, and it will
    return true if given int argument is equal to 3
    power of the X. Otherwise, it will return false.
    Numbers that are power of 3 = 1, 3, 9, 27, 81, 243*/

    public static boolean isPowerOf_3(int number) {
        if (number < 1) return false;
        while (number % 3 == 0) {
            number /= 3;
        }
        return number == 1;
    }

    /*Task 5
    * -Create a method called firstDuplicate()
    -This method will take an int array argument, and it will
    return an int which is the first duplicated number.
    NOTE: All elements will be positive numbers.
    NOTE: If there are no duplicates, then return -1
    NOTE: If there are more than one duplicate, then return
    the one for which second occurrence has the smallest
    index.*/

    public static int firstDuplicate(int[] array) {
        if (array.length <= 1) return -1;
        else {
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : array) list.add(num);
            ArrayList<Integer> newDupesList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {//1, 2, 3, 3, 4, 1
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) newDupesList.add(list.get(i));
                }
                Collections.sort(newDupesList);
            }
            return newDupesList.get(newDupesList.size() - 1);
        }
    }


    public static void main(String[] args) {


        System.out.println("Task 1 = " + Arrays.toString(fibonacciSeries1(5)));

        System.out.println("\nTask 2 = " + fibonacciSeries2(5));

        System.out.println("\nTask 3 = " + Arrays.toString(findUniques(new int[]{8, 9}, new int[]{9, 8, 9})));

        System.out.println("\nTask 4 = " + isPowerOf_3(81));

        System.out.println("\nTask 5 = " + firstDuplicate(new int[]{1, 2, 3, 3, 4, 1}));

  }
}
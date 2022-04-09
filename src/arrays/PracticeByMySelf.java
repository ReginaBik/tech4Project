package arrays;

public class PracticeByMySelf {
    public static void main(String[] args) {
        int[] numbers = {-5, -15, 0, 1, -6, 8, 9 };

        int min = Integer.MAX_VALUE; // 1
        int secondMin = Integer.MAX_VALUE; // 3

        for (int number : numbers) {
            if(number < min) min = number;
        }

        for (int number : numbers) {
            if(number < secondMin && number != min) secondMin = number;
        }

        System.out.println("The smallest number in the array = " + min);
        System.out.println("The second smallest number in the array = " + secondMin);












    }
}

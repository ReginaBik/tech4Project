package arrays;

public class _04_Practice_Partial_arrays {
    public static void main(String[] args) {
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        int sum = 0;
        for(int each : numbers){
            sum += each;
        }
        System.out.println(sum);


        System.out.println("____foriLoop____");

        int sum1 = 0;

        for(int i = 0; i < numbers.length; i++){
            sum1 += numbers[i];
        }
        System.out.println(sum1);

        System.out.println("__________Task3___________");

        int sumTask3 = 0;

        for(int i = 0; i < 3; i++){
            sumTask3 += numbers[i];
        }
        System.out.println("The sum of first 3 elements in array is = " + sumTask3);



        System.out.println("__________Task4___________");

        int sumLast5 = 0;

        for(int i = numbers.length - 5; i < numbers.length; i++ ) {
            sumLast5 += numbers[i];
        }
        System.out.println("The sum of last 5 elements is = " + sumLast5);


        System.out.println("__________Task5___________");

        int product = 1;

        for(int i = numbers.length-4; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                continue;
            }else product *= numbers[i];
        }
        System.out.println(product);


        System.out.println("__________Task6___________");

        boolean isZero = false;

        for(int number : numbers){
            if(number == 0) {
                isZero = true;
                break;
            }
        }
        System.out.println(isZero);
















    }
}

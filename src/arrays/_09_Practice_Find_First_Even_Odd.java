package arrays;

public class _09_Practice_Find_First_Even_Odd {
    public static void main(String[] args) {


        int[] numbers = {0, 5, 3, 2, 4, 7, 10};

        boolean isFirstEvenFound = false;
        boolean isFirstOddFound = false;


        for(int number : numbers){
            if(number % 2 == 0 && !isFirstEvenFound) {
                isFirstEvenFound = true;
                System.out.println("first even is = " + number);


            } else if(!isFirstOddFound){
                isFirstOddFound = true;
                System.out.println("first odd is = " + number);
            }
            if(isFirstEvenFound && isFirstOddFound) break;
        }
        if(!isFirstEvenFound) System.out.println("There is no even numbers in this Array");
        if(!isFirstOddFound) System.out.println("There is no even numbers in this Array");








    }
}

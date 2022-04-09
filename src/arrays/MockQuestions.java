package arrays;

public class MockQuestions {
    public static void main(String[] args) {

        /* PSEUDOCODE
        * 1) we create 2 containers for max and second max
        * 2) find the max with loop
        * 3) find the second max(if it is not the max and bigger than the rest of it)*/
        int[] numbers = {4, 5, 64, 345, 36, 74, 32};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            if (max < numbers[i] ) max = numbers[i];
        }
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] != max && secondMax < numbers[i]) secondMax = numbers[i];
        }
        System.out.println(max);
        System.out.println(secondMax);

        /*int maxi = Integer.MIN_VALUE;
        int secondMaxi = Integer.MIN_VALUE; // initialize max & 2nd max variables to the smallest number(Minimum)
// it will be reassigned later when comparing each element to ultimately find max

// use loop to check each number(element) of array
        for (int i =0; i < numbers.length; i++){
            if (numbers[i] >= maxi){ // if element is greater or equals to max variable(which starts as the smallest value)
                secondMaxi = maxi;
                max = numbers[i];
            }else {
                if (numbers[i] > secondMaxi && numbers[i] != maxi){
                    secondMaxi = numbers[i];
                }
            }
        }
        System.out.println("The max = " + maxi);
        System.out.println("The second max = " + secondMaxi);*/

        String word = "civic";
        String rWord = "";

        for (int i = word.length() - 1; i >= 0; i--){
            rWord += word.charAt(i) + "";
        }
        System.out.println(rWord.equals(word));

        System.out.println("______FizzBazz______");

        /*
        * Pseudocode
        * 1) divided by 3  - fizz
        * 2) divided by 5 = Bazz
        * 3) divided by 15 = fizaaBazz
        */
        for(int i = 1; i < 17; i++ ){
            if(i % 15 == 0) System.out.println("FizzBazz");
            else if (i % 5 == 0) System.out.println("Fizz");
            else if (i % 3 == 0) System.out.println("Bazz");
            else System.out.println(i);
        }

        System.out.println("______Fibonacci______");

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        String s = "";

        for (int i = 0; i < 10; i++) { // the iteration has to be 10 times (0 to 9) !!!
            //store the num
            //get the third
            //change n1 n2
            s += n1 + " _ ";

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(s.substring(0, s.length()-3));

















    }

}

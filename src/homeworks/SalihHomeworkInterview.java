package homeworks;

public class SalihHomeworkInterview {

    /*
    2 solutions - 5th of July
    Create a method which will return the max of any consecutive k numbers from an array
    arr = {4, 2, 5, 12, 20, 5, 23}, k = 3 ==> 48
    arr = {100, 200, 600, 300}, k = 2     ==> 900
    arr = {1, 2, 3}, k = 4                ==> -1
     */

    public static int consecutiveNumbers(int[] arr, int number){
        int sum = 0;
        if(number > arr.length) return -1;
        for(int i = 0; i< arr.length-1; i++){
            for (int j = number; j > 0 ; j--) {


            }

        }
        return sum;
    }
}

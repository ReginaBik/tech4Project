package recursion;

public class _01_SumOfNumbers {

    public static int sum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static int recursiveSum(int n){
        if(n > 0) return n + recursiveSum(n - 1);
        return 0;
    }



    public static void main(String[] args) {
        System.out.println( _01_SumOfNumbers.sum(5));
        System.out.println( _01_SumOfNumbers.sum(7));
        System.out.println( _01_SumOfNumbers.sum(6));


 }









}

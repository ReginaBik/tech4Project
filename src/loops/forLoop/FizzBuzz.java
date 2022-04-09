package loops.forLoop;

public class FizzBuzz {
    public static void main(String[] args) {
        String f = "Fizz";
        String b = "Buzz";

        for(int i = 1; i <= 30; i++){
            if (i % 3 == 0 && i % 5 == 0) System.out.println(f + b);
            else if (i % 3 == 0) System.out.println(f);
            else if(i % 5 == 0) System.out.println(b);
            else System.out.println(i++);
        }



    }
}

package loops.forLoop;
import java.util.Random;
public class PrintNumbersFromAscendingToDescending {
    public static void main(String[] args) {

        Random random = new Random();
       ///If you want numbers from 10 to 25 int num1 = random.nextInt(26) + 10;
        int num1 = random.nextInt(26) + 10;
        int num2 = random.nextInt(26) + 10;

        System.out.println(num1);
        System.out.println(num2);
       // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);

      /* FIRST WAY
       if (num1 > num2){
            for (int i = num1; i <= num2; i++){
           if (i % 5 != 0) System.out.println(i);
            }
        } else
            for (int i = num2; i <= num1; i++){
                if (i % 5 != 0) System.out.println(i);
            }
        }*/

        String s = "";

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++){
            if (i % 5 != 0) s += i + " - ";
        }
        System.out.println(s.substring(0, s.length()-3));



    }
}

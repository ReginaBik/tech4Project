package utilities;
import methods.Introduction;
import utilities.Calculator;

public class testingCalculator {

    public static void main(String[] args) {
        int i1 = 15;
        int i2= 2;

        int result = Calculator.divide(i1, i2);  // returns as int

        System.out.println(result);

        double d1 = 15;
        double d2 = 2;

        double result2 = Calculator.divide(d1, d2);
        System.out.println(result2);

        Introduction.introduce("Wazwaz","engineer", 20, "books");

        int max = Math.max(1, 2);
        double maxD = Math.max(15.2, 10);

      //  int ran1 = RandomNumberGenerator.getRandomNumber(25, 50);
       // System.out.println("The number between 25 and 50 is = " + (25 <= ran1 && ran1 <= 50)); //true


    }

}

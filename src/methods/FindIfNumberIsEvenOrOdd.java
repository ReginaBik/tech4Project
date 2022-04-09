package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class FindIfNumberIsEvenOrOdd {
    public static void main(String[] args) {


        int ran1 = RandomNumberGenerator.getRandomNumber(17, 33);
        System.out.println("The number generated is " + ran1);

       if ( MathHelper.isEven(ran1)){
           System.out.println("The number generated is even");
       } else {
           System.out.println("The number generated is odd");
       }
        System.out.println("end of program!");


    }
}

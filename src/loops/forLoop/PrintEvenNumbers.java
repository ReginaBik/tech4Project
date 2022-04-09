package loops.forLoop;

import ifElseStatemnets.ifElseStatements.MathGradeEx;
import utilities.MathHelper;

public class PrintEvenNumbers {
    public static void main(String[] args) {

        System.out.println("hi");

        for(int i = 0; i <= 10; i++){
            if (i % 2 == 0) System.out.println(i);
        }
        for(int i = 0; i <= 10; i++){
            if (MathHelper.isEven(i))
                System.out.println(i);
        }

        for(int i = 0; i <= 10; i++){
        System.out.println(i++);
        }




    }
}

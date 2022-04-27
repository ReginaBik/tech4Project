package exeptions;

import java.util.ArrayList;

public class Try_Catch_Finally_Block {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);

        }
        catch (ArithmeticException exception){
            exception.getCause();
        }
        finally {
            System.out.println("Here is the report!!!! We report the exception here!!!");
        }

        System.out.println("End of the program");


    }
}

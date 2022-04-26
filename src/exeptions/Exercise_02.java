package exeptions;

public class Exercise_02 {
    public static void main(String[] args) {
        int number = 45;
        System.out.println(number / 3);

        try{
            System.out.println(number / 0);
        }
        catch (ArithmeticException exception){
            System.out.println("An exception is here!!!!!");
        }
        System.out.println("End of the program!");
    }
}

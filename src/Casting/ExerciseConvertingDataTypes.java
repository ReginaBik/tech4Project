package Casting;

public class ExerciseConvertingDataTypes {
    public static void main(String[] args) {

        String num1 = "23";
        String num2 = "25";

        int num1Int = Integer.parseInt(num1);
        int num2Int = Integer.parseInt(num2);

        System.out.println("The average of these 2 numbers = " + ((num1Int + num2Int) / 2));

        String number1 = "23";
        String number2 = "25";

        Integer number1Integer = Integer.valueOf(number1);
        Integer number2Integer = Integer.valueOf(number2);

        System.out.println("avg with int is " + (number1Integer + number2Integer)/2);




    }
}

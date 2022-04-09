package operators.arithmeticOperators;

public class Exercise2 {
    public static void main(String[] args){
        /*Pseudo code
        1) create 2 variable
        2) do addition
        3) multiply it
          */

        int num1 = 23;
        int num2 = 48;
        int num3 = 2;   // if you have a formula perimeter = 2 * (num1 + num2) you don't have to assign 2 as int
                        //It would be more work if you do

        int area = num1 * num2;

        int perimeter = num3 * (num1 + num2);
        int perimeter1 = 2 * (num1 + num2);
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println( perimeter1);







    }

}

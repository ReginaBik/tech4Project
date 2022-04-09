package operators.arithmeticOperators;

public class Division {
    public static void main(String[] args){
        double num1 = 15;
        double num2 = 3;
        int num3 = 4;
        int num4 = 10;

        double devision  = num1 / num2;
        double divisionByInt = num1 / num3;
        double divisionByDouble = num4 / num2;



        System.out.println("num1 / num2 = " + divisionByInt);    ///double / double
        System.out.println("num1 / num2 = " + devision);         ///double / int
        System.out.println("num4 / num2 = " + divisionByDouble); /// int / double

        System.out.println("num4 + num2 =" + num4 + num2); /////never going to run right
        System.out.println("num4 + num2 =" + (num4 + num2));

















    }
}

package operators.arithmeticOperators;

public class Exercise3 {
    public static void main(String[] args) {
        double s1 = 90_000.00; //you can either put 90000.00 or 90_000.00 so it is easier to read the number

        double s12 = s1 / 12;
        double s52 = s1 / 52;
        double s26 = s1 / (s52 / 2);

        System.out.println("Monthly salary = " + s12 + " $");
        System.out.println("Weekly salary = " + s52 + " $");
        System.out.println("Biweekly salary = " + s26 + " $");




    }
}

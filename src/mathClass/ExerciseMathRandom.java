package mathClass;

public class ExerciseMathRandom {
    public static void main(String[] args) {
        // random number between 45 and 98 -98 included

       int randomNumber = (int) (Math.random() * 54 + 45);

       // (98-45 +1) + 45
        System.out.println(randomNumber);

        //67 and 85
        //print number 1 and number 2 and max and min

        int number1 = (int) (Math.random() * 19 + 67);
        int number2 = (int) (Math.random() * 19 + 67);

        System.out.println("Random number 1 is " + number1);
        System.out.println("Random number 2 is " + number2);
        System.out.println( "\t\nThe max of random 2 numbers is " + Math.max(number1, number2) +
                "\t\nThe min of random 2 numbers is " + Math.min(number1, number2));


    }
}

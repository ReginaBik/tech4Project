package utilities;

public class MathHelper {

    //Create  a method that takes 3 int and returns the max
    //connected to FindGreatestOrSmallestOf3Numbers

    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3)); // the method will return num3 (or just the biggest number)
    }

    //method overloading
        public static double maxOfThree (double num1, double num2, double num3){
            return Math.max(Math.max(num1, num2), num3);
        }
    // the name of the method can be the same but the argument CANNOT BE THE SAME
    //each method has to be inside the curly braces

    //create a method that takes 3 byte variable and returns the min

    public static byte minOfThree (byte num1, byte num2, byte num3){
        return (byte) (Math.min(Math.min(num1, num2), num3));
    }

    //generate 4 random numbers between 50 and 100

    public static int getRandomNumber(int start, int end){
        return (int) (Math.random() * (end - start + 1)) + start;
    }

    //if odd - false if even - true

    public static boolean isEven(int num){
        return num % 2 == 0; // this num % 2 == 0 is a boolean, so it'll return true/false.

    /* THIS IS THE LONGER WAY TO CODE THE ABOVE
    if (num % 2 == 0) return true;
    else return false;
    */
    }
    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    // method that takes 1 int as an argument and returns true if the number is positive

    public static boolean isPositive(int num){
        return num > 0;
    }
    public static boolean isNegative(int num){
        return num < 0;
    }

    public static boolean isZero(int num){
        return num == 0;
    }



}


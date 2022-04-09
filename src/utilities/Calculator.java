package utilities;

public class Calculator {
    /*
    * 1.To create a method we need a proper name
    *2. Decide its accessibility level (public) |
    *
    * 1) public - you can use it anywhere in the project
    * 2) private - you can use it only in the same class
    * 3) default - you can use it only in the sme package
    * 4) protected -
    * 3. Decide its accessibility way (You want to call it
    *
    *  with class name or with object name )
    * static -> you want to call it with class name (Math.max()/Math.min, print(),
    * println(), parseInt(), valueOf())
    * non-static -> you want to call it with object name (don't mention static in your method name)
    * (Scanner  input = new Scanner(System.in);)
    *
    * 4. Decide if it returns something or not
    * if it returns - decide what it returns
    * if it doesn't return - then put void
    *
    * 5. Does it take any argument
    * if it takes, then decide what arguments it takes and how many arguments it takes
    *
    * //NOTE: if your method is not void (meaning it is return type) you MUST use return keyword
    * in the body of the method)
    *
    * //NOTE: every method MUST have a body that runs a task {}
    *
    * //NOTE if your method returns int, then the variable used next to return keyword in the body
    * MUST be an int.
    *
    * //NOTE We can have multiple methods sharing the same name in the same class only if they have
    *  different arguments.
    * Different arguments could be either the number of arguments are different or the types of
    * arguments are different
    *
    * NOTE : don't ever create a method inside another method
    *
    * */
    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
//create a method that finds the sum of 2 int numbers and returns it
//create a method that finds the sum of 2 double numbers and returns it
    // create a method that finds an absolute difference of 2 int numbers and returns it
    // create a method that finds an absolute difference of 2 double numbers and returns it
    // create a method that finds the product of 2 int numbers and returns it
    // create a method that finds the product of 2 doubles numbers and returns it

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    public static int absDif(int num1, int num2){
        return (Math.max(num1, num2) - Math.min(num1, num2));
    }
    // public static int findAbsOf2(int num1, int num2){
    // return Math.abs(num1 - num2);  }
    /* num1 - num2
    if (num1 > num2){
    return num1 - num2;
    }else if (num1 < num2){
    return num2 - num1
    } else {}     /////// when u use else if you HAVE to have else at the end. It can be empty too
    * */


    /*
    * turnary method
    * return (num1 > num2) ? num1 - num2 : num2 - num1;
    * */

    public static double absDif(double num1, double num2){
        return (Math.max(num1, num2) - Math.min(num1, num2));
    }

    // public static double findAbsOf2(double num1, double num2){
    // return Math.abs(num1 - num2);  }

    public static int product(int num1, int num2){
        return num1 * num2;
    }

    public static double product(double num1, double num2){
        return num1 * num2;
    }


}

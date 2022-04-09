package mathClass;
import java.util.Scanner;
public class ExercizeMaxAndMin {
    public static void main(String[] args) {

        /*Pseudocode
        find the max and min of given 3 numbers
        print it with proper messages
        * */

        int x = 4 , y = 67 , z = -54;
        //RECCOMENDED
        Math.max(x, y); //67
        //

        int maxOfXY = Math.max(x, y);
        int MaxOfXYZ = Math.max(maxOfXY, z);
        //RECCOMENDED
        Math.min(x,y); //4


        int minOfXY = Math.min(x, y);
        int minOfXYZ = Math.min(minOfXY, z);

        System.out.println(MaxOfXYZ + " " + minOfXYZ);
        System.out.println("Max of every number is = " + Math.max(Math.max(x, y), z)); //67, -54
        System.out.println("Min of every number is = " + Math.min(Math.min(4, 67), -54)); //4, -54(can keep the numbers

        /* Pseudocode
        * 1) put 3 numbers
        * 2) find the max of it
        * */

        System.out.println("The max of given 3 numbers is = " + Math.max(23, Math.max(4, 56)));


      /*  int a = 4; // if you are not going to store numbers, don't put it in int
        int b = 56;
        int c = 23;
        Math.max(a, b);
        int maximum = Math.max(Math.max(a, b), c);

        System.out.println("The max of given 3 numbers is = " + maximum);*/

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 4 numbers");

        int number1 = userInput.nextInt();
        int number2 = userInput.nextInt();
        int number3 = userInput.nextInt();
        int number4 = userInput.nextInt();

        Math.max(number1, number2);
        Math.max(number3, number4);
        Math.max(Math.max(number1, number2), Math.max(number3, number4));

        System.out.println("The max of 4 numbers is " + Math.max(Math.max(number1, number2), Math.max(number3, number4)));

        Math.min(number1, number2);
        Math.min(number3, number4);
        Math.min(Math.min(number1, number2), Math.min(number3, number4));
        System.out.println("The min of 4 numbers is " + Math.min(Math.min(number1, number2), Math.min(number3, number4)));


    }

}

package loops.controlStatements;
import java.util.Scanner;
public class Practice02 {
    public static void main(String[] args) {

        //Pseudocode
        //1)ask user for 2 numbers between 0 and 10
        //2)print all the numbers between given numbers (increment) from min to max
        //3) number 5 is exception don't print it

        Scanner l = new Scanner(System.in);
        System.out.println("Please enter 2 numbers from 0 to 10 (both included)");

        int n1 = l.nextInt();
        int n2 = l.nextInt();

        for(int i = Math.min(n1, n2); i <= Math.max(n1, n2); i++ ) {
            if(i == 5) continue;
            System.out.println(i);  //you can put else here as well
        }





    }
}

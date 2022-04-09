package loops.controlStatements;
import java.util.Scanner;
public class Practice01 {
    public static void main(String[] args) {
       /* for(int k = 1; k <= 25; k++){
            if (k % 10 == 0) continue; // skips numbers dividable by 10
            else System.out.println(k);
            if (k == 15) break;  // evaluates the program
        }

        System.out.println("End of the program");*/

        //Pseudocode.
        // 1)ask a user for 2 random numbers
        //2) find biggest
        //3) print out from biggest to smallest numbers entered by user
        //4) don't print any numbers less than 10

        Scanner loop = new Scanner(System.in);

        System.out.println("Please enter 2 number");
        int loop1 = loop.nextInt();
        int loop2 = loop.nextInt();


        for(int i = Math.max(loop1, loop2); i >= Math.min(loop1, loop2); i-- ) {
            if(i < 10 ) break;
            System.out.println(i);
            if(i < 11) break;
        }







    }
}

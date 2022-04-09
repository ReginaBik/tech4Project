package loops.controlStatements;

public class UnderstandingControlStatements {
    public static void main(String[] args) {

      /* int i = 1;
        while (true){
            System.out.println(i);
            i++;
            if(i == 26) break;
        }

        //using continue control statement to skip numbers that can be divided by 10

        for(int k = 1; k <= 25; i++){
            if (i % 10 == 0) continue;
            else System.out.println(i);
        } */

        for(int k = 1; k <= 25; k++){
            if (k % 10 == 0) continue; // skips numbers dividable by 10
            else System.out.println(k);
            if (k == 15) break;  // evaluates the program
        }

        System.out.println("End of the program");








    }
}

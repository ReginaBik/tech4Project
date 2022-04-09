package loops.DoWhileLoops;
import java.util.Random;
public class UnderstandingDoWhileLoops {
    public static void main(String[] args) {

        Random random = new Random();

        boolean b = random.nextBoolean();

        while(b){
            System.out.println("It's true");
        }
        System.out.println("end of the program");

        boolean b2 = false;
        do{
            System.out.println("True");
        }while(b2);



    }
}

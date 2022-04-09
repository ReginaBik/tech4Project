package ifElseStatemnets.ifElseStatements;
import java.util.Scanner;
public class Between0And100 {
    public static void main(String[] args) {
        Scanner kit = new Scanner(System.in);

        System.out.println("Please enter a number!");

        int lok = kit.nextInt();

        boolean answer = lok >= 0;
        boolean hit = lok <=100;

        //boolean inbetween = answer && hit;
        //if(inbetween){sout}else{sout} // THE CORRECT WAY

        //true true = true /   and false false = true when u use ==
        //that's why u need to use &&

        if(answer == hit){
            System.out.println("cool");
        } else {
            System.out.println("not cool");
        }



    }
}

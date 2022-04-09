package ifElseStatemnets.IfElseIfStatements;

public class Exercise1 {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random()*21) - 10;

        boolean clear =  randomNumber >= 1;
        boolean zero = randomNumber == 0;
        boolean negative = randomNumber <= -1;

        if(randomNumber < 0){
            System.out.println("negative");
        }
        if(randomNumber > 0){

        System.out.println("positive");
        }
        if(randomNumber == 0){

        System.out.println("equal");
        }


        /* if (num < 0){
        system out println("negative");
        } else if (num > ) {
        system out println("positive");
        }else{
        system out println ("number is zero");
        }
         ()




        */


    }
}

package ifElseStatemnets.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args) {
       /* Write a program that generates a random number bt -50 and 50
        if number is positive, then we will win 10 points
        if number is more than 25, then we will win extra 10 points
        if number is -7, then we will win extra 10 points
        lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points*/

        int number = (int) ((Math.random() * 101) - 50);
        System.out.println(number);
        int point = 0;

        if(number > 0 ){
            System.out.println("Your number > 0! You got extra 10 points. Now you have " + (point + 10) + " points");
            if(number > 25){
                System.out.println("Your number > 25! You got extra 10 points. Now you have " + (point +10 + 10) + " points");

            }
            if(number == 7){
                System.out.println("You got extra 100 points. Now you have " + (point + 10 + 100) + "points");

            }
        } else{
            System.out.println("You lost. 0 points");
            if(number == -7){
                System.out.println(" You got extra 10 points. Now you have " + (point + 10) + "points");

            }
        }
    }
}

package mathClass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class FindRandom {
    public static void main(String[] args) {

        double randomNumber = Math.random();

        System.out.println(randomNumber);
        double random0And10Included = Math.random(); // 4.3245734

        System.out.println(random0And10Included * 10); // that would be random 0 to 9

        // if you want 0 to 10 you have to multiply it by 11
        System.out.println(random0And10Included * 11);

        int random0And10NotIncluded = (int) (Math.random() * 10); //don't forget to put second parentheses

        System.out.println("\n" + random0And10NotIncluded);

        int random20 = (int) Math.random() * 21;

        System.out.println(random20);

        int random10And20 = (int) ((Math.random() * 10) + (Math.random() * 21));
        // correct way
        int random10And20Included = (int) (Math.random() * 11) + 10; // 0- 10
        System.out.println(random10And20);
        System.out.println(random10And20Included);


        //create a random number between 103 - 346 included take that as int
        // get the difference between 346 and 103 and add +1
        // multiply it by 243 + 1 = 244
        // add the starting point to the equation
        // random * (end point - start point +1) + start point ---> included


        int random103And346Included = (int) (Math.random() * 244) + 103;
        System.out.println(random103And346Included);

        // random between -50 and 50
        // 50 - (-50) = 100 + 1 = 1.
        int random50And50Included = (int) (Math.random() * 101) - 50;
        // int randomBetween50s = (int) (Math.random() * (50 + (-50) +1) - 50;
        System.out.println(random50And50Included);









    }
}

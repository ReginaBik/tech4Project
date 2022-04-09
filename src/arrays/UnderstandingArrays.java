package arrays;
import java.util.Arrays;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class UnderstandingArrays {
    public static void main(String[] args) {

        //one students information

        String name = "John";

        int age = 45;

        System.out.println("Name is = " + name);
        System.out.println("Age is = " + age);

        /*
        *The new trend is to have multiple student's information. */

        String studentsName = "Alex, Abe, Yakeen";
        String ages1 = "20, 21, 22";

        String[] names = {"Alex", "Abe", "Yakeen"};
        int[] ages = {20, 21, 22};
        char[] favCharacters = {'A', '%', 'G'};
        double[] balances = {5.6, 15, 23.6};
        boolean[] doTheyLikeJava = {false, true, true};


        //[Ljava.lang.String;@1540e19d // location where ypur collection is stored

        //HOW TO PRINT ARRAY

        System.out.println(names);

        String namesToString = Arrays.toString(names);
        System.out.println(namesToString);

        //System.out.println(Arrays.toString(names));  less code - best code



        //HOW TO CALL A SINGLE DATA OF ARRAY

        System.out.println(names[1]); //Abe
        System.out.println(names[0]); // Alex

        //System.out.println(names[5]); // ArrayIndexOutOfBound


        //HOW TO UPDATE AN ELEMENT Abe -> Abraham

        names[1] = "Abraham";
        System.out.println(Arrays.toString(names));

        // alex's age is 20 and his favorite char is A. His balance is 5.6, and he likes java is false.


        //System.out.println(names[0] + "'s age is " + ages[0] + " years old");

                              //OR

        for(int i = 0; i <= 2; i++){
            System.out.println(names[i] + "'s age is " + ages[i] + " years old");
        }












    }
}

package operators.relationaloperators;

public class exercise1 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 10;

        boolean b1 = y < z;
        boolean b2 = x <= y;
        boolean b3 = x >= z;
        boolean b4 = y > x;
        boolean b5 = x >= y;

        ///////
       /* boolean b6 = (x >= z) < y; we can't do this operation because (x >= z) is true but we can't
         compare statement "true" with number "y"*/
        //////

        System.out.println(" " + b1 + " " + b2 + " " + b3 + " " + b4 + " " + b5 );
        // send me "javaHomework" or "interviewQuestions"

        /*javaHomework  |   interviewQuestions            result

            false               false                     false
            true                false                     true
            false               true                      true
            true                true                      true
           */

        // send me "javaHomework" AND "interviewQuestions"
        /* false                false                     false
           True                 false                     false
           false                true                      false
           true                 true                      true

        * */

    }
}

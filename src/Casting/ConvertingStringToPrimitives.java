package Casting;

public class ConvertingStringToPrimitives {
    public static void main(String[] args) {
        // VERY IMPORTANT
        String num1 = "23";
        String num2 = "12";

        //integer - class representation for incremetive

        int num1Int = Integer.parseInt(num1); // string - converted to int
        int num2Int = Integer.parseInt(num2);// returns primitive

        System.out.println(num1 + num2);
        System.out.println(num1Int + num2Int);

        //integer

        Integer num1Integer = Integer.valueOf(num1);// returns wrapper class (wrapper - representation of primitive)
        Integer num2Integer = Integer.valueOf(num2);// string - converted to integer - then to int

        System.out.println(num1Integer + num2Integer);

        int num1IntValueOf = Integer.valueOf(num1); // string -- converted to integer - then to int
       /*Wrapper classes
       primitive        Class
       int -            Integer
       byte -           Byte
       short -          Short
       long -           Double
       float     -      Float
       char -           Character
       boolean -        Boolean
        */

        String save =" 390";
        String day = "15.60";

        double saveDouble = Double.parseDouble(save);
        double dayDouble = Double.parseDouble(day);

        System.out.println("He will need to save for " + (int)(saveDouble/dayDouble) + " days.");

    }
}

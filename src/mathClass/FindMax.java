package mathClass;

public class FindMax {
    public static void main(String[] args) {

       // Math Class

      /*  max() method - finds the max value

     */
      int x = 8;
      int y = 20;
      int z = 6;


      int maxValueOfXY = Math.max(x, y);
      int mimi = Math.max('a', y);
        System.out.println( mimi);
        //'a'  is char - when runned in a programm it will print the ascii value of a which is 97

        System.out.println(maxValueOfXY);
        int maxValueOFXYZ = Math.max(maxValueOfXY, z);

        System.out.println(maxValueOFXYZ);




        int a = 34;
        int b = 123;


        int maxValueOfAB = Math.max(a, b);

        System.out.println(maxValueOfAB);

         int maOFEveryNumber = Math.max(maxValueOFXYZ, maxValueOfAB);

        System.out.println(maOFEveryNumber);









    }
}

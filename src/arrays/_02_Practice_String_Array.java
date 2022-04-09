package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {

        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        System.out.println("Unsorted array = " + Arrays.toString(students));

        Arrays.sort(students);

        System.out.println("Sorted array = " + Arrays.toString(students));

        System.out.println("\n_______Task2____________");

        System.out.println("First name is " + students[0]);

        System.out.println("Last name is " + students[students.length-1]);

        System.out.println("\n\n________Task 3________");

        int countAName = 0;

        for(int i = 0; i < students.length; i++ ){
            if (students[i].charAt(0) == 'A' ){
                countAName++;
            }
        }
        System.out.println(countAName);

        System.out.println("\n\n________Task 3 __ForEachLoop________");
        int countNames = 0;

        for(int i = 0; i < students.length; i++){

            if(students[i].contains("a")  || students[i].contains("A")  || students[i].contains("e") ||
                    students[i].contains("E") ) countAName++;
        }
        System.out.println(countAName);

        int count = 0;


        for(String student : students){
            if(student.contains("a")  || student.contains("A")  || student.contains("e") ||
                    student.contains("E"))
                count++;
        }
        System.out.println(count);

        int count5Length = 0;


        for (String student : students) {
            if(student.length() >= 5) count5Length++;
        }
        System.out.println(count5Length);

      /*  int countJj = 0;
        int countSs = 0;
        int hasOo = 0;
        int evenLength = 0;
        int oddLength = 0;
        int startsWithVowel = 0;


        for(String student: students){
            if(student.toUpperCase().startsWith("J")){ countJj++;

            }else if (student.toUpperCase().startsWith("S")) {
                countSs++;
            }
            if(student.toUpperCase().contains("O")) hasOo++;

        }


*/
        boolean hasJennifer = false;

        for(String student : students) {
           if( student.equalsIgnoreCase("Jennifer"))
                hasJennifer = true;
                break;

        }
        System.out.println(hasJennifer);

        int countJennifer = 0;
        for(String student : students) {
            if (student.equalsIgnoreCase("Jennifer"))
                countJennifer++;
        }
        System.out.println(countJennifer == 0 ? "False" : "True");


        System.out.println("______________________");

        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};

        System.out.println("Array not sorted = " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Array not sorted = " + Arrays.toString(numbers));

        int count7 = 0, dividedBy5 = 0, dividedBy2ButNot3 = 0;
        for (int number : numbers) {
            if(number % 2 == 0 && number % 3 != 0) {
                dividedBy2ButNot3++;
            }else if(number % 5 == 0) dividedBy5++;
            if(number > 7) count7++;

        }
        System.out.println("more than 7 = " + count7 + "\ndivided by 5 = " + dividedBy5 + "\ndivided by 2 but not 3 = " + dividedBy2ButNot3);
    }










        }








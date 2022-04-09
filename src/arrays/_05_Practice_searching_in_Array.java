package arrays;

import java.util.Arrays;

public class _05_Practice_searching_in_Array {
    public static void main(String[] args) {

        System.out.println("__________Task1___________");

        String[] objects = {"Remote","Mouse","Mouse","Keyboard","IPad"};

        boolean contains = false;

        for(int i = 0; i < objects.length; i++){
            if (objects[i].equals("Mouse")) {
                contains = true;
                break;
            }
        }
        System.out.println(contains);

        System.out.println("__________Task2___________");

        boolean isBoard = false;

        for(String object : objects){
            if(object.equals("board")){
              isBoard = true;
              break;
            }
        }
        System.out.println(isBoard);

        System.out.println("__________Task3___________");

        boolean hasIpad = false;

        Arrays.sort(objects);

        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); // returns int 4 // if u put >= 0 true
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); // returns int 2 // returns true
        System.out.println(Arrays.binarySearch(objects, "Apple") >= 0); // returns int -1 // returns false

        System.out.println("__________Task4___________");

       /* TASK-4
        Create an int array to store below data
        {5, -2, 0, -7, 0, 5, 8, 45, 53}

        Check if collection has 5
        Check if collection has 0
        Check if collection has 45
        Check if collection has 3

        RESULT:
        true
        true
        true
        false*/

        int[] task4 = {5, -2, 0, -7, 0, 5, 8, 45, 53};

        Arrays.sort(task4);

        System.out.println(Arrays.binarySearch(task4, 5) >= 0);
        System.out.println(Arrays.binarySearch(task4, 0) >= 0);
        System.out.println(Arrays.binarySearch(task4, 45) >= 0);
        System.out.println(Arrays.binarySearch(task4, 3) >= 0);
        System.out.println(Arrays.binarySearch(task4, -7) >= 0);







 }
}

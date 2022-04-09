package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String[][]  studentGroups = {
                {"Kaly", "Guluzar", "Melda"},
                {"Torrie", "David"},
                {"Abe","Data"}
                };

        System.out.println(studentGroups[0][1]);
        System.out.println(studentGroups[1][0]);
        System.out.println(studentGroups[1][1]);


        //How to get the size of studentsGroup

        System.out.println(studentGroups.length); //3 (3 groups inside this 2dimensional array)
        System.out.println(studentGroups[1].length);  //2
        System.out.println(Arrays.toString((studentGroups[2])));

        System.out.println(Arrays.deepToString(studentGroups));

        for(int i = 0; i < studentGroups.length; i++) {
            System.out.println(Arrays.toString(studentGroups[i]));
        }

        for (String[] group : studentGroups){
            System.out.println(group);
        }

        for (int i = 0; i < studentGroups.length; i++){
           for(int j = 0; j < studentGroups[i].length; j++){
               System.out.println(studentGroups[i][j]);
           }
        }










    }
}

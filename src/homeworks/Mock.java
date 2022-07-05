package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Mock {

    public static int greatestNumber(int a, int b, int c) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(a, b, c));
        return set.last();
    }

    public static int smallestNumber(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        else if (b <= a && b <= c) return b;
        return c;
    }

    public static int middleNumber(int a, int b, int c) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(a, b, c));
        ArrayList<Integer> list = new ArrayList<>(set);
        return list.get(1);
    }

        /*
    Write a method that takes 3 int arguments and returns the middle number
    NOTE: 2 or 3 numbers being same is okay
    TEST DATA:
    3, 4, 5
    EXPECTED OUTPUT:
    4
     */

    public static int findMiddleOf3Numbers(int a, int b, int c){
        if(a == b || b == c) return b;
        else if(a == c) return a;

        int greatest = Math.max(a, Math.max(b, c));
        int smallest = Math.min(a, Math.min(b, c));

        if(a != greatest && a != smallest) return a;
        else if(b != greatest && b != smallest) return b;
        return c;
    }




}

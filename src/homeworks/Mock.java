package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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




}

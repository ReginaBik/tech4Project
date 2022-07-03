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



}

package stringMethods;

import java.util.Arrays;

public class _16_Split {
    public static void main(String[] args) {

        String s = "Banana is nice";

        String[] sSplitFromSpaces= s.split(" ");
        System.out.println(Arrays.toString(sSplitFromSpaces));


        String[] sSplitFromI = s.split("i");
        System.out.println(Arrays.toString(sSplitFromI));


        String[] sSplitFromA = s.split("a");
        System.out.println(Arrays.toString(sSplitFromA));


        String[] sSplitFromIs = s.split("is");
        System.out.println(Arrays.toString(sSplitFromIs));




    }
}

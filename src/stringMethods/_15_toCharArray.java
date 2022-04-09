package stringMethods;

import java.util.Arrays;

public class _15_toCharArray {
    public static void main(String[] args) {

        String s = "Java";
        char[] chars = s.toCharArray();

        System.out.println(Arrays.toString(s.toCharArray()));

        System.out.println(Arrays.toString("Hello".toCharArray())); // [H, e, l, l, o]

        int count = 0;

        for(char element : chars){
            if (element == 'a') count++;
        }
        System.out.println(count);














    }



}

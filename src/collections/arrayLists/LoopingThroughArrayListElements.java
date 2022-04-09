package collections.arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoopingThroughArrayListElements {
    public static void main(String[] args) {

        List<Character> chars = new ArrayList<>();
        chars.add('D');
        chars.add('A');
        chars.add('B');
        chars.add('C');
        System.out.println("My List before sort " + chars);
        Collections.sort(chars);
        System.out.println("My List before sort " + chars);

        System.out.println("Printing each element with fori loop");
        for(int i = 0; i < chars.size(); i++){
            System.out.println(chars.get(i));
        }

        for(Character element : chars){
            System.out.println(element);
        }




    }
}

package collectionsFramework;

import java.util.LinkedHashMap;

public class Exercise03_CountEachCharacterInAString {
    public static void main(String[] args) {

        // count each character in a string
        String word = "Chicago is a nice city";
        LinkedHashMap<Character, Integer> charCounts = new LinkedHashMap<>();
        for(Character c: word.toCharArray()){
            if(!charCounts.containsKey(c)) charCounts.put(c, 1);
            else{
             int count = charCounts.get(c);
             charCounts.put(c, count += 1);
            }
        }


    }
}

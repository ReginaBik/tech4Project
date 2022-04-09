package arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {

        System.out.println("____Task1____");
       /* Pseudocode
          1) we are given a string
          2) find how many words
          3)increment 4) 1 container
        */

        String s1 = "Today is tuesday";

        int countWords = 0;
       /* for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == ' ') countWords++;
        }
        System.out.println("There are " + (countWords + 1) + " words in this sentence");*/

        for (char c : s1.toCharArray()) {
            if (c == ' ') countWords++;
        }
        System.out.println(countWords + 1);
        String[] words = s1.split(" ");
        System.out.println(words.length);


        System.out.println("\n\n____Task2____");

        String s2 = "Some countries I visited were Argentina, Belgium, and Malta";

        String[] words2 = s2.split(" "); //first split it to each word

        int countA = 0;
        for (String k : words2) {

            if (k.charAt(0) == 'A' || k.charAt(0) == 'a')
                countA++;
        }
        System.out.println("There are " + countA + " words start with a");






    }
}

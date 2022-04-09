package homeworks;

public class Homework13Recap {
    public static void main(String[] args) {
        System.out.println("________Task2________");
        /*
         * PSEUDOCODE
         * 1) we are given an int Array
         * 2) find first positive number
         * 3) find first negative number
         * 4) increment 5)create 2 booleans
         */

        // boolean isPositiveFound = false;
        //boolean isNegativeFound = false;

        int pos = -1;
        int neg = 1;

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        for (int number : numbers) {
            if (pos != -1 && neg != 1) break;
            if (pos == -1 && number > 0) {
                pos = number;
            } else if (neg == 1 && number < 0) {
                neg = number;
            }
        }      System.out.println((pos != -1) ? "first positive number is " + pos : " pos was not found");
        System.out.println((neg != 1) ? "first negative number is " + neg : " negative was not found");


        System.out.println("\n\n________Task5________");

        /*
         * PSEUDOCODE
         * 1)we are given 2 int[] arrays
         * 2) find all matching element between 2 arrays
         * 3) increment 4)boolean 5) nested forEach loop*/

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        boolean isDuplicate = false;

        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if(numbers1[i] == numbers2[j]){
                    System.out.println(numbers1[i]);
                    isDuplicate = true;
                    break;
                }
                
            }
            
        } if(!isDuplicate) System.out.println("There is no matching elements");

        System.out.println("\n\n_______Task6_______");

        /*
         * Pseudocode
         * 1) we are given any String
         * 2) print out duplicated characters in a string
         * 3) nested loops? 4) increment*/

        String str1 = "baNanA";
        char[] chars = str1.toCharArray();
        String dupes = "";

        for(int i =0; i < str1.length() - 1; i++){
            for (int j = i + 1; j < str1.length(); j++) {
                if(str1.toLowerCase().charAt(i) == str1.toLowerCase().charAt(j) &&
                        !dupes.contains(str1.toLowerCase().substring(i, i + 1))){
                    dupes += str1.toLowerCase().charAt(i);
                    System.out.println(str1.charAt(i));
                    break;
                }

            }
        }

/*String str = "baNana";
String duplicates = ""; // inside container is a & n

for (int i = 0; i < str.length()-1; i++){ // i = 0; i < str.length()-1; --> outer loop must start at 0 to start checking from first element
    for (int j = i + 1; j < str.length(); j++){ // j = i + 1; j < str.length(); --> inner loop must start at the iteration(index) the outer is in plus 1
        if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) // checking if there's matching letters
                && !duplicates.contains("" + str.toLowerCase().charAt(i))){ //see below note
            duplicates += str.toLowerCase().charAt(i); // add to/update container when condition is met
            System.out.println(str.charAt(i)); // here not printing container but the original str
            break;
        }
    }
}
/* NOTE: a sign that a container is needed other than keywords "sum" and "count" is when a condition has already been meet and there
are other elements that also meets the same condition; the container tell it not to check that like-element anymore.
FOR THE ABOVE EXAMPLE: !duplicates.contains("" + str.toLowerCase().charAt(i)) --> HERE IS SAYING IF CONTAINER ALREADY HAS
THIS ELEMENT IN IT THEN DON'T ADD ANOTHER SIMILAR ELEMENT. */

        int firstEven = 1;
        int firstOdd = 0;

      //  find first odd and first even






    }
}


package stringMethods;

import utilities.StringHelper;

public class PracticeFindMiddle {
    public static void main(String[] args) {
        System.out.println(StringHelper.getMiddle("Kaly"));
        System.out.println(StringHelper.getMiddle("Taylor"));
        System.out.println(StringHelper.getMiddle("Alona"));

    /* if (str.length() % 2 == 0) { // ---> EVEN length string
        String middle = "" + str.charAt(str.length() / 2 - 1) + str.charAt(str.length() / 2);
        return middle;
    }return "" + str.charAt(str.length() / 2); // ---> ODD length string*/

    /* if(str.length() % 2 == 0) return "" + str.charAt(str.length()/2-1) + str.charAt(str.length()/2);
    return "" + str.charAt(str.length()/2); */

          //  return (str.length() % 2 == 0) ? "" + str.charAt(str.length()/2-1) + str.charAt(str.length()/2) :
           //         "" + str.charAt(str.length()/2);
    }
}

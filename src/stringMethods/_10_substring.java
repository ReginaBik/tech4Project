package stringMethods;

public class _10_substring {
    public static void main(String[] args) {

        /*
        * Method task - they are used to extract a substring from a larger string
        * - Non- static , and we call them with objects
        * -They are return type, and they return another String
        * There are 2 overloaded substring methods
        * 1. substring(int beginIndex)
        * this method takes begin index, and it extracts a substring starting from given index to the end
        * 2. substring(int beginIndex, int endIndex)
        * - This method will take 2 args to define which index to start and which index to stop to extract  a substring
        * NOTE: beginIndex is inclusive but endIndex is exclusive
               NOTE: if your beginIndex is equal to endIndex, then it will return empty string
               NOTE: if your beginIndex is less than endIndex, then it will throw StringIndexOutOfBoundsException
        * -*/
        String result = "About 3.520.000.000 results (0.82 seconds)";
       String num = result.substring(6, 19);
        System.out.println(num);

        //Find "()
        // "
        String hey = result.substring(28);
        System.out.println(hey);

        System.out.println("_______BE CREATIVE________");

        System.out.println(result.substring(result.indexOf('(')));
        System.out.println(result.substring(result.lastIndexOf('0')-1));
        System.out.println(result.substring(result.length()-14));
        System.out.println(result.substring(result.indexOf("results") + 8));
    }
}

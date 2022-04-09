package stringMethods;

public class _13_replace {
    public static void main(String[] args) {
        /*
        * Method case used to replace some values in String with another one
        * NOTE: it replaces all the occurrences
        * It is non-static
        * It is a return type and returns another string which is modified
        * */

        String p = "Can I can a can";
        System.out.println(p.replace("can", "xxx"));
        String s = "banana";

        // we can replace char with another character

        System.out.println(s.replace('a', '$'));




    }
}

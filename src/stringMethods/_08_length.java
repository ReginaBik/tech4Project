package stringMethods;

public class _08_length {
    public static void main(String[] args) {

        /*
        * Method Task is count the total number of characters in given String and return it as an int
        * - it is non-static method and can be called with object name
        * - It is a return type method, and it returns an int (total number of characters)
        * - IT DOESN'T take any arguments
        * - It is like human thinking
        *  */

        String city = "Chicago";
        System.out.println(city.length() + 3);

        String company = "TechGlobal";
        int size = company.length();
        System.out.println(size);
    }
}

package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Homework20 {

    /*-Create a method called hasLowerCase()
    -This method will take a String argument, and it will
    return boolean true if there is lowercase letter and false
    if it doesn’t.
    ___________Task1___________*/

    public static boolean hasLowerCase(String str) {
        boolean isLowerCase = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) isLowerCase = true;
            else isLowerCase = false;
        } return isLowerCase;
    }


    /*-Create a method called noZero()
    -This method will take one Integer ArrayList argument
     and it will return an ArrayList with all zeros removed
     from the original Integer ArrayList.
     ___________Task2___________*/

    public static ArrayList<Integer> noZero(ArrayList<Integer> arr) {
        ListIterator<Integer> it = arr.listIterator();
        while (it.hasNext() && it.next() == 0) {
            it.remove();
        }
        return arr;
    }




    /*-Create a method called numberAndSquare()
    -This method will take an int array argument and it will
    return a multidimensional array with all numbers
    squared.
    ___________Task3___________*/




    /*-Create a method called containsValue()
    -This method will take a String array and a String
    argument, and it will return a boolean. Search the
    variable inside of the array and return true if it exists in
    the array. If it doesn’t exist, return false.
    NOTE: Assume that array size is at least 1.
    NOTE: The method is case-sensitive
    ___________Task4___________*/

    public static boolean containsValue(String[] str, String s) {
        for (String s1 : str) {
            if (s.equals(s1)) return true;
        }
        return false;
    }


    /*-Create a method called reverseSentence()
    -This method will take a String argument and it will
    return a String with changing the place of every word.
    All words should be in reverse order. Make sure that there
    are two words inside the sentence at least. If there is no
    two words return “There is not enough words!”.
     ___________Task5___________*/

    public static String reverseSentence(String str) {
        String[] strArr = str.trim().split(" ");
        StringBuilder strNew = new StringBuilder();
        if (!str.trim().contains(" ")) return "There is not enough words!";
        for (int i = strArr.length - 1; i >= 0; i--) {
            strNew.append(strArr[i].toLowerCase() + " ");
        }
        return strNew.substring(0, 1).toUpperCase().concat(strNew.substring(1)).trim();
    }


    /*-Create a method called removeStringSpecialsDigits()
    -This method will take a String as argument, and it will
    return a String without the special characters or digits.
    NOTE: Assume that String length is at least 1.
    NOTE: Do not remove spaces.
      ___________Task6___________*/

    public static String removeStringsSpecialDigits(String str) {
        String result = "";
        for(char c : str.toCharArray()){
            if(Character.isWhitespace(c) || Character.isLetter(c)){
                result += c;
            }
        }
        return result;
    }



    /*-Create a method called removeArraySpecialsDigits()
    -This method will take a String array as argument, and
    it will return a String array without the special
    characters or digits from the elements.
    NOTE: Assume that array size is at least 1.
      ___________Task7___________*/

    public static String[] removeArraySpecialsDigits(String[] arr){
        for(int i = 0; i <= arr.length-1; i++){
            arr[i] = arr[i].replaceAll("[^A-Za-z]", "");
        }
        return arr;
    }



    /*-Create a method called removeAndReturnCommons()
    -This method will take two String ArrayList and it will
    return all the common words as String ArrayList.
    NOTE: Assume that both ArrayList sizes are at least 1.
      ___________Task8___________*/





    /*-Create a method called noXInVariables()
    -This method will take an ArrayList argument, and it will
    return an ArrayList with all the x or X removed from
    elements.
    If the element itself equals to x or X or contains only x
    letters, then remove that element.
    NOTE: Assume that ArrayList size is at least 1.
      ___________Task9___________ */

   /* public static ArrayList<String> noXInVariables2(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).toLowerCase().contains("x")){
                arrayList.set(i, arrayList.get(i).replaceAll("[xX]", ""));
            }
        }
        arrayList.removeIf(String::isEmpty);
        return arrayList;
    }*/ //Akin's solution









    public static void main(String[] args) {
        System.out.println("\nTask1\n");
        System.out.println(Homework20.hasLowerCase("hello"));

        System.out.println("\nTask2\n");
        System.out.println(noZero(new ArrayList(Arrays.asList(0, 5, 4, 0, 0))));
        System.out.println("\nTask3\n");

        System.out.println("\nTask4\n");
        System.out.println(containsValue(new String[]{"abc", "def", "123"}, "Abc"));
        System.out.println(containsValue(new String[]{"abc", "def", "123", "java", "hello"}, "123"));

        System.out.println("\nTask5\n");
        System.out.println(reverseSentence("Java is fun"));

        System.out.println("\nTask6\n");
        System.out.println(removeStringsSpecialDigits("123Java #$%is fun"));
        System.out.println(removeStringsSpecialDigits("Selenium"));
        System.out.println(removeStringsSpecialDigits("Selenium 123#$%Cypress"));


        System.out.println("\nTask7\n");
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123$%", "###"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123#$%Cypress"})));



        System.out.println("\nTask8\n");

      /*  System.out.println("\nTask9\n");
        ArrayList<String> noXList = new ArrayList<>();
        noXList.add("xyl");
        noXList.add("abc");
        noXList.add("123");

        System.out.println(noXInVariables2(new ArrayList<>(noXList)));*/
    }
}

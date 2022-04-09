package projects;

import java.util.ArrayList;
import java.util.Iterator;

public class Project08 {

    //Task-1
    public static int countMultipleWords(String[] arr) {
        int countWord = 0;
        for (String element : arr) {
            if (element.trim().contains(" ")) countWord++;
        }
        return (countWord);
    }

    //Task-2
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer element : numbers) {
            if (element >= 0) newList.add(element);
        }
        return newList;
    }


    //option 2 with Iterator by Kaly

    public static ArrayList<Integer> removeNegativeNumbers(ArrayList<Integer> numbers) {
        Iterator<Integer> queue = numbers.iterator(); // I put all elements in a queue

        while (queue.hasNext()) { // We are asking if there is an element in the queue
            Integer element = queue.next(); // this gets an element from the queue
            if (element < 0) { // if element came from the queue is less than 0
                queue.remove(); // Remove
            }
        }

        return numbers;
    }


    public static boolean validatePassword(String pass) {
        boolean passwordValid = false;
        if (!pass.isEmpty() && (pass.length() >= 8 && pass.length() <= 16)) {
            for (int i = 0; i < pass.length(); i++) {
                if (!(Character.isWhitespace(pass.charAt(i)) && Character.isDigit(pass.charAt(i))
                        && Character.isUpperCase(pass.charAt(i)) && Character.isLowerCase(pass.charAt(i)))) {
                }if((!(Character.isLetterOrDigit(pass.charAt(i)))))
                    passwordValid = true;
            }
            return passwordValid;
        }return false;
    }




    public static void main(String[] args) {
        String[] arr = {"foo", " "  , " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(arr));

        ArrayList<Integer> test1= new ArrayList<>();
        test1.add(2);
        test1.add(-5);
        test1.add(6);
        test1.add(7);
        test1.add(-10);
        test1.add(-78);
        test1.add(0);
        test1.add(15);

        System.out.println(removeNegativeNumbers(test1));

        String password1 = "";
        String password2 = "abcd";
        String password3 = "abcd1234";
        String password4 = "Abcd1234";
        String password5 = "Abcd123!";


        System.out.println(validatePassword(password1));
        System.out.println(validatePassword(password2));
        System.out.println(validatePassword(password3));
        System.out.println(validatePassword(password4));
        System.out.println(validatePassword(password5));

    }
}

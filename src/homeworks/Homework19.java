package homeworks;

public class Homework19 {

        /*Requirement:
    -Create a method called noDigit()
    -This method will take one String argument and it will
    return a new String with all digits removed from the
    ”        _______Task 1________*/

    public static String noDigit(String str){

        return str.replaceAll("[0-9]", "");
    }
    /*_______Task 1.1________ */
/*
    public static String withoutDigits(String str) {
        String noDigString = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= 48) && !(str.charAt(i) <= 57)) noDigString = noDigString + str.charAt(i);
        }
        return noDigString;
    }*/

       /* -Create a method called noVowel()
    -This method will take one String argument and it will
    return a new String with all vowels removed from the
        original String
        _______Task 2________ */

    public static String noVowel(String str){
        return str.toLowerCase().replaceAll("[aeouiy]", "");
    }

        /* -Create a method called sumOfDigits()
        -This method will take one String argument and it will return an int sum
        of all digits from the original String.
          _______Task 3________ */

    public static int sumOfDigits(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))) sum += Integer.parseInt("" + str.charAt(i));
        }
        return sum;
    }

        /*-Create a method called hasUpperCase()
    -This method will take one String argument and it will return boolean
    true if there is an uppercase letter and false otherwise.
    _______Task 4________ */

    public static boolean hasUpperCase(String str){
        boolean hasUpper = false;
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))) hasUpper = true;
        }
        return hasUpper;
    }

   /*-Create a method called middleInt()
     -This method will take three int arguments and it will return the middle
     int.
     _______Task 5________ */

    public static int middleInt(int a, int b, int c){
        int middle;
        if (a == b && b == c) return a;
        else if (a == b || a == c) return a;
        else if (b == c) return b;
        else {
            if (a != Math.max(Math.max(a, b),c) && a != Math.min(Math.min(a, b), c)) middle = a;
            else if (b != Math.max(Math.max(a, b),c) && b != Math.min(Math.min(a, b), c)) middle = b;
            else middle = c;
        }
        return middle;
    }


 public static void main(String[] args) {
        System.out.println("Task1\n");
        System.out.println(Homework19.noDigit("hdhhd222"));

        System.out.println("\nTask2\n");
        System.out.println(Homework19.noVowel("afaniusetayusn"));

        System.out.println("\nTask3\n");
        System.out.println(Homework19.sumOfDigits("h2mk2m4"));

        System.out.println("\nTask4\n");
        System.out.println(Homework19.hasUpperCase("kiLot"));

        System.out.println("\nTask4\n");
        System.out.println(Homework19.middleInt(5, 2, 45));



    }

}

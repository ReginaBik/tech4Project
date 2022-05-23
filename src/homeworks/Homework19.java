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
      _______Task 2________ */

    public static int sumOfDigits(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))) sum += Integer.parseInt("" + str.charAt(i));
        }
        return sum;
    }








    public static void main(String[] args) {
        System.out.println("Task1\n");
        System.out.println(Homework19.noDigit("hdhhd222"));

        System.out.println("\nTask2\n");
        System.out.println(Homework19.noVowel("afaniusetayusn"));

        System.out.println("\nTask3\n");
        System.out.println(Homework19.sumOfDigits("h2mk2m4"));
    }

}

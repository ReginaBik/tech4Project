package homeworks;

public class Homework19 {

    /*Requirement:
-Create a method called noDigit()
-This method will take one String argument and it will
return a new String with all digits removed from the
”        _______Task 1.0________*/

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

    public static void main(String[] args) {
        System.out.println(Homework19.noDigit("hdhhd222"));


    }


}

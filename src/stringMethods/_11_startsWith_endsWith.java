package stringMethods;

public class _11_startsWith_endsWith {
    public static void main(String[] args) {



        String str = "Today is Sunday";
        System.out.println(str.startsWith("Today")); // true
        System.out.println(str.startsWith("today"));//false
        System.out.println(str.endsWith("day"));
        System.out.println(str.toUpperCase().endsWith("day"));


    }
}

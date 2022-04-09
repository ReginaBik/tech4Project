package loops;

import utilities.ScannerHelper;

import java.util.Locale;

public class ReverseString {
    public static void main(String[] args) {

        String name1 = ScannerHelper.getANameFromUser();

        for(int i = name1.length()-1; i >= 0; i--){
            System.out.print(name1.charAt(i));
        }

        //reverse the name

       String s = ScannerHelper.getANameFromUser();
        int name = Integer.valueOf(s.length()-1);


        for(int i = name; i <= name && i >= 0; i-- ){
            if(i != 0) System.out.println(s.charAt( + i));
        }

       /* String hey = ScannerHelper.getANameFromUser();
       int i =  hey.length()-1;
        System.out.print("The reversed name is ");

        for(int i = hey.length()-1; i >= 0; i--){
            System.out.print(hey.charAt(i));
        }
        System.out.println("The reversed name to uppercase is ");

        System.out.print(hey.toUpperCase().charAt(i));*/


    }
}

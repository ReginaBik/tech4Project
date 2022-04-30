package date_ptactices;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your year of birth");

        int years = input.nextInt();
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        Integer.parseInt(dateFormat.format(date));


        System.out.println("You are " + (Integer.parseInt(dateFormat.format(date)) - years) + " years old.");

       // SimpleDateFormat sdf = new SimpleDateFormat("yyyy");



    }
}

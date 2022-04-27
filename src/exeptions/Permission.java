package exeptions;

import com.sun.org.apache.bcel.internal.generic.ExceptionThrower;

import java.util.Scanner;

public class Permission {

  /*  public static void checkAge(int age){
        if(age >= 16){
            System.out.println("It is allowed to have driving license");

        } else System.out.println(ExceptionThrower.class + "Age of " + age + " is not allowed to have driving license");
    }

    public static void main(String[] args) {
        Permission.checkAge(15);
    }*/
        /*
    Create a method that checks the age of user, takes an argument int age
    if age is more than 16, "it is allowed to have driver licence"
    if the age is less than 16, the method will throw an exception
    "Age of {age} is not allowed to have driver licence"
     */

    public static void checkAge(int age){
        if(age >= 16) System.out.println("it is allowed to have driver licence");
        else throw new RuntimeException("Age of " + age + " is not allowed to have driver licence");
    }


    public static void checkIn(int day){
        if(day == 1 || day == 7) System.out.println("if it is weekend user is allowed to check in 10 AM to 3 PM");
        else if(day >= 2 && day <= 6) System.out.println("if it is weekday user is allowed to check in from 10 AM to 5 PM");
        else throw new RuntimeException("\"The input does not represent any day!!!\"");
    }


    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user! Please enter your age?");
        int age = scan.nextInt();

        try{
            checkAge(age);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Your age is = " + age);
        }

        System.out.println("End of the program");


    }
}

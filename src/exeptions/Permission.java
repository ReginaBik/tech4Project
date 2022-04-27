package exeptions;

import com.sun.org.apache.bcel.internal.generic.ExceptionThrower;

import java.util.Scanner;

public class Permission {

    public static void checkAge(int age){
        if(age >= 16){
            System.out.println("It is allowed to have driving license");

        } else System.out.println(ExceptionThrower.class + "Age of " + age + " is not allowed to have driving license");
    }

    public static void main(String[] args) {
        Permission.checkAge(15);
    }

    }


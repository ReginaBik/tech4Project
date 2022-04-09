package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);
        System.out.println(car1.getClass());

        car1.make = "Tesla";
        car1.model = "S";
        car1.year = 2022;
        car1.color = "Red";

        System.out.println(car1.model);
        System.out.println(car1.make);
        System.out.println(car1.year);
        System.out.println(car1.color);

        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        car4.make = "Tesla";
        car4.model = "X";
        car4.year = 2001;

        List<Car> myCars = new ArrayList<>();
        myCars.add(car1);
        myCars.add(car2);
        myCars.add(car3);

        for (Car myCar : myCars){
            if(myCar.make.equals("Tesla")) System.out.println(myCar);
        }










    }
}

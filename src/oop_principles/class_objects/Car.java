package oop_principles.class_objects;

public class Car {
    public Car(){

    }
    public int year;
    public String model;
    public String make;
    public String color;
    public double price;

    // override toString() method
    // that comes from Object class

    @Override // override annotation
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


}

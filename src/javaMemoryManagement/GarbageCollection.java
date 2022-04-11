package javaMemoryManagement;

public class GarbageCollection {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        System.out.println("\n object references before loosing reference");

        System.out.println(dog1);//Dog@1540e19d
        System.out.println(dog2);//Dog@677327b6

        System.out.println("\n object references after loosing reference");

        dog1 = dog2; // dog1 is loosing reference here and Garbage collected (the object gets deleted from heap)
        // but you can explicitely get a method that shows "killed object"

        System.out.println(dog1);//Dog@677327b6
        System.out.println(dog2);//Dog@677327b6

        System.gc();
        Runtime.getRuntime().gc();




    }
}

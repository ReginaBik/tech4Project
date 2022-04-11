package javaMemoryManagement;

public class UnderstandingStackAndHeap {
    public static void main(StringExample[] args) {

        int age = 45;
        System.out.println("age"); //45

        // reference - object type

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        System.out.println(dog1);

        dog1.breed = "puppy";
        dog1.age = 1;



    }
}

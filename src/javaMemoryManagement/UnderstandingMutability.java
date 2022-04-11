package javaMemoryManagement;

public class UnderstandingMutability {
    public static void main(String[] args) {

        String city = "Chicago";
        String address = "Chicago";

        System.out.println(city == address); // true but it is not a proper way to check
        System.out.println(city.equals(address));// true

        city = "Miami";

        System.out.println(city);
        System.out.println(address);







    }
}

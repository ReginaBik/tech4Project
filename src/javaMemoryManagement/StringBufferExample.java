package javaMemoryManagement;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer b = new StringBuffer("Hello");
        b.reverse();
        System.out.println(b);

        b.insert(0, "Hey ");

    }
}

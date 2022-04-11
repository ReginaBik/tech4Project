package javaMemoryManagement;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("John"); // Johnathan

        sb.append("athan");
        System.out.println(sb);

        sb.append("Hello", 0, 5);

        System.out.println(sb);

        sb.insert(2, "$$$");

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);





    }
}

package operators.incrementAndDecrementOperators;

public class Exercise1 {
    public static void main(String[] args) {
        int i = 5;
        int age = 10 * (i++); //50
        System.out.println(age);

        int b = 5;

        int age2 = 10 * (++b); //60
        System.out.println(age2);

    }
}

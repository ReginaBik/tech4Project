package ifElseStatemnets.swithStatements;

public class CharExample {
    public static void main(String[] args){
        char character = 'A';
        switch (character){
            case'A':
                System.out.println("It is a first letter in the alphabet");
                break;
            case '5':
                System.out.println("It is a number");
                break;
            case '$':
                System.out.println("It is a dollar sign");
                break;
            default:
                System.out.println("It is not A, 5, or dollar sign");
        }
        System.out.println("\nEnd of the program");


    }
}

package exeptions;

public class Exercise_01 {
    public static void main(String[] args) {
        String[] names = {"Alex", "John", "Max"};
       // System.out.println(names[-5]);

        try{
            System.out.println(names[-5]);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("\"An exception is here!!!!!\"");
        }




    }
}

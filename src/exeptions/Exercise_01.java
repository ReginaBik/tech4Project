package exeptions;

public class Exercise_01 {
    public static void main(String[] args) {
        String[] names = {"Alex", "John", "Max"};
       // System.out.println(names[-5]);

        try{
            System.out.println(names[-5]);
        }
        catch (Exception e){
            e.getCause();
        }

        System.out.println("End of the program!");




    }
}

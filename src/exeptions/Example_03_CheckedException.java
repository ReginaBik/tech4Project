package exeptions;

public class Example_03_CheckedException {
    public static void main(String[] args) {

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(2000);
                System.out.println(i);
            }
        } catch (Exception e){
            e.printStackTrace();
        }



    }
}

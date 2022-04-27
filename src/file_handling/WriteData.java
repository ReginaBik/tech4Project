package file_handling;

import java.io.File;

public class WriteData {
    public static void main(String[] args) {

        File myFile = new File("studentList.txt");

        try {

          Thread.sleep(5000);

            System.out.println(myFile.delete()); // true

        } catch (Exception e) {
            e.printStackTrace();
        }



        System.out.println("End of the program!");
    }
}

package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {
        /*
        Create a file called as studentList.txt
        After creating, put a wait for 5 seconds, and delete it
         */

        File file = new File("studentList.txt");

        try {
            file.createNewFile();
            Thread.sleep(5000);

            FileWriter fileWriter = new FileWriter("studentList.txt");
            fileWriter.write("Abe");
            fileWriter.write("Vita");
            fileWriter.write("Torrie");
            fileWriter.write("Taylor");
            fileWriter.close(); //saves the file




        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            file.delete();
        }

        System.out.println("End of the program!");
    }
}








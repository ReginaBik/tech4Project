package scanner;

import java.util.Scanner;
//important
public class LearningScannerMultipleLines {
    public static void main(String[] args){

        Scanner inputReader = new Scanner(System.in);

        //DataType variableName = data/value --> creating a variable
        //Datatype/ Classname variableName = new DataType/ClassName(If it is needed);
        //creating an object

        System.out.println("Where is your address?");

        String userAddress = inputReader.nextLine(); // objectName.methodName();

        System.out.println("User's address is = ".concat("\"" + userAddress +"\""));







    }
}

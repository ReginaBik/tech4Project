package learningObjects;

public class LearningConcatMethod {
    public static void main(String[] args){

        String tech = "Tech";
        String global = "Global";


        String schoolName1 = tech + global;
        String schoolName2 = tech.concat(global);

        System.out.println(schoolName1 + "\n" + schoolName2);

        System.out.println("\n\n\n\n\n");

        System.out.println("Kaly is sleeping. Kaly is coding. Kaly is eating");
        String studentName = "Kaly";
        System.out.println(studentName = "IS SLEEPING");

        String myActorsName = "Johny";
        String myActorsLastName = "Depp";

        String s3 = " " + myActorsLastName;

        String hisNameIs = myActorsName.concat(s3);

        System.out.println(hisNameIs);




    }
}

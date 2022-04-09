package loops.shapes;

public class Rectangle {
    public static void main(String[] args) {
     /*   System.out.println("* * * * * *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("* * * * * *");


        for (int i = 1; i <= 2; i++) {
            int start = 97;
            if(i == 1){
                //First iteration start point = 97 end = 122 = start+25
                System.out.println("Lowercase Letters");
            }
            else{
                //Second iteration start point = 65 end = 90
                System.out.println("Uppercase Letters");
                start = 65;
            }

            for (int j = start; j <= start+25; j++) {
                System.out.println((char)j);
            }
        }

        System.out.println("\n\n-----Separate Loops Solution-----\n");

        System.out.println("Lowercase letters");
        for (int i = 97; i <= 122; i++) {
            System.out.println((char)i);
        }

        System.out.println("Uppercase letters");
        for (int i = 65; i <= 90; i++) {
            System.out.println((char)i);
        }

        Syst */

    for(int o = 1; o <= 8; o++){
        if (o == 1 || o == 8)
            System.out.println("* * * * * *");
        else System.out.println("*         *");
    }



    }
}

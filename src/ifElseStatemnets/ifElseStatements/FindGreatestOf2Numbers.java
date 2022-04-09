package ifElseStatemnets.ifElseStatements;

public class FindGreatestOf2Numbers {
    public static void main(String[] args){
        int num1 =(int) (Math.random() * 11), num2 = (int) (Math.random()*11);

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("The greatest of " + num1 + " and "  + num2 + " is = " + Math.max(num1, num2));

        if(num1 > num2){
            System.out.println("The greatest is " + num1);
        }
        else{
            System.out.println("The greatest is " + num2);
        }
        // shortcut command statements
        if(num1 >= num2) System.out.println("The greatest is " + num1);
        else System.out.println("The greatest is " + num2);
        // we got rid of curly braces because ther is only one statement


        if(num1 >= num2) System.out.println("The greatest is " + num1);
        else {
            System.out.println("The greatest is " + num2);
            System.out.println("different result");
        }
        // we got rid of curly braces in if but left in else because there are 2 statements
    }



}

package stringMethods;

public class _06_charAt {
    public static void main(String[] args) {
        //Human reads starting from 1
        //Java reads starting from 0

        /*
        *  Method Task: It helps to get a character at a specific index
        NOTE: Index starts with zero
        -It is non-static as we call it with object name
        -It is a return type and returns char primitive
        -It takes an argument which is int (index)

        NOTE: It will throw StringIndexOutOfBoundsException when the given index is not in the bounds*/
        String name = "Taylor";

        System.out.println(name.charAt(2));//y
        //  System.out.println(name.charAt(-1)); //StringIndexOutOfBoundException

        System.out.println(name.charAt(5));//r
        //  System.out.println(name.charAt(6)); //StringIndexOutOfBoundException

        String name1 = "John";

        System.out.println(name1.charAt(0));
        System.out.println(name1.charAt(1));
        System.out.println(name1.charAt(2));
        System.out.println(name1.charAt(3));

        //  System.out.println(name1.charAt(-1));

        String name2 = "Alex";
        if (name2.charAt(0) == 'A')
            System.out.println("This name starts with A");
        else
            System.out.println("This name doesn't start with A");

        //or

        char firstChar = name2.charAt(0);

        if(firstChar == 65 || firstChar == 97)
            System.out.println("This name starts with A");
        else
            System.out.println("This name doesn't start with A");


    }
    }

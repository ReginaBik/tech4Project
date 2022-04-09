package arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        char[] chars = {'A', ' ', ',', '#', 'T', '6', '9'};
        System.out.println(chars.length);


        int index = 0;

        for (int i = 1; i < chars.length; i++){
            System.out.println( "Element " + i + " = " + chars[index]);
            index++;
        }





    }
}

package javaPractice;

public class Practice {

    //Reverse String different ways

    //StringBuilder (mutable)

    public static void reverseString(String str){
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--){
            reversed.append(str.charAt(i));
        }
        System.out.println(reversed);
    }

    //Regular String
    public static String reverseString2(String str){
        String reversed = "";
        for(int i = str.length()-1; i >=0; i--){
            reversed += str.charAt(i) + "";
        }
        return reversed;
    }

    public static void main(String[] args) {
        reverseString("Marzipan");
        System.out.println(reverseString2("Switzerland is gorgeous"));

    }


}

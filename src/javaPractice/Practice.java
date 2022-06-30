package javaPractice;

public class Practice {

    public static void reverseString(String str){
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--){
            reversed.append(str.charAt(i));
        }
        System.out.println(reversed.toString());
    }

    public static void main(String[] args) {
        reverseString("Marzipan");

    }
}

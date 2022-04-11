package javaMemoryManagement;

public class ReverseExercise {


        public static String reverse1(String str) {
            String r = "";
            for(int i = str.length() - 1; i >= 0; i++){
                r += str.charAt(i);
            }
            return r;
        }


    public static String reverse2(String str) {
        return new StringBuilder(str).reverse().toString();
        }



        public static boolean isPalindrome(String s){
            return s.equals(new StringBuilder(s).reverse().toString());
        }





}

package arrays;

public class ArrayMethod {

    public static int countPositives(int[] nums){
        int counter = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] > 0) counter++;
        }
        return counter++;
    }

    public static int coumtLetters(char[] chars){
        int counter = 0;
        for(int i = 0; i < chars.length; i++){
            if(Character.isLetter(chars[i])) counter++;
        }
        return counter;
    }






}

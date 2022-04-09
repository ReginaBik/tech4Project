package ifElseStatemnets.ifElseStatements;

public class Exercise1 {
    public static void main(String[] args) {

        int randomNumber1 = (int) ((Math.random() * 46) + 45);
        int randomNumber2 = (int) ((Math.random() * 46) + 45);
        int randomNumber3 = (int) ((Math.random() * 46) + 45);

        System.out.println(randomNumber1 + "\n" + randomNumber2 + "\n" + randomNumber3 + "\n" + "\nLargest number " +
                "is " + Math.max(Math.max(randomNumber1, randomNumber2), randomNumber3) +
                "\nSmallest number is " + Math.min(Math.min(randomNumber1, randomNumber2), randomNumber3));

        int min = Math.min(Math.min(randomNumber1, randomNumber2), randomNumber3);
        int max = Math.max(Math.max(randomNumber1, randomNumber2), randomNumber3);
        int mid = 0;

        if(randomNumber1 != max && randomNumber1 != min){
            mid = randomNumber1;
        }
        if(randomNumber2 != max && randomNumber2 != min){
            mid = randomNumber2;

        }
        if(randomNumber3 != max && randomNumber3 != min) {
            mid = randomNumber3;
        }
        System.out.println("Middle number is " + mid);
        }




}

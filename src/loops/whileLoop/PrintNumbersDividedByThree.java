package loops.whileLoop;

public class PrintNumbersDividedByThree {
    public static void main(String[] args) {

        //WHILE LOOP

        int k = 1;
        while(k <= 30){
            if(k % 3 == 0)
            System.out.println(k);
            k++;
        }

        //FOR LOOP

        for(int i = 1; i <= 30; i++){
            if (i % 3 == 0)  System.out.println(i);
        }






    }
}

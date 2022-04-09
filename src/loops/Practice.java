package loops;

public class Practice {
    public static void main(String[] args) {

        // for loops first

       for(int i = 1; i <= 100; i++ ){
            if (i % 3 != 0 && i % 2 != 0 )
                System.out.println(i);
        }

       // for while loop

       int k = 1;
        while(k < 101) {
            if ( k % 3 != 0 && k % 2 != 0)
                System.out.println(k);
                k++;
            }

        // for do while

        int count = 1;

        do{
            if( k % 3 != 0 && k % 2 != 0) System.out.println(count);
            count++;
        } while (count <= 100) ;








    }
}

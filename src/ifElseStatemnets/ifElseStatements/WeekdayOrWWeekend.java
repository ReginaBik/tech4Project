package ifElseStatemnets.ifElseStatements;
import java.util.Scanner;
public class WeekdayOrWWeekend {
    public static void main(String[] args) {
        // if it is weekend print out "it is weekend!"
        // else it is weekday
        Scanner hey = new Scanner(System.in);

        boolean isWeekend = true;
        boolean isWeekday = isWeekend != true;

        if(!isWeekday){
            System.out.println("It is weekend!");
        } else{

            System.out.println("It is weekday!");
        }
    }
}

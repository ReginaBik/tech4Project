package date_ptactices;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDateFormat {
    public static void main(String[] args) {

        Date currentDate = new Date();

        System.out.println(currentDate); //Sat Apr 30 10:13:49 CDT 2022

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Today is = " + sdf.format(currentDate));

        sdf = new SimpleDateFormat("EEE hh:mm a");
        System.out.println(currentDate);

        System.out.println(new SimpleDateFormat("EEEE").format(currentDate));
        System.out.println(new SimpleDateFormat("yyyy").format(currentDate));

                /* We can format the date using SimpleDateFormat class and get below formats:
        yyyy-MM-dd     -> 2021-07-15
        MM/dd/yyyy     -> 07/15/2021
        dd-MMM-yyyy        ->     15-Jul-2021
        E, MMM dd yyyy -> Thu, Jul 15 2021
        hh:mm:ss a     -> 08:33:27 PM
        h:mm a            ->     8:37 PM
        EEE           ->     Thu
        EEEE          ->     Thursday
        */



    }
}


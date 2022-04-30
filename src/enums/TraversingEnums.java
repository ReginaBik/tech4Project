package enums;

public class TraversingEnums {
    public static void main(String[] args) {
        for(Day day : Day.values()){
            System.out.println(day);
        }

        for(Constants.Months month : Constants.Months.values()){
            System.out.println(month);
        }


    }
}

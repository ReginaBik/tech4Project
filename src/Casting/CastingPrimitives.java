package Casting;

public class CastingPrimitives {
    public static void main(String[] args) {
        // double > float > long > int >= char >= short > byte

        int myInt = 32;
        long myLong = myInt; // implicit casing (automatic happens from smaller to bigger primitive)

        myInt = (int) myLong;  //explicit casting (you do it automatic fromm bigger data for smaller)


        int mySecondInt = 'B'; // implicit casting
        char myChar = (char) 56; // u don't have to cast
        char mySecondChar = 56;


        int myThirdInt = (int) 45.4; // say the data type you want to convert not the other one
        short myShort = (short) myChar;
        char myThirdChar = (char) myShort;

        byte num1 = 45;
        int num2 = num1; //implicit

        double num3 = 13.6;
        float num4 = (float) num3;

        int num5 = 45;
        short num6 = 34;

       // char c = 45;
       // char c = -45; //
        // we can not do it because it haqs negative. to make it right u have to convert it char c = char(-45)

        char c = (char) num5;
        c  = (char) num6;





    }
}

package projects;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("\nTask 1\n");

        String s1 = "24", s2 = "5";

        int str1 = Integer.parseInt(s1), str2 = Integer.parseInt(s2);
        double dob1 = Double.parseDouble(s1), dob2 = Double.parseDouble(s2);

        System.out.println("\nThe sum of " + str1 + " and " + str2 + " = " + (str1 + str2) +
                "\nThe subtraction of " + str1 + " and " + str2 + " = " + (str1 - str2) +
                "\nThe division of " + str1 + " and " + str2 + " = " + (dob1 / dob2) +
                "\nThe multiplication of " + str1 + " and " + str2 + " = " + (str1 * str2) +
                "\nThe remainder of " + str1 + " and " + str2 + " = " + (str1 % str2));

        ////////////////////////////////////

        System.out.println("\nTask 2\n");

        int random = (int) ((Math.random() * 35) + 1);
        System.out.println("Random number = " + random);

        if ((random == 2) || (random == 3)) System.out.println("THE NUMBER IS A PRIME NUMBER");
        else if ((random == 5) || (random == 7)) System.out.println("THE NUMBER IS A PRIME NUMBER");
        else if ((random == 11) || (random == 13)) System.out.println("THE NUMBER IS A PRIME NUMBER");
        else if ((random == 17) || (random == 19)) System.out.println("THE NUMBER IS A PRIME NUMBER");
        else if ((random == 23) || (random == 29)) System.out.println("THE NUMBER IS A PRIME NUMBER");
        else if (random == 31) System.out.println("THE NUMBER IS A PRIME NUMBER");
        else System.out.println("THE NUMBER IS NOT A PRIME NUMBER");

        ////////////////////////////////////

        System.out.println("\nTask 3\n");

        int randomNumber1 = (int) ((Math.random() * 50) + 1), randomNumber2 = (int) ((Math.random() * 50) + 1),
                randomNumber3 = (int) ((Math.random() * 50) + 1);
        System.out.println("Random number 1 is = " + randomNumber1 +
                "\nRandom number 2 is = " + randomNumber2 + "\nRandom number 3 is = " + randomNumber3);


        int min = (int) Math.min(Math.min(randomNumber1, randomNumber2), randomNumber3);
        int max = (int) Math.max(Math.max(randomNumber1, randomNumber2), randomNumber3);

        System.out.println("Lowest number is = " + min);

        if (randomNumber1 != min && randomNumber1 != max) System.out.println("Middle number is = " + randomNumber1);
        else if (randomNumber2 != min && randomNumber2 != max)
            System.out.println("Middle number is = " + randomNumber1);
        else System.out.println("Middle number is = " + randomNumber3);
        System.out.println("Greatest number is = " + max);


        ////////////////////////////////////

        System.out.println("\nTask 4\n");

        char c = ' ';
        // example: char c = 'a';  // char c = 'B'; // char c = '#';

        if (c >= 65 && c <= 90) {
            System.out.println("The Character is uppercase!");
        } else if (c >= 97 && c <= 122) {
            System.out.println("The character is LOWERCASE!");
        } else {
            System.out.println("Invalid character detected!");
        } //???????


        /* For capital alphabets 65 – 90
        For small alphabets 97 – 122
        For digits 48 – 57*/

        ////////////////////////////////////

        System.out.println("\nTask 5\n");

        char a = ' ';
        //example: char a = 'a';  //char a = '!'; // char a = 'T';

        /*  correct way
        * if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
        * switch (c){
        * case 'a':
        * case 'e':
        * case '105': //i
        * case '11':.....
        * Sout (The letter is vowel)
        * break;
        * default:
        * sout(The letter is consonant)}
        * }*/

        if (a >= 65 && a <= 90 || a >= 97 && a <= 122) {
            if (a == 97 || a == 101 || a == 73 || a == 111 || a == 117 || a == 65 ||
                    a == 69 || a == 73 || a == 79 || a == 85)
                System.out.println("The letter is vowel");
            else
                System.out.println("The letter is consonant!");
        } else {
            System.out.println("Invalid character detected!");
        }


        ////////////////////////////////////

        System.out.println("\nTask 6\n");

        char character = '*'; // char character = 8;

        //Special Characters (32–47 / 58–64 / 91–96 / 123–126)

        if ((character >= 32 && character <= 47) || (character >= 58 && character <= 64) ||
                (character >= 91 && character <= 96) || (character >= 123 && character <= 126))
            System.out.println("Special character is = " + character);
        else System.out.println("invalid character detected!!!");



        ////////////////////////////////////

        System.out.println("\nTask 7\n");

        char task7Char = '*'; // char task7Char = n; char task7Char = 9;

        if ((task7Char >= 32 && task7Char <= 47) || (task7Char >= 58 && task7Char <= 64) ||
                (task7Char >= 91 && task7Char <= 96) || (task7Char >= 123 && task7Char <= 126))
            System.out.println("Character is a special character");
        else if ((task7Char >= 65 && task7Char <= 90) || (task7Char >= 97 && task7Char <= 122))
            System.out.println("Character is a letter");
        else if (task7Char >= 48 && task7Char <= 57)
            System.out.println("Character is a digit");
    }

}

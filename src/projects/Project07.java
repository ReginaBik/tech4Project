package projects;

import java.util.Arrays;

public class Project07 {
    /////////////////////////1////////////////////////

    public static void greatestSmallestSort(int[] n) {
        Arrays.sort(n);
        System.out.println("Smallest = " + n[0]);
        System.out.println("Greatest = " + n[n.length - 1]);
    }


        //////////////////////2///////////////////////////

        public static void greatestSmallestNoSort(int[] nums){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int num : nums) {
                if(num > max) max = num;
                if(num < min) min = num;

            }
            System.out.println("Greatest is = " + max);
            System.out.println("Smallest is = " + min);
        }

        ///////////////////////3//////////////////////////

        public static void secondGreatestAndSmallestSort(int[] numbers){
            Arrays.sort(numbers);
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int number : numbers) {
                if (number != numbers[numbers.length - 1] && number > max)
                    max = number;
                if (number != numbers[0] && number < min)
                    min = number;


            }
             System.out.println("Second greatest number is " + max);
             System.out.println("Second smallest number is " + min);
        }

        ///////////////////////4//////////////////////////

        public static void secondGreatestAndSmallestNoSort(int[] numbers) {
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;

            for (int num : numbers) {
                if (num > max) max = num;
                if (num < min) min = num;
            }
            for (int numb : numbers) {
                if (numb > secondMax && numb != max) secondMax = numb;
                if (numb < min2 && numb != min) min2 = numb;
            }
            System.out.println("Second greatest number is " + secondMax);
            System.out.println("Second smallest number is " + min2);
        }



        ///////////////////////5//////////////////////////

    public static void findDuplicate(String[] str){
        String s = "";
        for(int i = 0; i < str.length - 1; i++){
            for (int j = i + 1; j < str.length; j++) {
                if(str[i].equals(str[j])) s = str[i];


            }
        }
        System.out.println(s);

    }  //it only prints 6

    ///////////////////////6//////////////////////////




    }







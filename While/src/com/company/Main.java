package com.company;

public class Main {

    public static void main(String[] args) {

        int i = 4;
        int count = 0;
        int total = 0;

        while (i<20){

            i ++;

            if (!isEvenNumber(i)) {

                continue;
            }

            System.out.println(i);
            total += i;
            count ++;

            if (count == 5) {

                break;
            }
        }

        System.out.println("The sum is " + total);
        System.out.println("The total number of found even number is " + count);

    }

    public static boolean isEvenNumber (int number) {

        if (number % 2 == 0) {

            return true;
        } else {

            return false;
        }
    }


}

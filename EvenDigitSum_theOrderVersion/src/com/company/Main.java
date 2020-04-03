package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(1235));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum (int number) {

        //1235

        int count = 1;
        int temp = 0;

        if (number < 0) {

            return -1;
        } else {

            while (number > 0) {

               if (count % 2 == 0) {

                   temp += number % 10;
               }
               count++;
               number /= 10;

            }
        }

        return temp;
    }
}

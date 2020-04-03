package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum (int number) {

        int temp = 0;
        int total = 0;

        if (number < 0) {

            return -1;
        } else {

            while (number > 0) {

                temp = number % 10;

                if (temp % 2 == 0) {

                    total += temp;
                }

                number /= 10;

            }
        }

        return total;
    }
}

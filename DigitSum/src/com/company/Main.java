package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-6));
        System.out.println(sumDigits(686868));

    }

    public static int sumDigits (int number) {

        int temp = 0;

        if (number < 10) {

            return -1;
        } else {

            while (number > 0) {

                temp += number % 10;
                number /= 10;
            }
        }

        return temp;
    }
}

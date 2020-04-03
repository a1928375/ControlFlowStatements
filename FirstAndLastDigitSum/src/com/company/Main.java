package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(125));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit (int number) {

        //125
        //0

        int last = number % 10;

        if (number < 0) {

            return -1;
        } else if (number > 0 && number < 10) {

            return number + number;

        } else {

            while (number > 0) {

                number /= 10;

                if (number < 10) {
                    break;
                }
            }

        return last + number;

        }
    }
}

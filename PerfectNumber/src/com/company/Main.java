package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber (int number) {

        int i = 1;
        int total = 0;

        if (number < 1) {

            return false;
        } else {

            while (i < number) {

                if (number % i == 0) {

                    total += i;
                }

                i++;
            }

            if (total == number) {
                return true;
            } else {

                return false;
            }
        }
    }
}

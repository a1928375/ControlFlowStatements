package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 2; i <= 8; i++) {

            System.out.println(calculation(10000, i));
        }

        for (int i = 8; i >= 2; i--) {

            System.out.println(calculation(10000, i));
        }

    }

    public static double calculation (double amount, double interest) {

        return (amount * (interest/100));
    }
}

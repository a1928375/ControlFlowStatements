package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(125));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(-1221));

    }

    public static boolean isPalindrome (int number) {

        int last = 0;
        int reverse = 0;
        int n = number;

        //125

        while (n != 0) {

            last = n % 10;

            reverse *= 10;

            reverse += last;

            n /= 10;

        }

        if (reverse == number) {

            return true;
        } else {

            System.out.println(reverse);
            return false;
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(12,43));

    }

    public static boolean hasSharedDigit (int first, int second) {

        // 12  &  23

        int firstTwo = first % 10;
        int firstOne = first / 10;
        int secondTwo = second % 10;
        int secondOne = second / 10;

        if (first < 10 || first > 99 || second < 10 || second > 99) {

            return false;
        } else if (firstOne == secondOne || firstOne == secondTwo || firstTwo ==  secondOne || firstTwo == secondTwo) {

            return true;
        }

        return false;
    }
}

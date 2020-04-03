package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));

    }

    public static boolean hasSameLastDigit (int first, int second, int third) {

        int firstLast = first % 10;
        int secondLast = second % 10;
        int thirdLast = third % 10;

        if (first < 10 || first > 1000  || second < 10 || second > 1000 || third < 10 || third > 1000) {

            return false;
        } else if (firstLast == secondLast || firstLast == thirdLast || secondLast == thirdLast) {

            return true;
        } else {

            return false;
        }
    }

    public static boolean isValid (int parameter) {

        if (parameter >= 10 && parameter <= 1000) {

            return true;
        } else {

            return false;
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2100));

        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));
        System.out.println(getDaysInMonth(2,2000));
        System.out.println(getDaysInMonth(2,2100));
        System.out.println(getDaysInMonth(3,2000));
        System.out.println(getDaysInMonth(6,2100));

    }

    public static boolean isLeapYear (int year) {

        if (year < 1 || year > 9999) {

            return false;
        } else if (year % 400 == 0) {

            return true;
        } else if (year % 100 == 0) {

            return false;
        } else if (year % 4 == 0) {

            return true;
        } else {

            return false;
        }
    }

    public static int getDaysInMonth (int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {

            return -1;
        } else if (isLeapYear(year) == true && month == 2) {

            return 29;

        } else {

            switch (month) {

                case 1:
                    return 31;

                case 2:
                    return 28;

                case 3:
                    return 31;

                case 4:
                    return 30;

                case 5:
                    return 31;

                case 6:
                    return 30;

                case 7:
                    return 31;

                case 8:
                    return 31;

                case 9:
                    return 30;

                case 10:
                    return 31;

                case 11:
                    return 30;

                case 12:
                    return 31;

                default:
                    return -1;

            }
        }
    }
}


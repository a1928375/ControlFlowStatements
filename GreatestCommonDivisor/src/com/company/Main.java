package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
        System.out.println(getGreatestCommonDivisor(1010,10));

    }

    public static int getGreatestCommonDivisor (int first, int second) {

        int i = 1;
        int temp = 1;

        if (first < 10 || second < 10) {

            return -1;
        } else if (first > second) {

            while (i <= second) {

                if (first % i == 0 && second % i ==0) {

                    temp = i;
                }
                i++;
            }

        } else if (second > first) {

            while (i <= first) {

                if (first % i == 0 && second % i ==0) {

                    temp = i;
                }
                i++;
            }
        }

        return temp;
    }
}

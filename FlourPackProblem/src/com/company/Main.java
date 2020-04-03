package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(1,0,6));

    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {

        int big = 5;
        int small = 1;
        int bigTotal = big * bigCount;
        int smallTotal = small * smallCount;
        int i = 0;
        int j = 0;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {

            return false;
        }

        while (i<=bigCount) {

            if (i * big == goal || (i*big + j*small == goal) || j*small == goal) {

                return true;
            }
            while (j <= smallCount) {

                if ((i*big + j*small == goal) || j*small == goal) {

                    return true;
                }

                j++;
            }

            j = 0;

            i++;
        }

        return false;
    }
}

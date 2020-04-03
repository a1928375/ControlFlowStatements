package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime (int number) {

        int i = 2;
        int j = 2;
        int temp = 2;
        int tempBefore;

        if (number < 2) {

            return -1;
        }

        while (i <= number) {

            if (number % i == 0) {

                tempBefore = temp;

                while (j < i) {

                    if (i % j == 0) {

                        temp = tempBefore;   //恢復機制

                        break;
                    }

                    j++;
                    temp = i;
                }

            }

            j = 2;
            i++;
        }

        return temp;
    }
}

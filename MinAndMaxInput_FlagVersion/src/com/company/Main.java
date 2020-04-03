package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        boolean first = true;                        //as a flag to express the condition

        while (true) {

            System.out.println("Enter number:");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {

                int temp = scanner.nextInt();

                if (first) {                         //excellent & clever => determine whether it's the first run or not

                    max = temp;
                    min = temp;
                    first = false;
                }

                if (temp >= max) {                 //因為有flag來判斷1st run => 所以之後的 temp (也就是input data) 一定是   大於max       or       小於min       or  介在max & min 之間
                                                   // 可以用if-else statement來判斷
                    max = temp;

                } else if (temp <= min) {

                    min = temp;

                }

                scanner.nextLine();

            } else {

                break;
            }
        }
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);
        scanner.close();
    }

}

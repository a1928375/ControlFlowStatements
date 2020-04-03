package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {

            System.out.println("Enter number:");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {

                int temp = scanner.nextInt();

                if (temp > max) {                          //因為沒有flag來判斷1st run
                                                           //因為不能判斷是不是1st run，再加上直接寫成if-else statement (只會判斷一次)
                                                          // 所以會有一邊無法判斷到 => 一直由max邊判斷  or   一直由min邊判斷  => wrong
                    max = temp;

                } else if (temp < min) {

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

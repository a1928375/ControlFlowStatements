package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage () {

        int sum = 0;
        int count =0;
        boolean first = true;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            boolean hasInt = scanner.hasNextInt();

            if (hasInt) {

                first = false;
                int number = scanner.nextInt();

                sum += number;
                count ++;

            } else if (!hasInt && first == true) {

                System.out.println("SUM = 0 AVG = 0");
                break;

            } else {

                break;
            }

            scanner.nextLine();
        }

        if (!first) {

            System.out.println("SUM = " + sum + " AVG = " +  Math.round((double) sum/count));
        }
        scanner.close();
    }
}

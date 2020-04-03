package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                int number = scanner.nextInt();

                if (number > max) {                     //因為沒有flag來判斷1st run
                                                        //因為不能判斷是不是1st run，所以要寫成兩個if statements
                                                        //因此兩邊都會判斷到 => right
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }

            scanner.nextLine();
        }

        System.out.println("The min is " + min);
        System.out.println("The max is " + max);
        scanner.close();
    }
}

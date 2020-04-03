package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count < 11) {

            System.out.println("Enter number #" + count + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {

                int number = scanner.nextInt();

                //scanner.nextLine();

                sum += number;
                count ++;                                //只有input correct number時, count才++
            } else {

                System.out.println("Invalid number");
                //scanner.nextLine();                      //加入此line => program才不會endless
                                                        //因為print出 "Invalid number"時, 其後有 /n => 所以又被program認為是 invalid input
                                                        // => endless => 所以用nextLine()解決
                                                        //id statement & else statement中都有 nextLine() => 其實nextLine()可以放到 if-else statement外 (只需要一個 nextLine())
            }

            scanner.nextLine();

        }
        System.out.println("The sum is " + sum);

        scanner.close();
    }
}

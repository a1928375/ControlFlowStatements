package com.company;

public class Main {

    public static void main(String[] args) {

        printSquareStar(8);

    }

    public static void printSquareStar (int number) {
        if (number < 5) {

            System.out.println("Invalid Value");

        } else {

            for (int row = 1; row <= number; row++){

                for (int column = 1; column <= number; column++){

                    if (row == 1 || column == 1 || column == row || column + row == number + 1 || row == number || column == number ) {
                      // top row     left column   diagonal line       another diagonal line      bottom row          right column
                        System.out.print("*");

                    } else {

                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}


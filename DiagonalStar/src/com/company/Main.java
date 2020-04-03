package com.company;

public class Main {

    public static void main(String[] args) {

        printSquareStar(5);
        printSquareStar(8);

    }

    public static void printSquareStar (int number) {

        int i = 1;
        int j = 1;

        if (number < 5) {

            System.out.println("Invalid Value");
        } else {

            while (j <= number) {                        //Ex:number=8

                if (i == 1 && j != 1 && j != number) {   //for (j=2) ~ (j=7) 的 all (i=1) cubes

                    System.out.print("*");              //不分行
                }

                while (i <= number) {

                    if (j == 1) {                       //for (j=1) 的 (i=1) ~ (i=8) cubes

                        System.out.print("*");          //不分行
                    } else if (j == i || (j+i == number+1)) {             //for j=i (diagonal cubes)     or     另一 diagonal的cubes (Ex: 36 cube & 63 cube)

                        System.out.print("*");                            //不分行
                    } else if (j == number || (i == number && j != number )) {      //for j=8 的 all cubes     or   i=8 的 all cubes (skip overlapping)

                        System.out.print("*");                            //不分行
                    } else if (j > 1 && j < number && i > 1 && i < number) {  //deal with all cubes except edge cubes (no edge), because edge cubes
                                                                              //have been dealt with above if-else statement
                        System.out.print(" ");                            ////these cubes 不需要 * => 不分行，但要加spaces
                    }

                    i++;
                }

                System.out.println("");    //每 end 一行 j => 分行
                i = 1;                     //let i start over => from the leftmost cube of each line

                j++;
            }
        }
    }
}

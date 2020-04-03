package com.company;

public class Main {

    public static void main(String[] args) {

//        numberToWords(235);
//        numberToWords(100);
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(0);
        numberToWords(-12);
        System.out.println(reverse(123));
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
        int digit = getDigitCount(number);

        for (int i = 0; i < digit; i++) {   //因為是用getDigitCount(number)當作判斷條件，所以numberToWords(int number)中不需要寫 else if (number == 0) 的判斷式來判斷number == 0
                                            //而且,最下面不需要寫 增加 "Zero" 的 for loop, 因為這裡的for loop直接由getDigitCount(number)控制 (有幾個digit(s),就會run幾次 => "Zero"直接print出)

            switch (reverseNumber % 10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            reverseNumber /= 10;
        }

        System.out.println();
    }

    public static int reverse(int number) {

        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }
}

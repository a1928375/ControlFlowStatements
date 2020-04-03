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

    public static void numberToWords (int number) {

        int i = 0;
        int temp = 0;

        if (number < 0) {

            System.out.println("Invalid Value");
        } else if (number == 0) {

            System.out.println("Zero");
        } else {

            int result = reverse(number);
            int forZero = result;

            while (result > 0 ) {

                temp = result % 10;

                switch (temp) {

                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

                result /= 10;
            }

            int original = getDigitCount(number);
            int reversed = getDigitCount(forZero);

            if ( original !=  reversed) {

                for (int j = 0; j < (original-reversed); j++) {

                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse (int parameter) {

        //123

        int temp = 1;
        int result = 0;

        while (parameter != 0) {

            result *= 10;
            temp = parameter % 10;

            result += temp;

            parameter /= 10;
        }

        return result;
    }

    public static int getDigitCount (int number) {

        int count = 0;

        if (number < 0) {

            return  -1;
        } else if (number == 0) {

            return 1;
        } else {

            while (number > 0) {

                count ++;
                number /= 10;
            }

            return count;
        }
    }
}

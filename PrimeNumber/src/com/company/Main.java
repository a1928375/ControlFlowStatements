package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 1;

        for (int j = 1; j <= 100; j++) {

            if (isPrine(j) == true) {

                System.out.println(j);
                count += 1;

            }

            if ((count -1) == 3) {

                break;
            }
        }

    }

    public static boolean isPrine (int n) {

        if (n == 1) {

            return false;
        }

        for (int i = 2; i <= n/2 ; i++) {
        //for (int i = 2; i <= (long) Math.sqrt(n) ; i++) { => faster because it checks less numbers

            if (n % i == 0) {

                return false;
            }
        }

        return true;
    }
}

package com.company;

public class Recap {

    public static void main(String[] args) {

        int digit = 0;

        while (digit < 15) {
            digit++;

            if (digit <= 5) {
                System.out.println("Skipping " + digit);
                continue;
            }
            System.out.println("digit = " + digit);

            if (digit >= 10) {
                System.out.println("Breaking at " + digit);
                break;
            }

        }
    }
}

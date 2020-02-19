package com.company;

public class Recap {

    public static void main(String[] args) {

        int digit = 0;

        while (true) {
            digit++;

            if (digit <= 5) {
                System.out.println("Skipping " + digit);
                continue;
            }
            System.out.println("number = " + digit);

            if (digit >= 10) {
                System.out.println("Breaking at " + digit);
                break;
            }

        }
    }
}

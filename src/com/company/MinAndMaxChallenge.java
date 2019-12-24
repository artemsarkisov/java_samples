package com.company;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        while (scanner.hasNextInt()) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();

            if (min == 0 && max == 0) {
                min = number;
                max = number;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("min number: " + min + " max number : " + max);
        scanner.close();

    }
}


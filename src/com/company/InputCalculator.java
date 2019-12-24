package com.company;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
//        System.out.println("Enter a number:");
        while (scanner.hasNextInt()) {
//            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            sum += number;
            counter++;
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / counter));

    }
}

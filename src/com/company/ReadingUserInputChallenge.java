package com.company;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number #: " + i);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int num = scanner.nextInt();
                sum += num;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}

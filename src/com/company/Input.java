package com.company;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int birthYear = scanner.nextInt();
            int age = 2019 - birthYear;
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Your name is " + name + " and you are " + age + " years old");
        } else {
            System.out.println("Invalid data type");
            scanner.close();
        }


    }


}

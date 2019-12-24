package com.company;

import java.util.Scanner;

public class ReadingIntegers {

    private static Scanner scanner = new Scanner(System.in);

    public static void readIntegers(int count) {
        System.out.println("Enter " + count + " integer values:\r");
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " is " + array[i]);
        }
    }

    public static void main(String[] args) {
        readIntegers(3);
    }
}
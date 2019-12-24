package com.company;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(124567638));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = number % 10;
        while (number /10 > 0) {
            number /= 10;
        }
        return sum += number;
    }
}

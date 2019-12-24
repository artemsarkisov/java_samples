package com.company;

public class Digits {

    public static void main(String[] args) {
        System.out.println(sumDigits(133765));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number >0) {
            int leastDigit = number % 10;
            sum += leastDigit;
            number /= 10;
        }
        return sum;
    }
}

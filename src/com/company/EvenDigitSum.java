package com.company;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(19354687));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int temp = number % 10;
            number /= 10;
            if (temp % 2 != 0) {
                continue;
            }
            sum += temp;
        }
        return sum;
    }
}

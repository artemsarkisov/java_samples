package com.company;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-13531));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        if (number < 0) {
            number = number * -1;
        }
        int initNumber = number;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return initNumber == reverse;
    }
}

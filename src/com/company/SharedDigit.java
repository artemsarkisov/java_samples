package com.company;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int one, int two) {
        if (one < 10 || one > 99 || two < 10 || two > 99) {
            return false;
        }
        int num1 = one % 10;
        int num2 = one / 10;

        int num3 = two % 10;
        int num4 = two / 10;

        return num1 == num3 || num1 == num4 || num2 == num3 || num2 == num4;
    }
}

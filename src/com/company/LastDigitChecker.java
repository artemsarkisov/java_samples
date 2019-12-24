package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int one, int two, int three) {
        if (isValid(one) && isValid(two) && isValid(three)) {
            one %= 10;
            two %= 10;
            three %= 10;
            return one == two || one == three || two == three;
        }
        return false;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}

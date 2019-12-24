package com.company;

public class InterestRate {

    public static void main(String[] args) {

        for (int i = 8 ; i > 1; i--) {
            System.out.println(calculateInterest(10000.0, i));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}

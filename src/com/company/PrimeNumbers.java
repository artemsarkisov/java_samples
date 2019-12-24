package com.company;

public class PrimeNumbers {
    public static void main(String[] args) {

        for (int x = 1; x <= 100; x++) {
            if(isPrime(x)) {
                
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

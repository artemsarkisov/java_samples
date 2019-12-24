package com.company;

public class NumberToWords {

    public static void main(String[] args) {
//        System.out.println(reverse(1));
        numberToWords(001);
    }

    public static void numberToWords(int number) {

        number = reverse(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        while (number > 0) {
            int digit = number % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Something went wrong");
            }
            number /= 10;
        }

    }

    public static int reverse(int number) {
        int reverseNum = 0;
        int negative = 0;
        if (number < 0) {
            negative = number;
            number = number * -1;
        }
        while (number > 0) {
            int lastDigit = number % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            number /= 10;
        }
        if (negative < 0) {
            return reverseNum * (-1);
        }
        return reverseNum;
    }

//    public static int getDigitCount(int number) {
//        if (number < 1) {
//            return -1;
//        }
//
//        while ()
//    }

}

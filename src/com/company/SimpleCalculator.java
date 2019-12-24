package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double number) {
        this.firstNumber = number;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public void setSecondNumber(double number) {
        this.secondNumber = number;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult() {
        return getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult() {
        return getFirstNumber() * getSecondNumber();
    }

    public double getDivisionResult() {
        if (getSecondNumber() == 0) {
            return 0;
        }
        return getFirstNumber() / getSecondNumber();
    }


}

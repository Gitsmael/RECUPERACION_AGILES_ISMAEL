package main.java.com.ismael.calculator.modelo;

public class CalculatorModel {
    private double current = 0;
    private double memory = 0;
    private String operation = "n"; // s = sum, e = exp, n = none
    private int dotDigits = 0;

    public double getCurrent() {
        return current;
    }

    public void resetCurrent() {
        current = 0;
        dotDigits = 0;
        operation = "n";
    }

    public void addDigit(int digit) {
        if (dotDigits == 0) {
            current = current * 10 + digit;
        } else if (dotDigits < 10) {
            current += digit * Math.pow(10, -dotDigits);
            dotDigits++;
        }
    }

    public void addDot() {
        if (dotDigits == 0) dotDigits++;
    }

    public void setOperationSum() {
        if (operation.equals("s")) memory += current;
        else if (operation.equals("e")) memory = pow(memory, current);
        else memory = current;

        current = 0;
        dotDigits = 0;
        operation = "s";
    }

    public void setOperationExp() {
        if (operation.equals("s")) memory += current;
        else if (operation.equals("e")) memory = pow(memory, current);
        else memory = current;

        current = 0;
        dotDigits = 0;
        operation = "e";
    }

    public void calculateResult() {
        if (operation.equals("s")) current = memory + current;
        else if (operation.equals("e")) current = pow(memory, current);
        operation = "n";
        dotDigits = String.valueOf(current).split("\\.")[1].length() + 1;
    }

    public void calculateCircumference() {
        current = 2 * Math.PI * current;
        operation = "n";
        dotDigits = String.valueOf(current).split("\\.")[1].length() + 1;
    }

    public void calculateFactorial() {
        if (current % 1 != 0) throw new RuntimeException("n is not natural");
        if (current < 0) throw new RuntimeException("n is negative");
        int result = 1;
        for (int i = 2; i <= current; i++) result *= i;
        current = result;
        dotDigits = 0;
        operation = "n";
    }

    public String getDisplay() {
        return String.format("%." + (dotDigits == 0 ? 0 : dotDigits - 1) + "f", current);
    }

    private double pow(double b, double e) {
        if (e % 1 != 0 || e < 0) throw new RuntimeException("e is not natural");
        if (b == 0 && e == 0) throw new RuntimeException("0^0 is undefined");
        double r = b;
        for (int i = 1; i < e; i++) r *= b;
        return r;
    }
}
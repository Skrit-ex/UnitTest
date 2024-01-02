package org.example;

public class App {
    public static void main(String[] args) {
    Calculator calculator = new Calculator();

        int sum = calculator.calculate(12, 12, "sum");

        System.out.println(sum);
    }
}

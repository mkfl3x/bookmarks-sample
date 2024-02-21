package org.example;

import java.util.Scanner;

public class Calculator {

    public void start() {

        Scanner scanner = new Scanner(System.in);

        double num1, num2;

        char operator;

        System.out.print("First number: ");
        num1 = scanner.nextDouble();

        System.out.print("Operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Second number: ");
        num2 = scanner.nextDouble();

        double result = calculate(num1, operator, num2);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public double calculate(double num1, char operator, double num2) {

        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Error: Wrong operator");
        }

        return result;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int multiple(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }
}

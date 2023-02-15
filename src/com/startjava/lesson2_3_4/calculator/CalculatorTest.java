package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Введите математическое выражение: ");
            calculator.getExpression(scanner.nextLine());
            double result = calculator.calculate();
            System.out.print("Результат вычисления: ");
            if (result % 1 == 0) {
                System.out.printf("%.0f", result);
            } else {
                System.out.printf("%.2f", result);
            }
            System.out.println();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!"no".equals(answer));
    }
}
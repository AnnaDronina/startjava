package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            try {
                System.out.print("Введите математическое выражение: ");
                double result = Calculator.calculate(scanner.nextLine());
                System.out.print("Результат вычисления: ");
                if (result % 1 == 0) {
                    System.out.printf("%.0f", result);
                } else {
                    System.out.printf("%.2f", result);
                }
            } catch (Exception error) {
                System.out.println(error.getMessage());
                System.out.println("Введите корректное значение!");
            }
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!"no".equals(answer));
    }
}
package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            System.out.print("Введите математическое выражение: ");
            try {
                double result = Calculator.calculate(scanner.nextLine());
                System.out.print("Результат вычисления: ");
                if (result % 1 == 0) {
                    System.out.printf("%.0f", result);
                } else {
                    System.out.printf("%.2f", result);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage() + "\nВведите корректное значение!");
            }

            if (answer.equals("yes")) {
                System.out.print("\nХотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
            }
        } while (!"no".equals(answer));
    }
}
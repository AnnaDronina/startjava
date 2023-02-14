package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());

            System.out.print("Введите знак математической операции: ");
            calculator.setSign(scanner.next().charAt(0));

            System.out.print("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());

            System.out.println("Результат вычисления: " + calculator.calculate());

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}
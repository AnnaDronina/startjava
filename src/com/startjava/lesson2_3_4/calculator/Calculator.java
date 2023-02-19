package com.startjava.lesson2_3_4.calculator;

public class Calculator {

    private static int num1;
    private static int num2;
    private static char sign;

    public static void setNum1(int num1) {
        Calculator.num1 = num1;
    }

    public static void setNum2(int num2) {
        if ((sign == '/' || sign == '%') && num2 == 0) {
            throw new RuntimeException("Делить на 0 нельзя!");
        }
        Calculator.num2 = num2;
    }

    public static void setSign(char sign) {
        Calculator.sign = sign;
    }

    public static double calculate(String expression) {
        splitExpression(expression);
        return switch(sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            case '^' -> Math.pow(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            default -> throw new RuntimeException("Операция " + sign + " не найдена");
        };
    }

    private static void splitExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        if (!partsExpression[0].matches(" ?\\d+") || !partsExpression[2].matches(" ?\\d+")) {
            throw new RuntimeException("Введите целое положительное число!");
        }
        setNum1(Integer.parseInt(partsExpression[0]));
        setSign(partsExpression[1].charAt(0));
        setNum2(Integer.parseInt(partsExpression[2]));
    }
}

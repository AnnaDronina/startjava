package com.startjava.lesson2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        if ((sign == '/' || sign == '%') && num2 == 0) {
            System.out.println("Делить на 0 нельзя!");
            return;
        }
        this.num2 = num2;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
        switch(sign) {
            case '+' :
                return num1 + num2;
            case '-' :
                return num1 - num2;
            case '/' :
                return num1 / num2;
            case '%' :
                return num1 % num2;
            case '^' :
                int result = 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                return result;
            case '*' :
                return num1 * num2;
            default :
                return 0;
        }
    }
}

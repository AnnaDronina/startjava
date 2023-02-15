package com.startjava.lesson2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        if ((sign == '/' || sign == '%') && num2 == 0) {
            System.out.println("Делить на 0 нельзя!");
            return;
        }
        this.num2 = num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void getExpression(String expression) {
        String[] expressionArray = expression.split(" ");
        setNum1(Integer.parseInt(expressionArray[0]));
        setNum2(Integer.parseInt(expressionArray[2]));
        setSign(expressionArray[1].charAt(0));
    }

    public double calculate() {
        switch(sign) {
            case '+' :
                return  Math.addExact(num1, num2);
            case '-' :
                return Math.subtractExact(num1, num2);
            case '/' :
                return Math.floorDiv(num1, num2);
            case '%' :
                return Math.floorMod(num1, num2);
            case '^' :
                return Math.pow(num1, num2);
            case '*' :
                return Math.multiplyExact(num1, num2);
            default :
                return 0;
        }
    }
}

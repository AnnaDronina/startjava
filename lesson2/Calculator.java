public class Calculator {

    private int num1;
    private int num2;
    private char sign;
    private int result;

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
        } else {
            this.num2 = num2;
        }
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        if (sign != '+' && sign != '-' && sign != '/' && sign != '%' && sign != '^' && sign != '*'){
            System.out.println("Неизвестная операция, программой не предусмотрена");
        } else {
            this.sign = sign;
        }
    }

    public int calculate() {
        switch(sign) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            case '%' :
                result = num1 % num2;
                break;
            case '^' :
                result = 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                break;
            case '*' :
                result = num1 * num2;
                break;
        }
        return result;
    }

}

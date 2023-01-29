public class Calculator {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        int result = 0;
        char sign = '+';

        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Делить на 0 нельзя!");
                return;
            }
        } else if (sign == '^') {
            result = 1;
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
        } else if (sign == '%') {
            if (num2 != 0) {
                result = num1 % num2;
            } else {
                System.out.println("Делить на 0 нельзя!");
                return;
            }
        } else {
            System.out.println("Неизвестная операция, программой не предусмотрена");
        }

        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}
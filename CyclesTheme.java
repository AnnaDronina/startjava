public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven +
                ", а нечетных = " + sumOdd);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = -1;
        int num2 = 5;
        int num3 = 10;
        int min = num1;
        int max = num1;

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i);
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр"); 
        num1 = 1234;
        int sum = 0;

        while (num1 > 0) {
            int digit = num1 % 10;
            sum += digit;
            num1 /= 10;
            System.out.print(digit);
        }
        System.out.println(" сумма цифр числа " + sum);

        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        num1 = 1;
        num2 = 24;
        int countDigits = 0;

        for (int i = num1; i < num2; i += 2) {
            if (countDigits == 5) {
                System.out.println();
                countDigits = 0;
            }
            System.out.printf("%4d", i);
            countDigits++;
        }
        countDigits = 5 - countDigits;
        for (int j = 1; j <= countDigits; j++) {
            System.out.printf("%4d", 0);
        }
        System.out.println();

        System.out.println("\n5.Проверка количества двоек на четность/нечетность");
        num1 = 3242592;
        int countTwos = 0;
        int copyNum1 = num1;

        while (copyNum1 > 0) {
            int digit = copyNum1 % 10;
            copyNum1 /= 10;

            if (digit == 2) {
                countTwos++;
            }
        }
        System.out.print("число " + num1 + " содержит ");
        if (countTwos % 2 == 0) {
            System.out.println( countTwos + " четное кол-во двоек");
        } else {
            System.out.println( countTwos + " нечетное кол-во двоек");
        }

        System.out.println("\n6.Отображение фигур в консоли");

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 10; j ++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int lineCount = 6;
        while (lineCount > 0) {
            int columnCount = 1;
            while (columnCount < lineCount) {
                System.out.print("#");
                columnCount++;
            }
            System.out.println();
            lineCount--;
        }

        lineCount = 1;
        boolean isMiddle = false;
        do {
            int columnCount = lineCount;
            do {
                System.out.print("$");
                columnCount--;
            } while (columnCount != 0);

            System.out.println();
            if (lineCount == 3) {
                isMiddle = true;
            }
            if (!isMiddle) {
                lineCount++;
            } else {
                lineCount--;
            }
        } while (lineCount != 0);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%4s %4s \n", "DEC" , "CHAR");

        boolean isNumber = false;
        boolean isSymbol = true;
        for (int i = 0; i <= 127; i++) {
            char symbol = (char) i;
            if (isSymbol) {
                isNumber = symbol >= '0' && symbol <= '9';
                if (!isNumber && i % 2 != 0) {
                    System.out.printf("%4d %4s \n", i , symbol);
                } else if (isNumber) {
                    isSymbol = false;
                }
            }
            
            boolean isSmallLetter = symbol >= 'a' && symbol <= 'z';
            if (isSmallLetter && i % 2 == 0) {
                System.out.printf("%4d %4s \n", i , symbol);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        num1 = 1234321;
        int reverse = 0;
        copyNum1 = num1;

        while (copyNum1 > 0) {
            int digit = copyNum1 % 10;
            reverse = reverse * 10 + digit;
            copyNum1 /= 10;
        }

        System.out.print("Число " + num1 + " является ");
        if (num1 == reverse) {
            System.out.println("палиндромом");
        } else {
            System.out.println("не палиндром");
        }

        System.out.println("\n9.Определение, является ли число счастливым");
        num1 = 123123;
        countDigits = 0;
        int sumLeft = 0;
        int sumRight = 0;
        copyNum1 = num1;

        while (num1 > 0) {
            sumLeft += num1 % 10;
            num1 /= 10;
            countDigits++;
            if (countDigits == 3) {
                sumRight = sumLeft;
                sumLeft = 0;
            }
        }
        int numberLeft = copyNum1 / 1000;
        int numberRight = copyNum1 % 1000;

        System.out.println("Сумма цифр "+ numberLeft + " = " + sumLeft);
        System.out.println("Сумма цифр "+ numberRight + " = " + sumRight);

        if (sumLeft == sumRight) {
            System.out.println("Счастливый");
        } else {
            System.out.println("Не счастливый");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора");

        for (int i = 1; i < 10; i++) {
            if (i != 1) {
                System.out.printf("%4d |", i);
            } else {
                System.out.printf("     |");
            }
            for (int j = 2; j < 10; j++) {
                System.out.printf("%4d", j * i);
            }
            if (i == 1) {
                System.out.print("\n---------------------------------------");
            }
            System.out.println();
        }

    }
}
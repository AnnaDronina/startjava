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
        int counterDigits = 0;

        for (int i = num1; i < num2; i+=2) {
            if (counterDigits == 5) {
                System.out.println();
                counterDigits = 0;
            }
            System.out.printf("%4d", i);
            counterDigits++;

            if (i == num2 - 1) {
                counterDigits = 5 - counterDigits;
                for (int j = 1; j <= counterDigits; j++) {
                    System.out.printf("%4d", 0);
                }
            }
        }

        System.out.println("\n5.Проверка количества двоек на четность/нечетность");
        num1 = 3242592;
        int count = 0;
        int tmp = num1;

        while (tmp != 0){
            int digit = tmp % 10;
            tmp /= 10;

            if (digit == 2) {
                count++;
            }
        }
        System.out.print("число " + num1 + " содержит ");
        if (count % 2 == 0) {
            System.out.println( count + " четное кол-во двоек");
        }else {
            System.out.println( count + " нечетное кол-во двоек");
        }

        System.out.println("\n6.Отображение фигур в консоли");

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 10; j ++ ) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();

        int i = 5;
        while (i > 0){
            int j = 1;
            while (j < i) {
                System.out.print("#");
                j++;
            }
            System.out.println("#");
            i--;
        }
        System.out.println();

        i = 1;
        boolean isMiddle = false;
        do {
            int j = i;
            do {
                System.out.print("$");
                j--;
            } while (j != 0);

            System.out.println();
            if (i == 3) {
                isMiddle = true;
            }
            if (!isMiddle) {
                i++;
            } else {
                i--;
            }
        } while (i != 0);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%4s %4s", "DEC" , "CHAR");
        System.out.println( );

        i = 0;
        boolean isNumber = false;
        while (isNumber != true) {
            char symbol = (char)i;
            isNumber = symbol >= '0' && symbol <= '9';
            if (isNumber == false && i % 2 != 0) {
                System.out.printf("%4d %4s", i , symbol);
                System.out.println( );
            }
            i++;
        }

        i = 0;
        for ( i = 0; i <= 127; i++) {
            char symbol = (char)i;
            boolean isSmallLetter = symbol >= 'a' && symbol <= 'z';
            if (isSmallLetter == true && i % 2 == 0) {
                System.out.printf("%4d %4s", i , symbol);
                System.out.println( );
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        num1 = 1234321;
        num2 = 0;
        tmp = num1;

        while (tmp > 0){
            int symbol = tmp % 10;
            num2 = num2 * 10 + symbol;
            tmp = tmp / 10;
        }

        System.out.print("Число " + num1 + " является ");
        if (num1 == num2) {
            System.out.println("палиндромом");
        }else {
            System.out.println("не палиндром");
        }

        System.out.println("\n9.Определение, является ли число счастливым");
        num1 = 123123;
        int step = 1;
        count = 0;
        sum = 0;
        int sum1 = 0;

        while (num1 != 0){
            sum += step * (num1 % 10);
            num1 /= 10;
            count++;
            if (count == 3) {
                step = 1;
                sum1 = sum;
                sum = 0;
            }
        }
        System.out.println("Сумма цифр " + sum + " = " + sum1);

        if (sum == sum1) {
            System.out.println("Счастливый");
        } else {
            System.out.println("Не счастливый");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора");

        for ( i = 1; i < 10; i++) {
            if ( i != 1) {
                System.out.printf("%4d |", i);
            }else {
                System.out.printf("     |");
            }
            for(int j = 2; j < 10; j++){
                System.out.printf("%4d", j * i);
            }
            if (i == 1) {
                System.out.print("\n---------------------------------------");
            }
            System.out.println("");
        }

    }
}
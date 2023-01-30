public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 27;
        char gender = 'Ж';
        float height = 1.82f;

        if (age > 20) {
            System.out.println("Возраст " + age + " больше 20");
        } else {
            System.out.println("Возраст " + age + " меньше 20");
        }
        if (gender != 'М') {
            System.out.println("Введенный пол = женский");
        } else {
            System.out.println("Введенный пол = мужской");
        }
        if (height < 1.80) {
            System.out.println("Рост меньше 180см");
        } else {
            System.out.println("Рост больше 180см");
        }
        char firstLetterName = "Анна".charAt(0);
        if (firstLetterName == 'М') {
            System.out.println("Первая буква имени - М");
        } else {
            System.out.println("Первая буква имени - " + firstLetterName + ", не М");
        }

        System.out.println("\n2.Поиск max и min числа");
        int num1 = 456;
        int num2 = 99;

        if (num1 < num2) {
            System.out.println("Максимум = " + num2 + "\nМинимум = " + num1);
        } else if (num1 > num2) {
            System.out.println("Максимум = " + num1 + "\nМинимум = " + num2);
        } else {
            System.out.println("Числа равны. Значение = " + num1);
        }

        System.out.println("\n3.Проверка числа");
        num1 = -1234;

        System.out.println("Число " + num1 + " является:");
        if (num1 != 0) {
            if (num1 % 2 != 0) {
                System.out.println("нечетным");
            } else {
                System.out.println("четным");
            }

            if (num1 > 0) {
                System.out.println("положительным");
            } else {
                System.out.println("отрицательным");
            }
        } else {
            System.out.println("нулем");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        num1 = 123;
        num2 = 224;

        int hundreds1 = num1 / 100; 
        int tens1 = num1 / 10 % 10; 
        int ones1 = num1 % 10; 

        int hundreds2 = num2 / 100; 
        int tens2 = num2 / 10 % 10; 
        int ones2 = num2 % 10;

        System.out.println("В числах " + num1 + " и " + num2);
        if (hundreds1 == hundreds2) {
            System.out.println("Одинаковые цифры 3-го разряда: " + hundreds1);
        }
        if (tens1 == tens2) {
            System.out.println("Одинаковые цифры 2-го разряда: " + tens1);
        }
        if (ones1 == ones2) {
            System.out.println("Одинаковые цифры 1-го разряда: " + ones1);
        }

        boolean equalNumbers = hundreds1 == hundreds2 || tens1 == tens2 || ones1 == ones2;
        if (!equalNumbers) {
            System.out.println("Одинаковых цифр нет");
        }

        System.out.println("\n5.Определение символа по его коду");
        char symbol = '\u0057';

        if (symbol >= 'a' && symbol <= 'z') {
           System.out.println("Маленькая буква " + symbol);
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Большая буква " + symbol);
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Число " + symbol);
        } else {
            System.out.println("Не буква и не число");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        int depositSum = 300000;
        int percent = 5;

        if (depositSum >= 100000 && depositSum <= 300000) {
            percent = 7;
        } else if (depositSum > 300000) {
            percent = 10;
        }

        int accruedPercent = ((depositSum * percent) / 100);
        int totalSum = accruedPercent + depositSum;
        System.out.println("Сумма вклада = " + depositSum + "\nначисленный % = " + accruedPercent + 
                "\nитоговую сумму с % = " + totalSum);

        System.out.println("\n7.Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyMark = 2;
        int programmingMark = 2;

        if (historyPercent > 60 && historyPercent <= 73) {
            historyMark = 3;
        } else if (historyPercent > 73 && historyPercent < 91) {
            historyMark = 4;
        } else if (historyPercent > 91) {
            historyMark = 5;
        }

        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingMark = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingMark = 4;
        } else if (programmingPercent > 91) {
            programmingMark = 5;
        }

        int markAverage = (historyMark + programmingMark) / 2;
        int percentAverage = (historyPercent + programmingPercent) / 2;
        System.out.println(historyMark + " История\n" + programmingMark + " Программирование\n" + 
                markAverage + " Средний балл оценок по предметам\n" + percentAverage + 
                " Средний процент по предметам");

        System.out.println("\n8.Расчет прибыли за год");
        int rentalPrice = 5000;
        int averageProfitSum = 13000;
        int costPrice = 9000;

        int yearProfit = (averageProfitSum - costPrice - rentalPrice) * 12;
        if (yearProfit > 0) {
            System.out.println("прибыль за год: +" + yearProfit + " руб.");
        } else {
            System.out.println("прибыль за год: " + yearProfit + " руб.");
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int sum = 567;
        int denomination100 = 10;
        int denomination10 = 5;
        int denomination1 = 50;

        int banknotesNumber100 = denomination100 - (sum / 100);
        int banknotesNumber10 = denomination10 - (sum / 10 % 10);
        int banknotesNumber1 = denomination1 - (sum % 10);

        if (banknotesNumber100 < 0) {
            if (banknotesNumber10 > 0) {
                banknotesNumber10 += banknotesNumber100 * 10;
                banknotesNumber100 = 0;
            } else {
                if (banknotesNumber1 > 0) {
                    banknotesNumber10 += banknotesNumber100 * 100;
                }
            }
        }

        if (banknotesNumber10 < 0) {
            if (banknotesNumber1 > 0) {
               banknotesNumber1 += banknotesNumber10 * 10;
                banknotesNumber10 = 0;
            }
        }

        banknotesNumber100 = denomination100 - banknotesNumber100;
        banknotesNumber10 = denomination10 - banknotesNumber10;
        banknotesNumber1 = denomination1 - banknotesNumber1;

        totalSum = (banknotesNumber100 * 100) + (banknotesNumber10 * 10) + (banknotesNumber1 * 1);

        System.out.println("Номинал 1 = " + banknotesNumber1 + "\nНоминал 10 = " + banknotesNumber10
                + "\nНоминал 100 = " + banknotesNumber100 + "\nВыдаваемая сумма = " + totalSum);
    }
}

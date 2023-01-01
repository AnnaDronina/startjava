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
        boolean isGenderMale = gender == 'М';
        if (!isGenderMale) {
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
        int max,min;

        if (num1 < num2) {
            max = num2;
            min = num1;
            System.out.println("Максимум = " + max + "\nМинимум = " + min);
        } else if (num1 > num2) {
            max = num1;
            min = num2;
            System.out.println("Максимум = " + max + "\nМинимум = " + min);
        } else {
            System.out.println("Числа равны. Значение = " + num1);
        }

        System.out.println("\n3.Проверка числа");
        num1 = -1234;

        if (num1 != 0) {
            boolean isEvenNumber = num1 % 2 == 0;
            if (!isEvenNumber) {
                System.out.println("Число " + num1 + " нечетное");
            } else {
                System.out.println("Число " + num1 + " четное");
            }

            if (num1 > 0) {
                System.out.println("Число " + num1 + " положительное");
            } else {
                System.out.println("Число " + num1 + " отрицательное");
            }
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        num1  = 123;
        num2 = 224;

        int hundreds = num1 / 100; 
        int tens = num1 / 10 % 10; 
        int ones = num1 % 10; 

        int hundreds1 = num2 / 100; 
        int tens1 = num2 / 10 % 10; 
        int ones1 = num2 % 10;

        System.out.println("В числах " + num1 + " и " + num2);
        if (hundreds == hundreds1) {
            System.out.println("Одинаковые цифры 3-го разряда: " + hundreds);
        }
        if (tens == tens1) {
            System.out.println("Одинаковые цифры 2-го разряда: " + tens);
        }
        if (ones == ones1) {
            System.out.println("Одинаковые цифры 1-го разряда: " + ones);
        }

        boolean isEqualNumber = hundreds == hundreds1 || tens == tens1 || ones == ones1;
        if (!isEqualNumber) {
            System.out.println("Одинаковых цифр нет");
        }

        System.out.println("\n5.Определение символа по его коду");
        char digit = '\u0057';

        if (digit >= 'a' && digit <= 'z') {
           System.out.println("Маленькая буква " + digit);
        } else if (digit >= 'A' && digit <= 'Z') {
            System.out.println("Большая буква " + digit);
        } else if (digit >= '0' && digit <= '9') {
            System.out.println("Число " + digit);
        } else {
            System.out.println("Не буква и не число");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        int depositSum = 300000;
        int percent = 0;
        int accruedPercent,totalSum;

        if (depositSum < 100000) {
            percent = 5;
        } else if (depositSum >= 100000 && depositSum <= 300000) {
            percent = 7;
        } else if (depositSum > 300000) {
            percent = 10;
        }

        accruedPercent = ((depositSum * percent)/100);
        totalSum = accruedPercent + depositSum;
        System.out.println("Сумма вклада = " + depositSum + "\nначисленный % = " + accruedPercent + 
                "\nитоговую сумму с % = " + totalSum);

        System.out.println("\n7.Определение оценки по предметам");
        int historyPercentage = 59;
        int programmingPercentage = 91;
        int historyMark = 0;
        int programmingMark = 0;

        if (historyPercentage <= 60) {
            historyMark = 2;
        } else if (historyPercentage > 60 && historyPercentage <=73) {
            historyMark = 3;
        } else if (historyPercentage > 73 && historyPercentage < 91) {
            historyMark = 4;
        } else if (historyPercentage > 91) {
            historyMark = 5;
        }

        if (programmingPercentage <= 60) {
            programmingMark = 2;
        } else if (programmingPercentage > 60 && programmingPercentage <=73) {
            programmingMark = 3;
        } else if (programmingPercentage > 73 && programmingPercentage <= 91) {
            programmingMark = 4;
        } else if (programmingPercentage > 91) {
            programmingMark = 5;
        }

        int gradePointAverage = (historyMark + programmingMark)/2;
        int percentageAverage = (historyPercentage + programmingPercentage)/2;
        System.out.println(historyMark + " История\n" + programmingMark + " Программирование\n" + 
                gradePointAverage + " Средний балл оценок по предметам\n" + percentageAverage + 
                " Средний процент по предметам");

        System.out.println("\n8.Расчет прибыли за год");
        int rentalPrice = 5000;
        int averageProfitSum = 13000;
        int costPrice = 9000;

        int yearProfit = (averageProfitSum - costPrice - rentalPrice) * 12;
        System.out.println("прибыль за год: " + yearProfit);

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
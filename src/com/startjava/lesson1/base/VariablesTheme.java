package com.startjava.lesson1.base;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("Переменные: примитивные типы данных");
        System.out.println("\n1.Вывод значений переменных на консоль");
        byte ram = 8;
        short systemType = 64;
        int hardDisk = 512;
        long busFrequency = 2666;
        float cpuSpeed = 1.8f;
        double weight = 1.32;
        char laptopModel = 'S';
        boolean bluetooth = true;

        System.out.println("Оперативная память:" + ram +
                "\nТип системы(разрядность):" + systemType +
                "\nОбъем диска:" + hardDisk +
                "\nЧастота шины:" + busFrequency + "МГц" +
                "\nТактовая частота CPU:" + cpuSpeed +
                "\nВес" + weight +
                "\nМодель ноутбука Lenovo ThinkBook 13" + laptopModel +
                "\nНаличие Bluetooth:" + bluetooth);

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;

        float discountSum = ((penPrice + bookPrice) * discount) / 100;
        float discountPrice = (penPrice + bookPrice) - discountSum;

        System.out.println("Cумма скидки:" + discountPrice +
                "\nОбщая стоимость товаров со скидкой:" + discountSum);

        System.out.println("\n3.Вывод слова JAVA");
        System.out.println("   J    a  v     v  a\n" +
                "   J   a a  v   v  a a\n" + 
                "J  J  aaaaa  V V  aaaaa\n" + 
                " JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println("Byte:\n" + 
                "первоначальное значение:" + byteMax +
                "\nинкремент:" + ++byteMax +
                "\nдекремент:" + --byteMax );
        System.out.println("Short:\n" + 
                "первоначальное значение:" + shortMax +
                "\nинкремент:" + ++shortMax +
                "\nдекремент:" + --shortMax );
        System.out.println("Int:\n" + 
                "первоначальное значение:" + intMax +
                "\nинкремент:" + ++intMax +
                "\nдекремент:" + --intMax );
        System.out.println("Long:\n" + 
                "первоначальное значение:" + longMax +
                "\nинкремент:" + ++longMax +
                "\nдекремент:" + --longMax );

        System.out.println("\n5.Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;

        System.out.println("с помощью третьей переменной:\n" + 
                "первоначальное значение num1 = " + num1 + " num2 = " + num2 );
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("новое значение num1 = " + num1 + " num2 = " + num2 );

        System.out.println("с помощью арифметических операций:\n" + 
                "первоначальное значение num1 = " + num1 + " num2 = " + num2 );
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("новое значение num1 = " + num1 + " num2 = " + num2 );

        System.out.println("с помощью побитовой операции:\n" + 
                "первоначальное значение num1 = " + num1 + " num2 = " + num2 );
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("новое значение num1 = " + num1 + " num2 = " + num2 );

        System.out.println("\n6.Вывод символов и их кодов");
        System.out.println("Код символа " + (int)'#' +" символ " + '#' +
                "\nКод символа " + (int)'&' + " символ " + '&' +
                "\nКод символа " + (int)'@' + " символ " + '@' +
                "\nКод символа " + (int)'^' + " символ " + '^' +
                "\nКод символа " + (int)'_' + " символ " + '_');

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';

        System.out.println("    " + slash + backSlash + "\n   " +
                slash + "  " + backSlash + "\n  " + 
                slash + underscore + openParenthesis + " " + closeParenthesis + backSlash + "\n " +
                slash + "      " + backSlash + "\n" +
                slash + underscore + underscore + underscore + underscore + slash + backSlash + 
                underscore + underscore + backSlash );

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int num  = 123;

        int hundreds = num / 100; 
        int tens = num / 10 % 10; 
        int ones = num % 10; 

        System.out.println("Число " + num + " содержит \n" + hundreds + " сотен\n" + tens + 
                " десятков\n" + ones + " единиц");

        int sumDigits = hundreds + tens + ones;
        System.out.println("Сумма его цифр = " + sumDigits);
        int prodDigits = hundreds * tens * ones;
        System.out.println("Произведение = " + prodDigits);

        System.out.println("\n9.Вывод времени");
        int totalSeconds = 86399;

        int hours = totalSeconds / 3600;
        int minutes = totalSeconds / 60 % 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}

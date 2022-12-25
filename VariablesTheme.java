public class VariablesTheme{

    public static void main(String[] args){
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
            int penCost = 100;
            int bookCost = 200;
            int discount = 11;

            float totalCost = ( ( penCost + bookCost) * discount ) / 100;
            float amountDiscount = ( penCost + bookCost ) - totalCost;

            System.out.println("Cумма скидки:" + amountDiscount +
                "\nОбщая стоимость товаров со скидкой:" + totalCost);

        System.out.println("\n3.Вывод слова JAVA");
            System.out.println("   J    a  v     v  a           \n" +
                "   J   a a  v   v  a a            \n" + 
                "J  J  aaaaa  V V  aaaaa      \n" + 
                " JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
            byte byteType = Byte.MAX_VALUE;
            short shortType = Short.MAX_VALUE;
            int intType = Integer.MAX_VALUE;
            long longType = Long.MAX_VALUE;
                System.out.println("Byte:\n" + 
                    "первоначальное значение:" + byteType +
                    "инкремент:" + ++byteType +
                    "декремент:" + --byteType );
                System.out.println("Short:\n" + 
                    "первоначальное значение:" + shortType +
                    "инкремент:" + ++shortType +
                    "декремент:" + --shortType );
                System.out.println("Int:\n" + 
                    "первоначальное значение:" + intType +
                    "инкремент:" + ++intType +
                    "декремент:" + --intType );
                System.out.println("Long:\n" + 
                    "первоначальное значение:" + intType +
                    "инкремент:" + ++intType +
                    "декремент:" + --intType );

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
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 -= num2;
            System.out.println("новое значение num1 = " + num1 + " num2 = " + num2 );

            System.out.println("с помощью побитовой операции:\n" + 
                    "первоначальное значение num1 = " + num1 + " num2 = " + num2 );
            num1 = num1 ^ num2;
            num2 = num2 ^ num1;
            num1 ^= num2;
            System.out.println("новое значение num1 = " + num1 + " num2 = " + num2 );

            System.out.println("\n6.Вывод символов и их кодов");
                char symbol = '#';
                int ascii = (int)symbol;
                System.out.println("Код символа " + ascii +" символ " + symbol);

                symbol = '&';
                ascii = (int)symbol;
                System.out.println("Код символа " + ascii +" символ " + symbol);

                symbol = '@';
                ascii = (int)symbol;
                System.out.println("Код символа " + ascii +" символ " + symbol);

                symbol = '^';
                ascii = (int)symbol;
                System.out.println("Код символа " + ascii +" символ " + symbol);

                symbol = '_';
                ascii = (int)symbol;
                System.out.println("Код символа " + ascii +" символ " + symbol);

            System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
                symbol = '/';
                char symbol1 = '\\';
                char symbol2 = '_';
                char symbol3 = '(';
                char symbol4 = ')';

                System.out.println("    " + symbol + symbol1 + "           \n" +
                        "   " + symbol + "  " + symbol1 + "       \n" + 
                        "  " + symbol + symbol2 + symbol3 + " " + symbol4 + symbol1 + "    \n" + 
                        " " + symbol + "      " + symbol1 + "   \n" +
                        symbol + symbol2 + symbol2 + symbol2 + symbol2 + symbol + symbol1 + 
                        symbol2 + symbol2 + symbol1 + " ");

            System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
                int num  = 123;

                num1 = num / 100;
                num2 = num / 10 % 10;
                num3 = num % 10;

                System.out.println("Число " + num + "содержит \n" + num1 + " сотен\n" + num2 + 
                    " десятков\n" + num3 + " единиц");

                    num = num1 + num2 + num3;
                System.out.println("Сумма его цифр = " + num);
                    num = num1 * num2 * num3;
                System.out.println("Произведение = " + num);

            System.out.println("\n9.Вывод времени");
                num = 86399;

                num1 = num / 3600;
                num2 = num / 60 % 60;
                num3 = num / 1 % 60;
                System.out.println(num1 + ":" + num2 + ":" + num3);
    }
}
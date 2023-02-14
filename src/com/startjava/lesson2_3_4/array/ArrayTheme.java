package com.startjava.lesson2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] numArray = {1, 2, 3, 4, 5, 6, 7};
        int length = numArray.length;

        System.out.println(Arrays.toString(numArray));

        for (int i = 0; i < length / 2; i++) {
            int tmp = numArray[i];
            numArray[i] = numArray[length - 1 - i];
            numArray[length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(numArray));

        System.out.println("\n2.Вывод произведения элементов массива");
        numArray = new int[10];
        length = numArray.length;
        for (int i = 0; i < length; i++) {
            numArray[i] = i;
        }

        int sum = 1;
        for (int i = 1; i < length - 1; i++) {
            sum *= numArray[i];
            System.out.print(numArray[i] + (i != length - 2 ? " * " : " = " + sum));
        }
        System.out.println("\nЗначение индекса 0 - " + numArray[0] + " индекса 9 -  " + numArray[9]);

        System.out.println("\n3.Удаление элементов массива");
        double[] doubleArray = new double[15];
        length = doubleArray.length;

        for (int i = 0; i < length; i++) {
            doubleArray[i] = Math.random();
        }
        print(doubleArray);

        int middleIndex = doubleArray.length / 2;
        int countNullValue = 0;

        for (int i = 0; i < length; i++) {
            if (doubleArray[i] > doubleArray[middleIndex]) {
                doubleArray[i] = 0;
                countNullValue++;
            }
        }
        print(doubleArray);
        System.out.println("Количество нулевых значений в массиве: " + countNullValue);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");
        char[] charArray = new char[26];
        length = charArray.length;
        for (int i = 0; i < length; i++) {
            charArray[i] = (char) (i + 65);
        }

        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(charArray[j]);
            }
            System.out.println();
        }

        System.out.println("\n5.Генерация уникальных чисел");
        numArray = new int[30];
        length = numArray.length;
        for (int i = 0; i < length; i++) {
            int num;
            do {
                num = (int) (60 + Math.random() * 40);
            } while (!checkNum(numArray, num));
            numArray[i] = num;
        }

        Arrays.sort(numArray);
        for (int i = 0; i < length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", numArray[i]);
        }
        System.out.println();

        System.out.println("\n6.Сдвиг элементов массива");
        String[] stringArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int countNotEmpty = 0;
        for (String line : stringArray) {
            if (!line.isBlank()) {
                countNotEmpty++;
            }
        }
        System.out.println(Arrays.toString(stringArray));

        String[] copyArray = new String[countNotEmpty];
        length = 0;
        int destPos = 0;
        int srcPos = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (!stringArray[i].isBlank()) {
                length++;
                if (srcPos == 0) {
                    srcPos = i;
                }
            } else if (length > 0) {
                System.arraycopy(stringArray, srcPos, copyArray, destPos, length );
                destPos += length;
                srcPos = 0;
                length = 0;
            }
        }
        System.out.println(Arrays.toString(copyArray));
    }

    private static void print(double[] doubleArray) {
        int length = doubleArray.length;
        for (int i = 0; i < length; i++) {
            if (i == length / 2 + 1) {
                System.out.println();
            }
            System.out.printf("%4.3f", doubleArray[i]);
        }
        System.out.println();
    }

    private static boolean checkNum(int[] numArray, int randomNum) {
        for (int number : numArray) {
            if (number == randomNum) {
                return false;
            }
        }
        return true;
    }
}

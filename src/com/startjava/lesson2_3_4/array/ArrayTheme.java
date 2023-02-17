package com.startjava.lesson2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int length = intArray.length - 1;

        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i < length; i++, length--) {
            int tmp = intArray[i];
            intArray[i] = intArray[length];
            intArray[length] = tmp;
        }
        System.out.println(Arrays.toString(intArray));

        System.out.println("\n2.Вывод произведения элементов массива");
        intArray = new int[10];
        length = intArray.length;
        for (int i = 0; i < length; i++) {
            intArray[i] = i;
        }

        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= intArray[i];
            System.out.print(intArray[i] + (i != length - 2 ? " * " : " = " + result));
        }
        System.out.println("\nЗначение индекса 0 - " + intArray[0] + " индекса 9 -  " + intArray[9]);

        System.out.println("\n3.Удаление элементов массива");
        double[] doubleArray = new double[15];
        length = doubleArray.length;

        for (int i = 0; i < length; i++) {
            doubleArray[i] = Math.random();
        }
        print(doubleArray);

        double middleCellValue = doubleArray[length / 2];
        int countZero = 0;

        for (int i = 0; i < length; i++) {
            if (doubleArray[i] > middleCellValue) {
                doubleArray[i] = 0;
                countZero++;
            }
        }
        System.out.println();
        print(doubleArray);
        System.out.println("Количество нулевых значений в массиве: " + countZero);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabetArray = new char[26];
        length = alphabetArray.length;
        for (int i = 0; i < length; i++) {
            alphabetArray[i] = (char) ('A' + i);
        }

        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(alphabetArray[j]);
            }
            System.out.println();
        }

        System.out.println("\n5.Генерация уникальных чисел");
        intArray = new int[30];
        length = intArray.length;
        for (int i = 0; i < length; i++) {
            int num;
            do {
                num = (int) (60 + Math.random() * 40);
            } while (!checkNum(intArray, num));
            intArray[i] = num;
        }

        Arrays.sort(intArray);
        for (int i = 0; i < length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", intArray[i]);
        }

        System.out.println("\n\n6.Сдвиг элементов массива");
        String[] srcArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int countNotBlank= 0;
        for (String line : srcArray) {
            if (!line.isBlank()) {
                countNotBlank++;
            }
        }
        System.out.println(Arrays.toString(srcArray));

        String[] destArray = new String[countNotBlank];
        length = 0;
        int destPos = 0;
        int srcPos = 0;
        for (int i = 0; i < srcArray.length; i++) {
            if (!srcArray[i].isBlank()) {
                length++;
                if (srcPos == 0) {
                    srcPos = i;
                }
            } else if (length > 0) {
                System.arraycopy(srcArray, srcPos, destArray, destPos, length);
                destPos += length;
                srcPos = 0;
                length = 0;
            }
        }
        System.out.println(Arrays.toString(destArray));
    }

    private static void print(double[] doubleArray) {
        int length = doubleArray.length;
        for (int i = 0; i < length; i++) {
            if (i == length / 2 + 1) {
                System.out.println();
            }
            System.out.printf("%6.3f", doubleArray[i]);
        }
        System.out.println();
    }

    private static boolean checkNum(int[] intArray, int randomNum) {
        for (int num : intArray) {
            if (num == randomNum) {
                return false;
            }
        }
        return true;
    }
}

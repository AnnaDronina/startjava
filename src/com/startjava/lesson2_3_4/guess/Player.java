package com.startjava.lesson2_3_4.guess;

import java.util.Arrays;
public class Player {

    private String name;
    private int[] numberArray = new int[10];
    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void setCountAttempts() {
        this.countAttempts++;
        if (countAttempts > 10) {
            throw new RuntimeException("У игрока " + name + " закончились попытки");
        }
    }

    public void setNumber(int number, int i) {
        numberArray[i-1] = number;
    }

    public int getNumber() {
        return numberArray[countAttempts - 1];
    }

    public void clearAttempts() {
        Arrays.fill(numberArray , 0, countAttempts, 0);
        countAttempts = 0;
    }

    public void printAttemptsNumber() {
        int[] ArrayCopy = Arrays.copyOf(numberArray, countAttempts);
        int length = ArrayCopy.length;
        for (int i = 0; i < length; i++) {
            if (i == length / 2) {
                System.out.println();
            }
            System.out.printf("%3d", ArrayCopy[i]);
        }
        System.out.println();
    }
}
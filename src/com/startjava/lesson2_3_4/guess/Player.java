package com.startjava.lesson2_3_4.guess;

import java.util.Arrays;

public class Player {

    private static final int ATTEMPTS_LIMIT = 10;
    private String name;
    private int[] numbers = new int[ATTEMPTS_LIMIT];
    private int countAttempts;
    private int countWins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void setCountWins() {
        countWins++;
    }

    public int getCountWins() {
        return countWins;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }

    public boolean addNumber(int number) {
        if (number > 0 && number <= 100) {
            numbers[countAttempts] = number;
            upCountAttempts();
            return true;
        }
        throw new RuntimeException("Введенное число не находится в полуинтервале (0, 100]");
    }

    private void upCountAttempts() {
        countAttempts++;
        if (countAttempts == ATTEMPTS_LIMIT) {
            throw new RuntimeException("У игрока " + name + " закончились попытки");
        }
    }

    public int getNumber() {
        return numbers[countAttempts - 1];
    }

    public void clearAttempts() {
        Arrays.fill(numbers , 0, countAttempts, 0);
        countAttempts = 0;
    }

    public void clearCountWins() {
        countWins = 0;
    }
}
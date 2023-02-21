package com.startjava.lesson2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    private int countAttempts;
    private int numberWins;

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
        countAttempts++;
        if (countAttempts == 10) {
            throw new RuntimeException("У игрока " + name + " закончились попытки");
        }
    }

    public void setNumberWins() {
        numberWins++;
    }

    public int getNumberWins() {
        return numberWins;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public boolean addNumber(int number) {
        if (number > 0 && number <= 100) {
            numbers[countAttempts] = number;
            setCountAttempts();
            return true;
        }
        throw new RuntimeException("Введенное число не находится в полуинтервале (0, 100]");
    }

    public int getNumber() {
        return numbers[countAttempts - 1];
    }

    public void clearAttempts() {
        Arrays.fill(numbers , 0, countAttempts, 0);
        countAttempts = 0;
    }

    public void clearNumberWins() {
        numberWins = 0;
    }
}
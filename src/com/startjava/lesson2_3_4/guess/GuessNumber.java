package com.startjava.lesson2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int hiddenNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Player currentPlayer = player1;
        generateHiddenNumber();
        clearPlayersAttempts();

        while (true) {
            guess(currentPlayer);
            if (currentPlayer.getNumber() > 0 && currentPlayer.getNumber() <= 100) {
                if (currentPlayer.getNumber() > hiddenNumber) {
                    System.out.println("Число " + currentPlayer.getNumber() +
                            " больше того, что загадал компьютер");
                } else if (currentPlayer.getNumber() < hiddenNumber) {
                    System.out.println("Число " + currentPlayer.getNumber() +
                            " меньше того, что загадал компьютер");
                } else {
                    System.out.println("Игрок " + currentPlayer.getName() + " угадал число " + hiddenNumber + " с "
                            + currentPlayer.getCountAttempts() + " попытки");
                    currentPlayer.printAttemptsNumber();
                    break;
                }
            } else {
                System.out.println("Введенное число не находится в полуинтервале (0, 100]");
            }
            currentPlayer = changePlayer(currentPlayer);
        }
    }

    private void generateHiddenNumber() {
        Random random = new Random();
        hiddenNumber = random.nextInt(100) + 1;
    }
    private void clearPlayersAttempts() {
        player1.clearAttempts();
        player2.clearAttempts();
        System.out.println("У каждого игрока по 10 попыток");
    }

    private void guess(Player currentPlayer) {
        currentPlayer.setCountAttempts();
        Scanner scanner = new Scanner(System.in);
        System.out.print(currentPlayer.getName() + " угадайте число :");
        currentPlayer.setNumber(scanner.nextInt(), currentPlayer.getCountAttempts());
    }

    private Player changePlayer(Player currentPlayer) {
        return currentPlayer == player1 ? player2 : player1;
    }
}
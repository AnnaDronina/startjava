package com.startjava.lesson2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int hiddenNumber;
    private Player[] players;
    private static final int ROUNDS_LIMIT = 3;
    private static final int ATTEMPTS_LIMIT = 10;

    public GuessNumber(Player ...players) {
        this.players = players;
    }

    public void play() {
        castLots();
        clearPlayersCountWins();
        int round = 0;
        while (round < ROUNDS_LIMIT) {
            round++;
            System.out.println("Раунд - " + round);
            generateHiddenNumber();
            clearPlayersAttempts();
            System.out.println("У каждого игрока по 10 попыток");

            int attempt = 1;
            boolean winner = true;
            while (attempt <= ATTEMPTS_LIMIT && winner) {
                for (Player player : players) {
                    winner = isGuessed(player);
                    if (!winner) {
                        break;
                    }
                }
                attempt++;
            }
        }
        printWinner();
    }

    private void castLots() {
        int length = players.length;
        for (int i = length - 1; i > 0; i--) {
            int j = (int) (Math.random() * i);
            Player temp = players[j];
            players[j] = players[i];
            players[i] = temp;
        }
        System.out.println("Порядок хода игроков: ");
        for (Player player : players) {
            System.out.print(' ' + player.getName());
        }
        System.out.println();
    }

    private void clearPlayersCountWins() {
        for (Player player : players) {
            player.clearCountWins();
        }
    }

    private void generateHiddenNumber() {
        Random random = new Random();
        hiddenNumber = random.nextInt(100) + 1;
    }

    private void clearPlayersAttempts() {
        for (Player player: players) {
            player.clearAttempts();
        }
    }

    private boolean isGuessed(Player player) {
        guess(player);

        if (player.getNumber() == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber + " с "
                    + player.getCountAttempts() + " попытки");
            player.setCountWins();
            printAttemptsNumber();
            return false;
        }

        String result = player.getNumber() > hiddenNumber ? " больше" : " меньше";
        System.out.println("Число " + player.getNumber() + result + " того, что загадал компьютер");
        return true;
    }

    private void guess(Player player) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(player.getName() + " угадайте число :");
            try {
                player.addNumber(scanner.nextInt());
                break;
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        }
    }

    private void printAttemptsNumber() {
        for(Player player : players) {
            System.out.println("Попытки игрока " + player.getName());
            int[] numbers = Arrays.copyOf(player.getNumbers(), player.getCountAttempts());
            int length = numbers.length;
            for (int i = 0; i < length; i++) {
                if (i == length / 2) {
                    System.out.println();
                }
                System.out.printf("%3d", numbers[i]);
            }
            System.out.println();
        }
    }

    private void printWinner() {
        int maxWin = 0;
        Player playerWin = players[0];
        for (Player player : players) {
            if (player.getCountWins() > maxWin) {
                maxWin =  player.getCountWins();
                playerWin = player;
            }
        }
        System.out.println("По результатам " + ROUNDS_LIMIT + " раундов, выиграл " + playerWin.getName() + " со счетом "
                + playerWin.getCountWins());
    }
}
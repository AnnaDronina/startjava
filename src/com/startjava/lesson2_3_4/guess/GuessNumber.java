package com.startjava.lesson2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int hiddenNumber;
    private Player[] players;
    private static int LIMIT_ROUNDS = 3;
    private static int LIMIT_ATTEMPTS = 10;

    public GuessNumber(Player ...players) {
        this.players = players;
        castLots();
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

    public void play() {
        clearPlayersNumberWin();
        int round = 0;
        while (round < LIMIT_ROUNDS) {
            round++;
            System.out.println("Раунд - " + round);
            generateHiddenNumber();
            clearPlayersAttempts();

            int attempt = 1;
            boolean winner = true;
            while (attempt <= LIMIT_ATTEMPTS && winner) {
                for (Player currentPlayer : players) {
                    winner = checkNumber(currentPlayer);
                    if (!winner) {
                        break;
                    }
                }
                attempt++;
            }
        }
        printWinner();
    }

    private void clearPlayersNumberWin() {
        for (Player currentPlayer : players) {
            currentPlayer.clearNumberWins();
        }
    }

    private void generateHiddenNumber() {
        Random random = new Random();
        hiddenNumber = random.nextInt(100) + 1;
    }

    private void clearPlayersAttempts() {
        for (Player currentPlayer : players) {
            currentPlayer.clearAttempts();
        }
        System.out.println("У каждого игрока по 10 попыток");
    }

    private boolean checkNumber(Player currentPlayer) {
        guess(currentPlayer);

        if (currentPlayer.getNumber() == hiddenNumber) {
            System.out.println("Игрок " + currentPlayer.getName() + " угадал число " + hiddenNumber + " с "
                    + currentPlayer.getCountAttempts() + " попытки");
            currentPlayer.setNumberWins();
            printAttemptsNumber(currentPlayer);
            return false;
        }

        String result = currentPlayer.getNumber() > hiddenNumber ? " больше" : " меньше";
        System.out.println("Число " + currentPlayer.getNumber() + result + " того, что загадал компьютер");
        return true;
    }

    private void guess(Player currentPlayer) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(currentPlayer.getName() + " угадайте число :");
            try {
                currentPlayer.addNumber(scanner.nextInt());
                break;
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        }
    }

    private void printAttemptsNumber(Player currentPlayer) {
        int[] ArrayCopy = Arrays.copyOf(currentPlayer.getNumbers(), currentPlayer.getCountAttempts());
        int length = ArrayCopy.length;
        for (int i = 0; i < length; i++) {
            if (i == length / 2) {
                System.out.println();
            }
            System.out.printf("%3d", ArrayCopy[i]);
        }
        System.out.println();
    }

    private void printWinner() {
        int maxWin = 0;
        Player playerWin = players[0];
        for (Player currentPlayer : players) {
            if (currentPlayer.getNumberWins() > maxWin) {
                maxWin =  currentPlayer.getNumberWins();
                playerWin = currentPlayer;
            }
        }
        System.out.println("По результатам " + LIMIT_ROUNDS + " раундов, выиграл " + playerWin.getName() + " со счетом "
                + playerWin.getNumberWins());
    }
}
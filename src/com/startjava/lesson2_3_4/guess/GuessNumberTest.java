package com.startjava.lesson2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final int COUNT_PLAYERS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayers(scanner));

        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                try {
                    game.play();
                } catch (RuntimeException e) {
                    System.out.println(e);
                }
            }
            System.out.print("Хотите продолжить игру? [yes/no]:");
            answer = scanner.next();
        } while (!answer.equals("no"));
    }

    private static Player[] createPlayers(Scanner scanner) {
        Player[] players = new Player[COUNT_PLAYERS];
        for (int i = 0; i < COUNT_PLAYERS; i++) {
            System.out.printf("Игрок %S введите имя: ", i + 1);
            players[i] = new Player(scanner.nextLine());
        }
        return players;
    }
}
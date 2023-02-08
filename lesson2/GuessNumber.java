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
        Random random = new Random();
        hiddenNumber = random.nextInt(100)+1;
        System.out.println(hiddenNumber);// убрать
        boolean winner = false;

        while (!winner) {
            guess(currentPlayer);
            if (currentPlayer.getNumber() > 0 && currentPlayer.getNumber() <= 100) {
                if (currentPlayer.getNumber() > hiddenNumber) {
                    System.out.println("Число " + currentPlayer.getNumber() + 
                            " больше того, что загадал компьютер");
                } else if (currentPlayer.getNumber() < hiddenNumber) {
                    System.out.println("Число " + currentPlayer.getNumber() + 
                            " меньше того, что загадал компьютер");
                } else {
                    System.out.println(currentPlayer.getName() + " Вы победили");
                    winner = true;
                }
            } else {
                System.out.println("Введенное число не находится в полуинтервале (0, 100]");
            }
            currentPlayer = playerChange(currentPlayer);
        }
    }

    private void guess(Player currentPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(currentPlayer.getName() + " угадайте число :"); 
        currentPlayer.setNumber(scanner.nextInt());
    }

    private Player playerChange(Player currentPlayer) {
        return currentPlayer == player1 ? player2 : player1;
    }

}
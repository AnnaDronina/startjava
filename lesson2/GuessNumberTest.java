import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answer;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Игрок 1 введите имя: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("Игрок 2 введите имя: ");
        Player player2 = new Player(scanner.nextLine());

        Random random = new Random();
        GuessNumber guessNumber = new GuessNumber(player1, player2);

        do {
            guessNumber.setHiddenNumber(random.nextInt(100)+1);
            System.out.println(guessNumber.getHiddenNumber()); //убрать потом
            guessNumber.startPlay();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}
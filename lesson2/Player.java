import java.util.Scanner;

public class Player {

    private String name;
    private int number;
    private boolean winner;

    public Player(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public boolean getWinner() {
        return winner;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void guess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + " угадайте число :"); 
        number = scanner.nextInt();
    }
}
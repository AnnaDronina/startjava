public class GuessNumber {

    private int hiddenNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public int getHiddenNumber() {
        return hiddenNumber;
    }

    public void setHiddenNumber(int hiddenNumber) {
        this.hiddenNumber = hiddenNumber;
    }

    private Player playerChange(Player currentPlayer) {
        if (currentPlayer == player1) {
            return player2;
        }
        return player1;
    }

    public void startPlay() {
        Player currentPlayer = player1;
        while (!currentPlayer.getWinner()) {
            currentPlayer.guess();
            if (currentPlayer.getNumber() > 0 && currentPlayer.getNumber() <= 100) {
                if (currentPlayer.getNumber() > hiddenNumber) {
                    System.out.println("Число " + currentPlayer.getNumber() + 
                            " больше того, что загадал компьютер");
                    currentPlayer = playerChange(currentPlayer);
                } else if (currentPlayer.getNumber() < hiddenNumber) {
                    System.out.println("Число " + currentPlayer.getNumber() + 
                            " меньше того, что загадал компьютер");
                    currentPlayer = playerChange(currentPlayer);
                } else {
                    System.out.println(currentPlayer.getName() + " Вы победили");
                    currentPlayer.setWinner(true);
                }
            } else {
                System.out.println("Введенное число не находится в полуинтервале (0, 100]");
                currentPlayer = playerChange(currentPlayer);
            }
        }
        currentPlayer.setWinner(false);
    }
}
public class GuessNumber {

    public static void main(String[] args) {
        int hiddenNum = 77;
        int randomNum = 33;

        if (randomNum == hiddenNum) {
            System.out.println("Вы победили");
        } else if (randomNum > hiddenNum && randomNum <= 100 ) {
            System.out.println("Число " + randomNum + " больше того, что загадал компьютер");
            while (randomNum != hiddenNum) {
                randomNum--;
                if (randomNum == hiddenNum) {
                    System.out.println("Вы победили");
                } else if (randomNum > hiddenNum) {
                    System.out.println("Число " + randomNum + " больше того, что загадал компьютер");
                }
            }
        } else if (randomNum < hiddenNum && randomNum > 0) {
            System.out.println("Число " + randomNum + " меньше того, что загадал компьютер");
            while (randomNum != hiddenNum) {
                randomNum++;
                if (randomNum == hiddenNum) {
                    System.out.println("Вы победили");
                } else if (randomNum < hiddenNum) {
                    System.out.println("Число " + randomNum + " меньше того, что загадал компьютер");
                }
            }
        } else if (randomNum > 100 || randomNum <=0) {
            System.out.println("Введенное число не находится в полуинтервале (0, 100]");
        }

    }
}
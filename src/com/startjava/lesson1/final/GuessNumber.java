package com.startjava.lesson1.finаl;

public class GuessNumber {

    public static void main(String[] args) {
        int hiddenNum = 77;
        int randomNum = 33;

        if (randomNum > 0 && randomNum <= 100) {
            while (randomNum != hiddenNum) {
                if (randomNum > hiddenNum) {
                    System.out.println("Число " + randomNum + " больше того, что загадал компьютер");
                    randomNum--;
                } else if (randomNum < hiddenNum) {
                    System.out.println("Число " + randomNum + " меньше того, что загадал компьютер");
                    randomNum++;
                }
            }
        } else {
            System.out.println("Введенное число не находится в полуинтервале (0, 100]");
            return;
        }
        System.out.println("Вы победили");

    }
}
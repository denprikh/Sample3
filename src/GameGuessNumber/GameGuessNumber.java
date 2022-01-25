package GameGuessNumber;

import java.util.Scanner;

public class GameGuessNumber {
    public static void main(String[] args) {
        //max value of guess number
        int maxNumber = 100;
        //generate guess number
        int guessNumber = (int) (Math.random() * (maxNumber + 1));
        //number of attempts
        int numOfAttempts = 10;

        System.out.println("Угадай число от 0 до " + maxNumber);

        for (int i = 1; i <= numOfAttempts; i++) {
            System.out.println(i + "-я попытка: ");
            int userInput = new Scanner(System.in).nextInt();
            if (userInput > guessNumber) {
                System.out.println("Неверно, загаданное число меньше");
            } else if (userInput < guessNumber) {
                System.out.println("Неверно, загаданное число больше");
            } else {
                System.out.println("Вы угадали!");
                break;
            }
        }
        System.out.println("Игра окончена! Загаданное число: " + guessNumber);
    }
}

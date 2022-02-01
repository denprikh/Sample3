package GameGuessNumber;

import java.util.Scanner;

public class GameGuessNumber {

    public static void main(String[] args) {
        int maxNumber = 100;
        int guessNumber = (int) (Math.random() * (maxNumber + 1));
        int numOfAttempts = 10;
        System.out.println("Угадай число от 0 до " + maxNumber);
        int userInput;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= numOfAttempts; i++) {
            System.out.println(i + "-я попытка: ");
            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число");
                sc.next();
            }
            userInput = sc.nextInt();
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

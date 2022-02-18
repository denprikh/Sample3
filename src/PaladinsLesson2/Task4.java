package PaladinsLesson2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int value1 = sc.nextInt();
        System.out.println("Введите второе число");
        int value2 = sc.nextInt();
        boolean statement1 = value1 > value2;
        boolean statement2 = value1 < value2;
        if (statement1) {
            System.out.println("Первое введённое число больше второго");
        } else if (statement2) {
            System.out.println("Первое введённое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }
    }
}

package PaladinsLesson2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean statement;
        int a, b;

        a = 10;
        b = 5;
        statement = a > b;
        System.out.println(statement);

        a = 50;
        b = 25;
        statement = a > b;
        System.out.println(statement);

        a = 67;
        b = 23;
        statement = a < b;
        System.out.println(statement);

        a = 90;
        b = 80;
        statement = a == b;
        System.out.println(statement);

        System.out.println("Enter a:");
        a = sc.nextInt();
        b = 60;
        statement = a == b;
        System.out.println(statement);

        a = 100;
        System.out.println("Enter b:");
        b = sc.nextInt();
        statement = a < b;
        if (statement) {
            System.out.println(statement);
        }

        b = 60;
        System.out.println("Enter a:");
        a = sc.nextInt() + b/2;
        statement = a == b;
        if (statement) {
            System.out.println(statement);
        }

        b = 146;
        System.out.println("Enter a:");
        a = sc.nextInt() + b/2;
        statement = a == b;
        if (statement) {
            System.out.println(statement);
        }
    }
}

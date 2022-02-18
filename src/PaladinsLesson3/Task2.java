package PaladinsLesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        System.out.println("Enter i:");
        int i = sc.nextInt();
        if (number < i) {
            printSomething(number, i);
        } else {
            System.out.println("number is greater or equals i");
        }
    }

    public static void printSomething(int number, int i) {
        while (number < i) {
            System.out.println("number is less than i");
            System.out.println("number = " + number + ",   i = " + i);
            number++;
        }
    }
}

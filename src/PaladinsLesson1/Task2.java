package PaladinsLesson1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1-st number");
        int value1 = sc.nextInt();
        System.out.println("Enter 2-nd number");
        int value2 = sc.nextInt();
        System.out.println("Sum = " + (value1 + value2));
        System.out.println("Difference = " + (value1 - value2));
        System.out.println("Multiply = " + (value1 * value2));
        System.out.println("Division = " + ((double) value1 / value2));
    }
}

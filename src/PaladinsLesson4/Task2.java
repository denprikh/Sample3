package PaladinsLesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start of range: ");
        int start = sc.nextInt();
        System.out.println("Enter end of range: ");
        int end = sc.nextInt();
        findEvenNum(start, end);
    }

    public static void findEvenNum(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

package PaladinsLesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to count recursion: ");
        int userInput = sc.nextInt();
        System.out.println(countRecursion(userInput));;
    }

    public static int countRecursion(int num) {
        int recursion = 1;
        for (int i = 1; i <= num; i++) {
            recursion *= i;
        }
        return recursion;
    }
}

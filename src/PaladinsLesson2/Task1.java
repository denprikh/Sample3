package PaladinsLesson2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int value = sc.nextInt();
        if (value > 10) {
            System.out.println("Number is greater than 10");
        } else if (value == 10) {
            System.out.println("Number is equal 10");
        } else {
            System.out.println("Number is less than 10");
        }
    }
}
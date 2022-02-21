package PaladinsLesson4;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter length of array:");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        invertArray(length);
    }

    public static void invertArray(int length) {
        String[] array = new String[length];
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill array:");
        for (int i = 0; i < length; i++) {
            System.out.println(i + 1 + " element: ");
            array[i] = sc.nextLine();
        }
        System.out.println("Initial Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nInverted array:");
        for (int i = array.length-1; i >=0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

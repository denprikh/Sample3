package PaladinsLesson4;

import java.util.Scanner;

public class Task4 {
    static String array[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter length of columns: ");
        int columns = sc.nextInt();
        fillArray(rows, columns);
        System.out.println("Initial Array:");
        printArray(array);
        invertArray(rows, columns);
    }

    public static void fillArray(int rows, int columns) {
        array = new String[rows][columns];
        Scanner sc = new Scanner(System.in);
        System.out.print("Fill array:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element[" + i + "]" + "[" + j + "]: ");
                array[i][j] = sc.nextLine();
            }
        }
    }

    public static void invertArray(int rows, int columns) {
        String[][] invertedArray = new String[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                invertedArray[i][j] = array[rows - 1 - i][columns - 1 - j];
            }
        }
        System.out.println("Inverted array: ");
        printArray(invertedArray);
    }

    public static void printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
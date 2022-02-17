package PaladinsLesson1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter surname");
        String surname = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Surname: " + surname);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

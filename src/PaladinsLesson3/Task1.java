package PaladinsLesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of month from 1 to 12:");
        String month = sc.nextLine();
        defineMonth(Integer.parseInt(month));
    }

    public static void defineMonth(int numberOfMonth) {
        switch (numberOfMonth) {
            case 1:
                System.out.println("Name of month with number " + numberOfMonth + " is January");
                break;
            case 2:
                System.out.println("Name of month with number " + numberOfMonth + " is February");
                break;
            case 3:
                System.out.println("Name of month with number " + numberOfMonth + " is March");
                break;
            case 4:
                System.out.println("Name of month with number " + numberOfMonth + " is April");
                break;
            case 5:
                System.out.println("Name of month with number " + numberOfMonth + " is May");
                break;
            case 6:
                System.out.println("Name of month with number " + numberOfMonth + " is June");
                break;
            case 7:
                System.out.println("Name of month with number " + numberOfMonth + " is July");
                break;
            case 8:
                System.out.println("Name of month with number " + numberOfMonth + " is August");
                break;
            case 9:
                System.out.println("Name of month with number " + numberOfMonth + " is September");
                break;
            case 10:
                System.out.println("Name of month with number " + numberOfMonth + " is October");
                break;
            case 11:
                System.out.println("Name of month with number " + numberOfMonth + " is November");
                break;
            case 12:
                System.out.println("Name of month with number " + numberOfMonth + " is December");
                break;
            default:
                System.out.println("Your number is out of range");
        }
    }
}

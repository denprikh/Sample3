package Lesson_03;

public class Lesson_03 {
    public static void main(String[] args) {
        int num = 0;
        switch (num) {
            case 1:
                System.out.println("Число равно 1");
                break;
            case 8:
                System.out.println("Число равно 8");
                break;
            case 9:
                System.out.println("Число равно 9");
                break;
            default:
                System.out.println("Число не равно 1, 8, 9");
        }
        comparisonsOperators(num);
        loops();

        int year = 85;
        while (year >= 0) {
            if (year % 4 == 0) {
                System.out.println("Високосный год: " + year);
            }
            year--;
        }
        System.out.println(magic(10));
    }

    public static void comparisonsOperators(int num) {
        if (num != 8 && num != 1 && num != 9) {
            System.out.println("Число не равно 1, 8 или 9");
        } else {
            System.out.println("Число равно 1, 8 или 9");
        }

        if (num == 0 || num == 1) {
            System.out.println("Число равно 0 или 1");
        } else {
            System.out.println("Число не равно ни 1, ни 0");
        }
    }

    public static void loops() {
        int counter = 1;
        while (counter < 100) {
            counter++;
            System.out.println(counter);
        }
    }
    public static int magic(int x) {
        return x == 10 ? 1 : 0;
    }
}
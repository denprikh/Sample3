package PaladinsLesson3;

public class Task3 {
    public static void main(String[] args) {

        int a = 5;
        System.out.println("Tests for a = " + a);
        System.out.println(checkFirstCondition(a));
        System.out.println(checkSecondCondition(a));
        a = 0;
        System.out.println("Tests for a = " + a);
        System.out.println(checkFirstCondition(a));
        System.out.println(checkSecondCondition(a));
        a = -3;
        System.out.println("Tests for a = " + a);
        System.out.println(checkFirstCondition(a));
        System.out.println(checkSecondCondition(a));
        a = 2;
        System.out.println("Tests for a = " + a);
        System.out.println(checkFirstCondition(a));
        System.out.println(checkSecondCondition(a));
    }

    public static String checkFirstCondition(int a) {
        return a == 0 || a == 2 ? String.valueOf(a + 7) : String.valueOf((double) a / 10);
    }

    public static String checkSecondCondition(int a) {
        return a > 0 && a < 5 ? "Верно" : "Неверно";
    }
}

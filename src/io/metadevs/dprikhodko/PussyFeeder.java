package io.metadevs.dprikhodko;

import java.util.Scanner;

public class PussyFeeder {

    static String[] namesOfCats = {"Том", "Кот в сапогах", "Леопольд", "Гарфилд", "Матроскин"};
    static int[] numOfFeeds = {1, 3, 4, 5, 0};
    static int minRangeOfFood = 0;
    static int maxRangeOfFood = 7;
    static int numberOfCats = namesOfCats.length;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int userInput;
        do {
            printCats();
            printMenu();

            userInput = checkInt();

            switch (userInput) {
                case 1:
                    addOrTakeAwaySingleCatFeed();
                    break;
                case 2:
                    addOrTakeAwayAllCatsFeed();
                    break;
                case 3:
                    addOrTakeAwayEvenOddCatsFeed();
                    break;
                default:
                    System.out.println("Введите доступную цифру меню\n");
                    break;
            }
        } while (userInput != 666);
    }

    public static void printCats() {
        for (int i = 0; i < namesOfCats.length; i++) {
            System.out.println(i + 1 + " - " + namesOfCats[i] + " : " + numOfFeeds[i] + " пакетиков");
        }
        System.out.println();
    }

    public static void printMenu() {
        System.out.println("Выберите, что вы хотите сделать:\n" +
                "1 - Добавить или убавить еды у конкретного кота\n" +
                "2 - Добавить или убавить еды у всех котов сразу\n" +
                "3 - Добавить или убавить еды у четных или нечетных котов\n" +
                "666 - Выйти из программы");
    }

    public static void addOrTakeAwaySingleCatFeed() {
        int catNumber = checkIndexOfSingleCat();
        System.out.println("Введите кол-во корма:\nОтрицательное число - отнять корм, \nПоложительное - прибавить");
        int inputOfFeed = checkInt();
        numOfFeeds[catNumber - 1] = checkPoolFeed(numOfFeeds[catNumber - 1], inputOfFeed);
    }

    public static void addOrTakeAwayAllCatsFeed() {
        System.out.println("Введите кол-во корма:\nОтрицательное число - отнять корм, \nПоложительное - прибавить");
        int feedValue = checkInt();
        for (int i = 0; i < namesOfCats.length; i++) {
            numOfFeeds[i] = checkPoolFeed(numOfFeeds[i], feedValue);
        }
    }

    public static void addOrTakeAwayEvenOddCatsFeed() {
        int parity = checkParity();
        System.out.println("Введите количество корма:\nОтрицательное число - отнять корм, " +
                "\nПоложительное - прибавить");
        int feedValue = checkInt();
        if (parity == 1) {
            for (int i = 0; i < namesOfCats.length; i++) {
                if ((i + 1) % 2 != 0) {
                    numOfFeeds[i] = checkPoolFeed(numOfFeeds[i], feedValue);
                }
            }
        } else if (parity == 2) {
            for (int i = 0; i < namesOfCats.length; i++) {
                if ((i + 1) % 2 == 0) {
                    numOfFeeds[i] = checkPoolFeed(numOfFeeds[i], feedValue);
                }
            }
        }
    }

    public static int checkInt() {
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели не число");
            sc.next();
        }
        return sc.nextInt();
    }

    private static int checkPoolFeed(int currentValueOfFood, int userInput) {
        if (currentValueOfFood + userInput <= minRangeOfFood) {
            return minRangeOfFood;
        }
        if (currentValueOfFood + userInput > minRangeOfFood && currentValueOfFood + userInput < maxRangeOfFood) {
            return currentValueOfFood + userInput;
        }
        return maxRangeOfFood;
    }

    private static int checkIndexOfSingleCat() {
        int catNumber;
        do {
            System.out.println("Выберите конкретного кота по номеру:");
            catNumber = checkInt();
        } while (!(catNumber - 1 >= 0 && catNumber - 1 <= numberOfCats));
        return catNumber;
    }

    private static int checkParity() {
        int parity;
        do {
            System.out.println("Введите четность котов:\n1 - нечетные коты, \n2 - четные коты");
            parity = checkInt();
        } while (!(parity == 1 || parity == 2));
        return parity;
    }
}

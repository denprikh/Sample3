package Lesson_04;

public class LessonFour {
    public static void main(String[] args) {
        int year = 1980;
        for (int j = 0; j < 6; j++) {
            System.out.println("Год " + year++);
        }

        int[] arr1 = new int[5];
        System.out.println(arr1[4]);
        arr1[3] = 67;
        for (int j = 0; j < arr1.length; j++) {
            System.out.println(arr1[j]);
        }

        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        arr2[3] = 67;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        for (int item : arr2)
            System.out.println(item);
    }
}

package lesson10.homework;

public class Exercise1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
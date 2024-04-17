package lesson10.classwork;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        int[] array = {17, 5, -6, 0, 1, 8};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            // de facut asa ca numerele sa iasa prin virgula
            // dar cu toate acestea dupa ultimul nr sa nu fie virgula
        }
        System.out.print("Enter value from array");

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                System.out.print("Index of value is: " + i);
            }
        }
        System.out.println("Element not found");
    }
}

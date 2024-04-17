package lesson09.homework;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float number = scanner.nextInt();
        if (number > 0) {
            System.out.println("This is a natural number");
        } else if (number <= 0) {
            System.out.println("Try again");
        } else {
            for (int i = 0; i < args.length; i++){
                System.out.println("Enter value for array");

            }
            System.out.println("This is not a natural number");
        }

    }
}

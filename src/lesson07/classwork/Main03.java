package lesson07.classwork;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        int days = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
                days = 31;
                break;
            case 2:
            case 4:
            case 6:
                days = 30;
                break;
            case 12:
                days = 28;


        }
        System.out.println(days);


    }
}
